package BDD.CucumberOptions;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.core.cli.Main;


@SuppressWarnings("unused")
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/BDD/Features",
    glue = {"BDD.StepDefinition"}
)
public class TestRunner
{

    
    public void runTest()
    {
        System.out.println("This is start atgiven");


    }

}





