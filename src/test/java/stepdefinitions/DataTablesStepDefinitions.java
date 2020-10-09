package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablePage dataTablePage = new DataTablePage();

    @Given("user on the datatables page")
    public void user_on_the_datatables_page() {
        Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));


    }

    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablePage.newButton.click();

    }

    @When("user enters the firstname")
    public void user_enters_the_firstname() {
        dataTablePage.firstNameBox.sendKeys("software development engineering");

    }

    @When("user enters the lastname")
    public void user_enters_the_lastname() {
        dataTablePage.lastNameBox.sendKeys("quality assurance");

    }

    @When("user enters the position")
    public void user_enters_the_position() {
        dataTablePage.positionBox.sendKeys("tester");

    }

    @When("user enters the office")
    public void user_enters_the_office() {
        dataTablePage.officeBox.sendKeys("world");

    }

    @When("user enters the extention")
    public void user_enters_the_extention() {
        dataTablePage.extentionBox.sendKeys("sq12");

    }

    @When("user enters the startdate")
    public void user_enters_the_startdate() {
        dataTablePage.startDateBox.sendKeys("2020-11-20");

    }

    @When("user enters the salary")
    public void user_enters_the_salary() {
        dataTablePage.salaryBox.sendKeys("5000");

    }


    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablePage.createButton.click();

    }

    @When("search for the first name")
    public void search_for_the_first_name() {
        dataTablePage.searchBox.sendKeys("Bruno");

    }

    @Then("verify the name fields contains first name")
    public void verify_the_name_fields_contains_first_name() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains("Bruno"));

    }

}
