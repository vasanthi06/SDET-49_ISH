package ISH_sms_ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iSH_sms_generic_Utilities.WebActionUtility;

public class myStudentPage {
	
     @FindBy(xpath="//select[@name='grade']")private WebElement grade;
     @FindBy (xpath="(//select[@name='grade'])[1]") private WebElement stugrade;
     @FindBy(xpath="(//option[text()='Grade 1'])[1]")
       private WebElement selGrade;
     
     @FindBy(xpath="//button[text()='Submit']")
       private WebElement Submit;
     
     @FindBy(xpath="//input[@type='search']")
        private WebElement Search;
     
     @FindBy(xpath="(//a[text()='Edit'])[1]")private WebElement edit1;
     
     @FindBy(xpath="//input[@placeholder='Enter address']")
        private WebElement address;
     
     @FindBy(xpath="//input[@placeholder='Enter name with initials']")private WebElement initial;
     
     @FindBy(xpath="//a[text()='Upgrade Grade']")private WebElement UPDATE;
     @FindBy(id="btnYes1") private WebElement YES;
     
     @FindBy (xpath="(//select[@name='grade'])[2]") private WebElement GRADE;
     @FindBy(xpath="(//option[text()='Grade 1'])[2]")
       private WebElement gradeSELECT;
     
     @FindBy(xpath="//button[text()='Update']") private WebElement Update;
     
     
     @FindBy(xpath="(//button[text()='No'])[3]")private WebElement NO;
     @FindBy(xpath="//input[@id='checkbox2']") private WebElement chechk;
     
     
     
     
     
     
     
     
     
     
     
     @FindBy(xpath="(//input[@id='checkbox1'])[2]")
        private WebElement checkbox;
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     @FindBy(xpath="(//select[@class='form-control'])[2]")
        private WebElement Selectg;
    
     
     @FindBy(name="checkbox[]")
     private WebElement Checkbox2;
     
     @FindBy(xpath="//button[@onclick='upgradeGrade(this)']")
     private WebElement Upgrade;
     
     @FindBy(xpath="//span[@class='glyphicon glyphicon-remove'])[23]")
        private WebElement cancel;
     
     @FindBy(xpath="(//a[text()='Leave'])[1]")
        private WebElement leave;
     
     @FindBy(xpath="(//button[@id='frm_cancel'])[2]")
     private WebElement no;
     
     
     public  myStudentPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }


	


	public WebElement getGrade() {
		return grade;
	}





	public WebElement getStugrade() {
		return stugrade;
	}

	public WebElement getSelGrade() {
		return selGrade;
	}


	public WebElement getSubmit() {
		return Submit;
	}


	public WebElement getSearch() {
		return Search;
	}


	public WebElement getEdit1() {
		return edit1;
	}


	public WebElement getEditAddress() {
		return address;
	}
    

	public WebElement getInitial() {
		return initial;
	}


    


	public WebElement getUpdate() {
		return Update;
	}
     
	
	
 public WebElement getUPDATE() {
		return UPDATE;
	}

	
     
	
	
	public WebElement getNO() {
	return NO;
}





	public WebElement getYES() {
		return YES;
	}

    



	public WebElement getGRADE() {
		return GRADE;
	}





	public WebElement getGradeSELECT() {
		return gradeSELECT;
	}





	public void grade()
	{
		grade.click();
	}
	
	
	
	
	public void Stugrade()
	{
		stugrade.click();
	}
	
	public void selGrade(String stugrade)
    {
    	selGrade.sendKeys(stugrade);
  
    }
		
	
	

	public void Submit() {
		 Submit.click();
	}


	public void Search() {
		 Search.sendKeys("");
	}


	public void edit() {
		 edit1.click();
	}


	public void Edit(String addr) {
		 address.clear();
		 address.sendKeys(addr);
	}
    
	
	public void editInitials(String init)
	{
		initial.clear();
		initial.sendKeys(init);
	}

	public void updatestu()
	{
		Update.click();
	}
    
	
	public void gradeUpdate()
	{
		UPDATE.click();
	}
	
	public void NOupgrade()
	{
		NO.click();
	}
    
	public void upgradeYEs() {
		YES.click();
	}
	public void selectG()
	{
		GRADE.click();
	}
	public void selectClass(String name)
	{
		gradeSELECT.sendKeys(name);
        gradeSELECT.click();
	}
	
	public void Checksubject()
	{
		chechk.click();
	}
	
	
	public void tNo() {
		 no.click();
	}








	

}
