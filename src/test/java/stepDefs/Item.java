package stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.When;

public class Item {
	@BeforeAll
	public static void readfromDB() {
		System.out.println("Reading from databases");   //Before all
	}
	@Before
	public void setup() {
		System.out.println("Intialise the browaser before each scenario");  //Before each scenario
	}

	@When("User create an item")
	public void user_create_an_item() {
	    System.out.println("User create an item");
	}
	
	 @When("User update an item")
	  public void user_update_an_item() {
	        System.out.println("User update an item");
	    }
	
}
