package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class samplepage {
	WebDriver driver;
	@Before(order=1)
	public void lauchbrowser() {
		WebDriverManager.chromedriver().setup();
		 
		
	}
	
	@Before(order=2)
	public void chromedriver() {
		driver = new ChromeDriver();
		
	}

	
	
	@When("user enter url {string}")
	public void user_enter_url(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
		
		
	    
	}
	@When("user enter value in text field {string}")
	public void user_enter_value_in_text_field(String text) {
		
		
		
		driver.findElement(By.id("fname")).sendKeys(text);
		
	    
	}
	@When("user click sumbit button")
	public void user_click_sumbit_button() {
		
		driver.findElement(By.id("idOfButton")).click();
	    
	}
	
	
	@When(": user click alert box")
	public void user_click_alert_box() {
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
	}
	@When(": user click generate confirm box")
	public void user_click_generate_confirm_box() {
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click(); 
	}

	@After(order=2)
	public void Takescreenshot() throws IOException {
		System.out.println("after2");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Deepak\\ecllipse\\Training_CucumberFramework\\src\\image.png");
	   FileUtils.copyFile(src, dest);
		
	}
	
	@After(order=1)
	public void closebrowse() {
		System.out.println("after1");
		driver.close();
	}

}
