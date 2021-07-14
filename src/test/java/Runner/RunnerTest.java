package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\Deepak\\ecllipse\\Training_CucumberFramework\\sample.feature"},
		monochrome=true,
		glue = {"StepDefination"},
		publish = true,
		tags = "@Smoke"
		
		
		
		
		
		)


public class RunnerTest {

}
