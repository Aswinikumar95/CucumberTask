package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = { "com.AdactinBaseStepdefinition" }, tags = { "@smoke7" })

public class RunnerClassAdactinBase {

}
