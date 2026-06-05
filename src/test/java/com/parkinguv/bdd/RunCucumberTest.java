package com.parkinguv.bdd;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = "cucumber.plugin",
        value = "pretty"
)
public class RunCucumberTest {
}
