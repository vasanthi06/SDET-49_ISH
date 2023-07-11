package ish.sms.admintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ISH_sms_ObjectRepositories.ExamPage;
import ISH_sms_ObjectRepositories.HomePage;
import ISH_sms_ObjectRepositories.LoginPage;
import iSH_sms_generic_Utilities.BaseClass;
import iSH_sms_generic_Utilities.ExcelUtlity;
import iSH_sms_generic_Utilities.FileUtility;
import iSH_sms_generic_Utilities.JavaUtlity;
import iSH_sms_generic_Utilities.WebActionUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(iSH_sms_generic_Utilities.ListnersImplementation.class)
public class createExamTest extends BaseClass{
	
	@Test(groups = "RegressionSuite")
	public void createExamTest() throws Throwable{	
		
	   

		/*test script data*/
		int randomNum = jLib.getRandomNumber();
		
		
		/*step 2 : navigate to exam page*/		
		HomePage homePage = new HomePage(driver);
		homePage.ExamLink();
		
		
		
		/*step 3 : navigate to create exam*/
		
		ExamPage ep = new ExamPage(driver);
		ep.ClickonCreateExam();
		ep.ClickOnAdd();
		
		
			String Exam = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "ex", "tc_01", "add")+randomNum;

		ep.EnterExam(Exam);
		ep.Submit();
		
		//
		
		Thread.sleep(5000);

		
		
		
		
		
	   
       

}
}
