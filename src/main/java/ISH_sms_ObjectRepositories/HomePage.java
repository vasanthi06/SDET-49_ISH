package ISH_sms_ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iSH_sms_generic_Utilities.WebActionUtility;

public class HomePage {
	
	
	//STEP 1:DECLARATION
	
	  @FindBy(xpath= "//span[text()='Grade']")
	  private WebElement GradeLink;
	
	  
	  @FindBy(xpath="//span[text()='Timetable']")
	  private WebElement TimetableLink;
     

	  @FindBy(xpath="//span[text()='Exam']")
	  private WebElement ExamLink; 
	  
	  @FindBy(xpath="//span[text()='My Student']") private WebElement StudentLink;
	  
	  @FindBy(xpath="//span[text()='Ingenious Developer1']")
	  private WebElement AdminLink;
	  
	  @FindBy(linkText = "Sign out")
	  private WebElement SignoutBt;
	  
	  
	  //STEP 2: CREATE A CONSTRUCTOR TO INITIALIZE THE WEBELEMENTS
	  
	  public HomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }


	public WebElement getGrade() {
		return GradeLink;
	}


	public WebElement getTimetable() {
		return TimetableLink;
	}


	public WebElement getExam() {
		return ExamLink;
	}
     
	public WebElement getStudent()
	{
		return StudentLink;
		
	}

	public WebElement getAdmin() {
		return AdminLink;
	}


	public WebElement getSignout() {
		return SignoutBt;
	}
	  

	//Buisness libraries
	public void GradeLink()
	{
		GradeLink.click();
	}
	
	
		public void ExamLink()
		{
			ExamLink.click();
		}
		
		public void TimetableLink()
		{
			TimetableLink.click();
		}
		public void StudentLink()
		{
			StudentLink.click();
		}
	
	public void signOut(WebDriver driver)
	{
		AdminLink.click();
		SignoutBt.click();
		
	}


	


	
	  
	   
}
