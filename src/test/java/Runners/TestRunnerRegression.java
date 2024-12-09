package Runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest or @SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
        ,plugin= {"json:target/cucumber/cucumber.json"} // Jenkins için JSON report
)
public class TestRunnerRegression {
}
