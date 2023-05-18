package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //feature: Path of the feature file, where feature file is available
        //features = "/Users/WE/IdeaProjects/SimpleBDDFramework/src/test/resources/Feature/Login.feature",
        //features = ".",tags = "@Login",//Specific Scenario
        //features = ".",tags = {"@Regression,@Sanity"},// OR, will select scenarios with regression and sanity
        //features = ".",tags = {"@Regression","@Sanity"},// AND will select only scenario which have both regression and sanity as tags
        //features = ".",tags = "~@Smoke",// will ignore the scenario which have smoke tags
        features = "/Users/WE/IdeaProjects/SimpleBDDFramework/src/test/resources/Feature/Register.feature",
        //glue: Path of the step definitions
        glue = {"StepDefinition"},
        //format: we can create different type of report and pretty output
        format = {"pretty","html:htmlReort","json:json/cucumber.json","junit:junit/cucumber.xml"}
        //dryrun= will help to do one to one mapping between feature file and step definitions
       //dryRun = true
        //monocrome: ddisplay the console output in proper readable format
        //monochrome = true,
        //strict: It will fail the execution if there are pending step or undefined steps. It will check if any step is not defined in step definition.
        //strict = true

)

public class TestRunner {
}
