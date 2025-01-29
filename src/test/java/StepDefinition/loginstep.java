package StepDefinition;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.LoginPage;

public class loginstep extends BaseClass {
	static LoginPage loginObj;
	@When("user enter valid userName as {string} and password as {string}")
	public void user_enter_valid_user_name_as_and_password_as(String Uname, String Pass) {
	  loginObj=new LoginPage();
	  loginObj.loginFunctionality(Uname, Pass);
	  
	  
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginObj.click();
	}
}
