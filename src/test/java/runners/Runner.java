package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Where is the path of the feature folder
        features = "src/test/resources/features",
        //path of the step definitions folder
        glue = "stepdefinitions",
        tags = "@datatable",
        dryRun = false

)
public class Runner {
    //Runner class is to run the feature files
    // this runner class is also used to configure and control the framework

}
