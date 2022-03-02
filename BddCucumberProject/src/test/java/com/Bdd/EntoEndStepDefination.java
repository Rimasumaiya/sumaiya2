package com.Bdd;

import java.util.List;
import java.util.Map;

import com.bdd.baseTest;
import com.bdd.homePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EntoEndStepDefination {
	baseTest b=new baseTest();
	homePage hp;
	shirtpage sp;
	
	@Given("^open any browser$")
	public void open_any_browser() throws Throwable {
	 b.openbrowser(); 
		
		
	}

	@Given("^go to url$")
	public void go_to_url() throws Throwable {
		hp=b.goToUrl();
	   
		
		
	}

	@When("^user hover over men menu$")
	public void user_hover_over_men_menu() throws Throwable {
		hp.hoverovermenmenu();
	   
	}

	@When("^user click shirt option$")
	public void user_click_shirt_option() throws Throwable {
		sp=hp.click();
	    
	}

	@When("^user click any shirt$")
	public void user_click_any_shirt() throws Throwable {
	 
	}

	@When("^user click quantity$")
	public void user_click_quantity(Object allcount) throws Throwable {
		 List<Map>String, Integer>> allcount = arg1.asMaps(String.class,Integer.class);
	    Integer c=allcount.get(1).get("count");
	}

	@When("^select all options$")
	public void select_all_options() throws Throwable {
	    
	}

	@When("^user click add to bag$")
	public void user_click_add_to_bag() throws Throwable {
	   
	}

	@Then("^user checkout$")
	public void user_checkout() throws Throwable {
	    
	}



}
