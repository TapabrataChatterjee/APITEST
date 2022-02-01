package BDD.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/BDD/Features",
    glue = {"BDD.StepDefinition"}
)

public class TestRunner
{


    public void runTest()
    {

    }

}





