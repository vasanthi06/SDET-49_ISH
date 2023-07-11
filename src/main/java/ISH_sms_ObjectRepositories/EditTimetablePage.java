package ISH_sms_ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iSH_sms_generic_Utilities.WebActionUtility;

public class EditTimetablePage {
	@FindBy(xpath="//a[text()='Edit']") private WebElement element;
	@FindBy(xpath="//a[text()='Edit']")private WebElement Update;
	@FindBy(name="day")private WebElement day;
	@FindBy(name="day")private WebElement selectfromday;
	@FindBy(name="subject_id")private WebElement subject ;
	@FindBy(name="subject_id")private WebElement selectfromsubject;
	@FindBy(name="teacher_id")private WebElement teacher;
	@FindBy(name="teacher_id")private WebElement selectfromteacher;
	@FindBy(name="classroom_id")private WebElement classroom;
	@FindBy(name="classroom_id")private WebElement selectfromclass;
	@FindBy(name="start_time")private WebElement startTime;
	@FindBy(name="end_time")private WebElement endTime;
	@FindBy(id="btnSubmit1")private WebElement Uclick;
	public WebElement getUclick() {
		return Uclick;
	}


	public EditTimetablePage(WebDriver driver) {

      PageFactory.initElements( driver,this);
	}
	
	
	public WebElement getElement() {
		return element;
	}


	public WebElement getUpdate() {
		return Update;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getSelectfromday() {
		return selectfromday;
	}
	public WebElement getSubj() {
		return subject;
	}
	public WebElement getSelectfromsubject() {
		return selectfromsubject;
	}
	public WebElement getTeacher() {
		return teacher;
	}
	public WebElement getSelectfromteacher() {
		return selectfromteacher;
	}
	public WebElement getClassroom() {
		return classroom;
	}
	public WebElement getSelectfromclass() {
		return selectfromclass;
	}
	public WebElement getStartTime() {
		return startTime;
	}
	public WebElement getEndTime() {
		return endTime;
	}
	
	//Business Library
	public void Editontimetable( ) 
	{
		
		Update.click();
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
	
	public void stime(String time1)
	{
		startTime.sendKeys(time1);
		
	}

	public void endTime(String time11)
	{
		endTime.sendKeys(time11);
		
	}
	
	public void Submitupdation()
	{
		Uclick.click();
	}
	
	

}
