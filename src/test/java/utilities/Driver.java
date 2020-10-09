package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

// we need driver cause we want to have a single driver instance
public class Driver {

    private Driver(){
        // WE dont create on instance object
    }

    //create static driver instance
    //static because it can be used globally means i can use other class

    private  static WebDriver driver; //private to call this instance only in this class

    //create a public static method to instantiate the driver

    public static WebDriver getDriver(){

        //I want to instantiate the driver instance
        //if driver is not pointing anywhere
        //if the driver is already pointing somewhere (being used)
        //we want to have only one driver

        if (driver==null) {

            switch (ConfigReader.getProperty("browser")) {

                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":

                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "ie":

                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "chrome-headless" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }

        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){
        //close driver if it is not null
        //it means driver is pointing chrome (is being used)
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }

}
