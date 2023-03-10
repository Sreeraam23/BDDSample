package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAppTest {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//		  	  
//	}
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String struser, String strpass) {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(struser);
//		driver.findElement(By.id("password")).sendKeys(strpass);
//		driver.findElement(By.className("radius")).click();
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable dataTable) {
//		//DAtatable as list
//		List<List<String>> data  = dataTable.asLists();
//		int size = data.size();
//		for(int i = 0;i<size;i++) {
//			String strusr = data.get(i).get(0);
//			String strpwd = data.get(i).get(1);
//			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strusr);
//			driver.findElement(By.id("password")).sendKeys(strpwd);
//			driver.findElement(By.className("radius")).click();
//		}
//		
//		
//	}
	@When("User enters credentials")
	public void user_enters_credentials(DataTable dataTable) {
		//Using data table as map
		List<Map<String,String>> data = dataTable.asMaps();
		int size = data.size();
		for(int i = 0;i< size;i++) {
			String strusr = data.get(i).get("username");
			String strpwd = data.get(i).get("password");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strusr);
			driver.findElement(By.id("password")).sendKeys(strpwd);
			driver.findElement(By.className("radius")).click();
		}
	}
	
	@Then("Should display Home Page")
	public void should_display_home_page() {
	    driver.findElement(By.id("flash")).isDisplayed();
	}
}
