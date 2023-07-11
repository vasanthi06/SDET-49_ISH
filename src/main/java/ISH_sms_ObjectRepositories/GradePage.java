package ISH_sms_ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GradePage {
	

	//Declaration
	 @FindBy(xpath= "//span[text()='Grade']")
	  private WebElement createGrade;
	 
	//Initialization
	public GradePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public WebElement getCreateOrgLookupImg() {
		return createGrade;
	}
	
	
	//business libraries
	public void clickongrade()
	{
		createGrade.click();
	}
	
	
	

}
