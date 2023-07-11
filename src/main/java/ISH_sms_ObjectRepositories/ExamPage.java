package ISH_sms_ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExamPage {
	
	@FindBy(xpath="//a[text()='Create Exam']") 
	private WebElement createExam;
	
	 @FindBy(xpath="//a[@data-id='1']")private WebElement addexam;
	 
	 @FindBy(xpath="//input[@placeholder='Enter exam name']")private WebElement EnterName;
	 
	 @FindBy(xpath="//button[@id='btnSubmit']") private WebElement Click;
	 
	 @FindBy(xpath="//input[@type='search']")  private WebElement Search;
	 
	 @FindBy(xpath="//div/table/tbody/tr/td[2]")private WebElement actual;
	 
	 public ExamPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }


	

	public WebElement getCreateExam() {
		return createExam;
	}
    public WebElement getAddExam()
    {
    	return addexam;
    }
    
    public WebElement getExam()
    {
    	return EnterName;
    }
    public WebElement getSubmit()
    {
    	return Click;
    }
    
    
    public WebElement getActual() {
		return actual;
	}


	public WebElement getSearch() {
		return Search;
	}

	public void ClickonCreateExam()
	{
		createExam.click();
	}
	public void ClickOnAdd()
	{
		addexam.click();
	}
	public void EnterExam(String Exam)
	{
		EnterName.sendKeys(Exam);	
	}
	
	public void Submit()
	{
		Click.click();
	}
	public void search(String data)
	{
		Search.sendKeys(data);
	}
    
	public void result(String actualdata)
	{
	     actual.sendKeys(actualdata);
	}
}



