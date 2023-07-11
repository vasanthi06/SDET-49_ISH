package ISH_sms_ObjectRepositories;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@type='text']")  private WebElement USERname;
	@FindBy(xpath="//input[@type='password']") private WebElement PASSword;
	@FindBy(id="btnSubmit") private WebElement Submit;
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public WebElement getUSERname() {
		return USERname;
	}
	public WebElement getPASSword() {
		return PASSword;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	
	public void LoginPage(String username , String password)
	{
		USERname.sendKeys(username);
		PASSword.sendKeys(password);
		Submit.click();
	}

	

	
	  
	
	
	
}
