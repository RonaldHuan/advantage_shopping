package br.com.advantage.test.runners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import br.com.advantage.core.webdriver.utilities.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(features = "src/main/resources/features/login/realizarLoginAdvantageShopping.feature",
		plugin = {"pretty", "html:target/cucumber"},
		glue = "br.com.advantage.test"
)
public class RealizarLoginRunner extends AbstractTestNGCucumberTests {
	
	@AfterMethod
	public void tearDown() {
		BaseTest.finish();
	}
}
