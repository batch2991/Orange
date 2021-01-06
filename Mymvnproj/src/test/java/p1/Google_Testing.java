package p1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p1pages.Google;

public class Google_Testing 
{

	Google g=new Google();
	
	@Given("^user is on google home page$")
	public void user_is_on_google_home_page()
	{
		g.openurl();
	}
    @When("^enter any (.+) to search, click search$")
    public void enter_any_value_to_search_click_search(String searchword) throws Throwable 
    {
        g.search(searchword);
    }

    @Then("^display the results contains (.+)$")
    public void display_the_results_based_on_search_word(String searchword) throws Throwable
    {
       g.validate_title(searchword);
    }
    
    @Given("^user is on results page$")
    public void user_is_on_results_page() {
        System.out.println("user is on results page");
    }

    @When("^click on the first link$")
    public void click_on_the_first_link()  {
    	System.out.println("click on the link");
    }

    @Then("^navigate to a diff webpage based onthe link clicked$")
    public void navigate_to_a_diff_webpage_based_onthe_link_clicked()  {
    	System.out.println("validate the link");
    }   

}
