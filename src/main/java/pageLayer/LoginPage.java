package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class LoginPage extends BaseClass{

	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void loginFunctionality(String uname,String pass)
	{
		WebElementHelper.sendKeys(userName,uname );
		WebElementHelper.sendKeys(password,pass );
		
	}

	public void click()
	{
		WebElementHelper.click(login );
		
		
	}
}
