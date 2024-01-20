package cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = RunCucumberTest.PLUGIN_PROPERTY, value = RunCucumberTest.PLUGINS)

public class RunCucumberTest {
    public static final String PLUGIN_PROPERTY = "cucumber.plugin";
    public static final String PLUGINS =
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:,pretty,json:target/cucumber.json";

}
