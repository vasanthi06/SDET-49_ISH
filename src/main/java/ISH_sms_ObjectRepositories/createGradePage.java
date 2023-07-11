package ISH_sms_ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createGradePage {
	
	//INITIALIZATION
	
	 @FindBy(xpath="//input[@placeholder='Enter name']")
	 private WebElement GradeNameEdt;
	 
	
	@FindBy(xpath="//input[@placeholder='Enter admission fee']")
	private WebElement AdmissionEdt;
	
	@FindBy(xpath="//input[@placeholder='Enter hall charge']")
	private WebElement HallChargeTxt;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement SubmitBtn;
	
	
	@FindBy(xpath="//input[@placeholder='75-100']")
	private WebElement Range;
	
	@FindBy(xpath="//input[@placeholder='A']") private WebElement grade;
	
	@FindBy(xpath="//button[@class='btn btn-info btnS']") private WebElement submitc;
	
	
	@FindBy(id="mark_range_text_1")
	private WebElement Marks1;
	
	@FindBy(id="mark_grade_text_1")
	private WebElement Marks2;
	
	
	@FindBy(id="btnSubmit1")
	private WebElement Submit;
	
	public  createGradePage (WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getGradeNameEdt() {
		return GradeNameEdt;
	}

	public WebElement getAdmissionEdt() {
		return AdmissionEdt;
	}

	public WebElement getHallChargeTxt() {
		return HallChargeTxt;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	public WebElement getRange() {
		return Range;
	}
	public WebElement getGrade()
	{
		return grade;
		
	}
	public WebElement getsubmitc()
	{
		return submitc;
		
	}

	public WebElement getMarks1() {
		return Marks1;
	}

	public WebElement getMarks2() {
		return Marks2;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	//business lib
	public void enterGradeNameEdt(String gradeName) {
		GradeNameEdt.sendKeys(gradeName);
	}

	public void enterAdmissionEdt(String amount) {
		AdmissionEdt.clear();
		AdmissionEdt.sendKeys(amount);
	}

	public void enterHallChargeTxt(String value) {
		HallChargeTxt.sendKeys(value);;
	}
	
	public void SubmitBtn()
	{
		SubmitBtn.click();
	}public void enterRange(String range) {
		Range.clear();
		Range.sendKeys(range);
	}
	public void enterGrade(String A)	
	{
		 grade.sendKeys(A);
	}
	public void Submitc()
	{
		 submitc.click();
	}
	

	public void enterMarks1(String marks1) {
		Marks1.sendKeys(marks1);
	}
	public void enterMarks2(String marks2) {
		Marks2.sendKeys(marks2);
	}

	public void Submit() {
		 Submit.click();;
	}

	
	
	
}
