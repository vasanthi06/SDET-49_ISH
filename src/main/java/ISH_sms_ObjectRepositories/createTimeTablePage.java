package ISH_sms_ObjectRepositories;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iSH_sms_generic_Utilities.WebActionUtility;

public class createTimeTablePage {
	
	
	
	

	@FindBy(xpath="//a[@class='btn btn-success btn-sm pull-right']")private WebElement addT;
    @FindBy	(xpath="(//select[@class='form-control'])[2]") private WebElement day;
    @FindBy(xpath="//option[@value=Sunday']") private WebElement SelectDay;
    @FindBy(name="subject_id") private WebElement subject;
    @FindBy(name="subject_id") private WebElement SelectSubject;
    @FindBy(id="teacher")private WebElement teacher;
    @FindBy(xpath="//option[text()='Class k']") private WebElement Selectteacher;
    @FindBy(name="classroom_id") private WebElement classroom;
    @FindBy(name="classroom_id") private WebElement Selectclass;
   // @FindBy(name="start_time") private WebElement stime;
    @FindBy(name="start_time") private WebElement Selectstarttime;
   // @FindBy(name="end_time") private WebElement etime;
    @FindBy(name="end_time") private WebElement Selectendtime;
	@FindBy(id="btnSubmit")private WebElement SubmitT;
	@FindBy(xpath="//a[@class='confirm-delete btn btn-danger btn-xs']")private WebElement delete;
	@FindBy(xpath="(//button[text()='No'])[2]")private WebElement No;
	
	
	public createTimeTablePage(WebDriver driver)
	{
		PageFactory.initElements( driver , this);
	}
	

	public WebElement getAddT() {
		return addT;
	}
	
	public WebElement getday() {
		return day;
	}
    
    
	public WebElement getSelectDay() {
		return SelectDay;
	}
    

	public WebElement getSubject() {
		return subject;
	}


	public WebElement getSelectSubject() {
		return SelectSubject;
	}
    





		public WebElement getTeacher() {
		return teacher;
	}
		public WebElement getClassroom() {
			return classroom;
		}

		public WebElement getSelectteacher() {
		return Selectteacher;
	}


	public WebElement getSelectclass() {
		return Selectclass;
	}

        
	public WebElement getSelectstarttime(String time) {
		return Selectstarttime;
	}


	public WebElement getSelectendtime() {
		return Selectendtime;
	}


	public WebElement getSubmitT() {
		return SubmitT;
	}
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getNo() {
		return No;
	}
	

	public void AddT() {
		 addT.click();
	}
	public void day()
	{
		day.click();
	}
	public void SelectDAYfromdropdown(WebActionUtility wLib,String txt) {
		wLib.select(day, txt);
	}
	public void SelectSubjectfromdropdown(WebActionUtility wLib,String txt) {
		
		wLib.select(subject, txt);
	}
    public void Selectteacherfromdropdown(WebActionUtility wLib,String txt) {
		
		wLib.select(teacher, txt);
	}
    public void Selectclassroomfromdropdown(WebActionUtility wLib,String txt) {
		
		wLib.select(classroom, txt);
	}
              
   public void Selectstarttime(String time) {
	   Selectstarttime.sendKeys(time);
	   
   }

   public void Selectendtime(String time2) {
	  Selectendtime.sendKeys(time2);
   }
   
   
	public void SubmitT() {
		SubmitT.click();
	}
	public void Delete() {
		delete.click();
	}
	public void No() {
		 No.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
