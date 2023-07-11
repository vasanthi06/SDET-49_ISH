package ISH_sms_ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iSH_sms_generic_Utilities.WebActionUtility;

public class TimetablePage {

	@FindBy(xpath="//option[text()='Select Grade']")private WebElement grade;
	@FindBy(xpath="//select[@id='grade']") private WebElement selgrade;
     @FindBy(xpath="//option[text()='Grade 2']") private WebElement selectgradefromdp;
  //  @FindBy(id = "grade")private WebElement selectgrade;
	
	@FindBy(xpath="//button[text()='Submit']")private WebElement submit;
	//@FindBy(xpath="//a[text()='Edit']")private WebElement edit;
	public TimetablePage(WebDriver driver)
	{
		PageFactory.initElements( driver , this);
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getSelgrade() {
		return selgrade;
	}
    public WebElement getSelectgradefromdp()
    {
    	return selectgradefromdp;
    }
	
	
	public WebElement getSubmit() {
		return submit;
	}
	//business library
	
	public void grade()
	{
		grade.click();
	}
    public void Selgrade() {
    	selgrade.click();
    }
    public void selectfromdropdown(WebActionUtility wLib,String txt)
    {
    	wLib.select(selgrade, txt);
    //	wLib.se
    	//selectgradefromdp.sendKeys(grade);
    }
    
	public void ClSubmit()
	{
		submit.click();
	}
}
