package ish.sms.admintest;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ISH_sms_ObjectRepositories.GradePage;
import ISH_sms_ObjectRepositories.HomePage;
import ISH_sms_ObjectRepositories.createGradePage;
import iSH_sms_generic_Utilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;




/*@Listeners(iSH_sms_generic_Utilities.ListnersImplementation.class)*/
public class CreateGradeTest extends BaseClass{
	
	@Test(groups= {"SmokeSuite","RegressionSuite"})

	public  void Create_GradeTest() throws Throwable {
	
		    
			int randomNum = jLib.getRandomNumber();
			
		// HomePage
			 HomePage homepage=new HomePage(driver);
		     homepage.GradeLink();
		     
		     GradePage gp =new GradePage(driver);
		     gp.clickongrade();
		     
		       createGradePage cgp =new createGradePage(driver);
		       
		       String gradename = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "grd", "tc_01", "value")+randomNum;
		       cgp.enterGradeNameEdt(gradename);
			    String amount     = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "grd", "tc_01", "fee")+randomNum;
			 cgp.enterAdmissionEdt( amount);
			 String value      = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "grd", "tc_01", "hallcharges");
			 cgp.enterHallChargeTxt(value);
			 
			 cgp.SubmitBtn();
		    String range      = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "grd", "tc_01", "range")+randomNum; 
		    cgp.enterRange(range); 
		    String A          = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "grd", "tc_01", "G")+randomNum;
		     cgp.enterGrade(A);
		    String marks1     = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "grd", "tc_01", "EDIT1")+randomNum;
		     cgp.enterMarks1(marks1);
		    String marks2     = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "grd", "tc_01", "EDIT2")+randomNum;

		       cgp.enterMarks1(marks2);
			  cgp.Submit();
		     
		    Thread.sleep(5000);
		   
		     
		
		
	/*	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click(); 
		
    //    driver.findElement(By.xpath("//span[text()='Grade']")).click();
		
       //  createGradesPage cgp=new createGradesPage(driver);
       //  cgp.enterGradeName(gradename);
		     
		     
		//STEP 4:CREATE GRADE
	//	driver.findElement(By.xpath("//span[text()='Grade']")).click();
		//Thread.sleep(3000);*/
		
		//STEP 5:ENTER NAME
	/*	Random r=new Random();
		int num=r.nextInt(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("Grade G"+""+num);
		
		//STEP 6:ENTER ADDMISSION FEE
		driver.findElement(By.xpath("//input[@placeholder='Enter admission fee']")).sendKeys("250");
		
		//STEP 7:ENTER HALL CHARGE
		driver.findElement(By.xpath("//input[@placeholder='Enter hall charge']")).sendKeys("15");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//STEP 8:IN SUBMIT POOUP ENTER THE DEATILS AND CLICK ON SUBMIT BUTTON
		driver.findElement(By.xpath("//input[@placeholder='75-100']")).sendKeys("85");
		driver.findElement(By.xpath("//input[@placeholder='A']")).sendKeys("c");
		driver.findElement(By.xpath("//button[@class='btn btn-info btnS']")).click();
		
	//	JavascriptExecutor jse=(JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0,2002);");     
		
		
	//	driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("Grade K");
		

		//FOR DELETE
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@data-id='16'])[1]/ancestor::td")).click();
		driver.findElement(By.xpath("(//button[@id='frm_cancel'])[2]")).click();
		
		//FOR EDIT
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[(text()='Edit')])[6]")).click();
		WebElement g=driver.findElement(By.id("name1"));
		g.clear();
		g.sendKeys("Grade K"+""+num);
		WebElement a=driver.findElement(By.id("admission_fee1"));a.clear();
		a.sendKeys(""+""+num);
		WebElement h=driver.findElement(By.id("hall_charge1"));
		h.clear();
		h.sendKeys(""+""+num);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//button[@id='btnSubmit1'])[2]")).click();  
		driver.findElement(By.xpath("(//button[@class=\"close\"])[23]")).click();
		//FOR VIEW MARKS
		
		driver.findElement(By.xpath("//a[text()='View eMark']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Add eMark']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("mark_range_text_1")).sendKeys("85");
		driver.findElement(By.id("mark_grade_text_1")).sendKeys("B"+""+num);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@style='width:100%;']")).click();
		
		
		
		
		//STEP  :SIGN OUT FROM THE APP
		//driver.findElement(By.xpath("//span[text()='Ingenious Developer1']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		

		/*step 4 :  logout*/
	    		  
       
		
        

	}

}
