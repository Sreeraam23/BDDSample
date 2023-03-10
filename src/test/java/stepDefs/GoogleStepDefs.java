package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleStepDefs {
	WebDriver driver;
	@Given("User is on Google Home page")
	public void user_is_on_google_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();
	}
	@Then("Should display Java Result page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
		
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium Tutorial");
		searchBox.submit();
	}
	@Then("Should display Selenium Result page")
	public void should_display_selenium_result_page() {
		Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search Page");
	}
	@After
	public void attachimg(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot scr = (TakesScreenshot)driver;
			byte[]img = scr.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img, "image/png", "image");
		}
	}
}
