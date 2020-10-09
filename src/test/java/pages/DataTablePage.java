package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablePage {

    public DataTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button")
    public WebElement newButton;

    @FindBy(xpath = "(//input)[3]")
    public WebElement firstNameBox;

    @FindBy(xpath = "(//input)[4]")
    public WebElement lastNameBox;

    @FindBy(xpath = "(//input)[5]")
    public WebElement positionBox;

    @FindBy(xpath = "(//input)[6]")
    public WebElement officeBox;

    @FindBy(xpath = "(//input)[7]")
    public WebElement extentionBox;

    @FindBy(xpath = "(//input)[8]")
    public WebElement startDateBox;

    @FindBy(xpath ="(//input)[9]")
    public WebElement salaryBox;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement nameField;


}
