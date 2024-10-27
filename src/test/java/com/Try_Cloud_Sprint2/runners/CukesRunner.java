package com.Try_Cloud_Sprint2.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/Try_Cloud_Sprint2/step_definitions",
        dryRun = true,
        tags = "@wip",
        publish = true //generating a report with public link
)
public class CukesRunner {}