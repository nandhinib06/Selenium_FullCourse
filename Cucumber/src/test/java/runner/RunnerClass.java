package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "feature/DataTableEg.feature", glue="stepdefinition")
@CucumberOptions(features = "feature/DataTablewithHeader.feature", glue="stepdefinition")
//@CucumberOptions(features = "feature/DataTablewithoutheader.feature", glue="stepdefinition")
//@CucumberOptions(features="feature/expression.feature", glue="stepdefinition")
//@CucumberOptions(features = "feature/loginWithData.feature", glue="stepdefinition")
//@CucumberOptions(features="feature/Login.feature", glue="stepdefinition")
//@CucumberOptions(features="feature/opengoogle.feature", glue="stepdefinition")
//@CucumberOptions(features = "feature/cucmber.feature", glue="Step_Defn")
public class RunnerClass {

}
