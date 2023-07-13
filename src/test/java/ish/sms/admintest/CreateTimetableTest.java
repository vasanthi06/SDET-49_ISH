package ish.sms.admintest;


import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ISH_sms_ObjectRepositories.EditTimetablePage;
import ISH_sms_ObjectRepositories.HomePage;
import ISH_sms_ObjectRepositories.LoginPage;
import ISH_sms_ObjectRepositories.TimetablePage;
import ISH_sms_ObjectRepositories.createTimeTablePage;
import iSH_sms_generic_Utilities.BaseClass;
import iSH_sms_generic_Utilities.ExcelUtlity;
import iSH_sms_generic_Utilities.FileUtility;
import iSH_sms_generic_Utilities.JavaUtlity;
import iSH_sms_generic_Utilities.WebActionUtility;
import io.github.bonigarcia.wdm.WebDriverManager;


//@Listeners(iSH_sms_generic_Utilities.ListnersImplementation.class)
public class CreateTimetableTest extends BaseClass{

	
    @Test (groups= {"SmokeSuite","RegressionSuite"})  
		public void CreateTimetableTest() throws Throwable {
			
		
		/*	FileInputStream fis = new FileInputStream("D:\\Selenium Anirudh\\sms.property");
			
			Properties pobj = new Properties();
			pobj.load(fis);
			
			String BROWSER = pobj.getProperty("browser");
			String URL      = pobj.getProperty("url");
			String USERNAME = pobj.getProperty("username");
			String PASSWORD = pobj.getProperty("password");*/
			
				
		/*		
				FileUtility fLib = new FileUtility();
				ExcelUtlity eLib = new ExcelUtlity();
				JavaUtlity jLib = new JavaUtlity();
				WebActionUtility wLib = new WebActionUtility();
				
				
		       String ENV_FILE_PATH =    fLib.getFilePathFromPropertiesFile("projectConfigDataFilePath");
		       String TEST_SCRIPT_EXCEL_FILE_PATH =    fLib.getFilePathFromPropertiesFile("testScriptdatafilePath");
		       
		       
			   String BROWSER = fLib.getDataFromProperties(ENV_FILE_PATH, "browser");
			   String URL = fLib.getDataFromProperties(ENV_FILE_PATH, "url");
			   String USERNAME = fLib.getDataFromProperties(ENV_FILE_PATH, "username");
			   String PASSWORd = fLib.getDataFromProperties(ENV_FILE_PATH, "password");
		                                                                                           */
				/*test script data*/
				int randomNum = jLib.getRandomNumber();
				
			
			

			// STEP 2 : LAUNCH THE BROWSER - RUNTIME POLYMORPHISM
				

				/*

		        if(BROWSER.equalsIgnoreCase("chrome"))
		        {
		       	 WebDriverManager.chromedriver().setup();
		       	 driver= new ChromeDriver();
		        }
		        else if(BROWSER.equalsIgnoreCase("firefox"))
		        {
		       	 WebDriverManager.firefoxdriver().setup();
		       	 driver= new FirefoxDriver();
		        }
		        else if(BROWSER.equalsIgnoreCase("edge"))
		        {
		       	 WebDriverManager.edgedriver().setup();
		       	 driver= new EdgeDriver();
		        }
		        else
		        {
		       	 System.out.println("Invalid Browser Name");
		        }
				wLib.waitForElementInDOM(driver);
				driver.get(URL);
			
				//LoginToApplication
				LoginPage loginPage = new LoginPage(driver);
				loginPage.loginToApp(USERNAME, PASSWORd);
				
				/*step 2 : navigate to Timetable page*/		
				HomePage homePage = new HomePage(driver);
				homePage.TimetableLink();
				
				TimetablePage tp=new TimetablePage(driver);
					

				tp.grade();
				tp.Selgrade();
				
				
				
		//		String grade= eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "tt", "TC_01", "selGRADE");
				String grade = eLib.getDatafromExcel("tt", 1, 1);
				tp.selectfromdropdown(wLib, grade);
				
			
				
		//		tp.selectfromdropdown(wLib,grade);
				
				tp.ClSubmit();
				
				
				//EDITING THE TIMETABLE
                 
                driver.findElement(By.xpath("//a[text()='Edit']")).click();
                //driver.findElement(By.xpath("//a[text()='Edit']")).click(); 
			   
			    EditTimetablePage edit=new EditTimetablePage(driver);
			 
				//  edit.Editontimetable();
			  //   edit.Editontimetable(wLib, element);
			   
			   
			   String day = eLib.getDatafromExcel("tt", 1, 2);
				edit.SelectDAYfromdropdown(wLib, day);
				
				String subject=eLib.getDatafromExcel("tt", 1, 3);
				edit.SelectSubjectfromdropdown(wLib, subject);
				
				 Thread.sleep(6000);
				
				String teacher=eLib.getDatafromExcel("tt", 1, 4);
				edit.Selectteacherfromdropdown(wLib, teacher);
				
				 Thread.sleep(6000);
				
				String classroom=eLib.getDatafromExcel("tt", 1, 5);
				edit.Selectclassroomfromdropdown(wLib, classroom);
				
				 Thread.sleep(6000);
		       String time1=eLib.getDatafromExcel("tt", 1, 6);
			   edit.stime(time1);
			   
			   Thread.sleep(6000);
			   String time11=eLib.getDatafromExcel("tt", 1, 6);
				   edit.endTime(time11);
				   
				   Thread.sleep(6000);
			   edit.Submitupdation();
				
				
				
				
				//String name = eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "tt", "tc_01", "selGRADE");
			
				
			/*	WebElement grade=driver.findElement(By.id("grade"));
				Select l=new Select(grade);
				l.selectByVisibleText("Grade 2");
				driver.findElement(By.xpath("//button[text()='Submit']")).click();*/
	           Thread.sleep(5000); 
				
			   driver.findElement(By.xpath("//a[text()='Add ']")).click();
				createTimeTablePage cttp = new createTimeTablePage(driver);
				
			//	cttp.AddT();
				String Day = eLib.getDatafromExcel("tt", 1, 2);
				cttp.SelectDAYfromdropdown(wLib, Day);
				
				String subj=eLib.getDatafromExcel("tt", 1, 3);
				cttp.SelectSubjectfromdropdown(wLib, subj);
				
				String teach=eLib.getDatafromExcel("tt", 1, 4);
				cttp.Selectteacherfromdropdown(wLib, teach);
				
				String classr=eLib.getDatafromExcel("tt", 1, 5);
				cttp.Selectclassroomfromdropdown(wLib, classr);
			    
				  Thread.sleep(6000);
			
		    //   String time=eLib.getDatafromExcel("tt", 1, 6)+randomNum;
			//   cttp.getSelectstarttime(time);
				  

			       String time=eLib.getDatafromExcel("tt", 1, 6);
				   cttp.Selectstarttime(time);
			   
			   String time2=eLib.getDatafromExcel("tt", 1, 7)+randomNum;
			   cttp.Selectendtime(time2);
			  
			   cttp.SubmitT();	
			   
			   
			   Thread.sleep(6000);
			   
			   
    }
    
    
    
    
    @Test(groups = "Reg")
    
    public void RegSample()
    {
    	System.out.println("========Regional regression suite=======");
    }
			   
			   
			   //EDITING THE TIMETABLE
             //     Thread.sleep(4000);    
             //     driver.findElement(By.xpath("//a[text()='Edit']")).click();
                  //driver.findElement(By.xpath("//a[text()='Edit']")).click(); 
			   
			//    EditTimetablePage edit=new EditTimetablePage(driver);
			 
				//  edit.Editontimetable();
			  //   edit.Editontimetable(wLib, element);
			   
			   
		/*	   String day = eLib.getDatafromExcel("tt", 1, 2);
				edit.SelectDAYfromdropdown(wLib, day);
				
				String subject=eLib.getDatafromExcel("tt", 1, 3);
				edit.SelectSubjectfromdropdown(wLib, subject);
				
				String teacher=eLib.getDatafromExcel("tt", 1, 4);
				edit.Selectteacherfromdropdown(wLib, teacher);
				
				String classroom=eLib.getDatafromExcel("tt", 1, 5);
				edit.Selectclassroomfromdropdown(wLib, classroom);
				
			
		       String time1=eLib.getDatafromExcel("tt", 1, 6)+randomNum;
			   edit.stime(time1);
			   
			 //  String time11=eLib.getDatafromExcel("tt", 1, 6)+randomNum;
			 //  edit.endTime(time11);
			   
			  // cttp.SubmitT();
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
				
				
		/*		WebElement day1=driver.findElement(By.id("day"));
				wLib.select(day1,eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "tt", "tc_01", "DAY2"));
				Select S2 = new Select(day1);
				S2.selectByVisibleText("Saturday");
				

				WebElement st=driver.findElement(By.name("subject_id"));
				wLib.select(st,eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "tt", "tc_04", "SUBJECT02"));
				Select s3 = new Select(st);
				s3.selectByVisibleText("Subject 4");
				
				//Thread.sleep(2000);

				WebElement T=driver.findElement(By.name("teacher_id"));
				wLib.select(T,eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "tt", "tc_04", "TEACHER02"));
				Select s4 = new Select(T);
				s4.selectByVisibleText("Teacher 4");
				
				//Thread.sleep(2000); 
				
				WebElement C=driver.findElement(By.name("classroom_id"));
				wLib.select(T,eLib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "tt", "tc_04", "CLASSROOM-2"));
				Select S3 = new Select(C);
				S3.selectByVisibleText("Class C");
  
				driver.findElement(By.name("start_time")).sendKeys("0");
				driver.findElement(By.name("end_time")).sendKeys("0");
				
				//Thread.sleep(2000);
				
				driver.findElement(By.id("btnSubmit")).click();
				
				
				
		/*	// STEP 3:LOGIN TO THE APPLICATION
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click(); 
	        
			// STEP 4:NAVIGATE TO TIMETABLE click on timetable

			driver.findElement(By.xpath("//span[text()='Timetable']")).click();
			
			// step 5:SELECT GRADE
			WebElement grade=driver.findElement(By.id("grade"));
			Select l=new Select(grade);
			l.selectByVisibleText("Grade 2");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
            
			//STEP 6:EDIT THE TIMETABLE
			driver.findElement(By.xpath("/]/a[text()='Edit'")).click();
			
			//STEP 7:EDIT DAY
			WebElement day =driver.findElement(By.xpath("(//select[@class=\"form-control\"])[2]"));
			Select s=new Select(day);
			s.selectByVisibleText("Monday");
			
			//STEP 8:EDIT SUBJECT
			WebElement subj=driver.findElement(By.xpath("//select[@name='subject_id']"));
			Select s1=new Select(subj);
			s1.selectByVisibleText("Subject 6");
			
			//STEP 9:EDIT TEACHER
			WebElement teacher=driver.findElement(By.xpath("//select[@name='teacher_id']"));
			Select s2=new Select(teacher);
			s2.selectByVisibleText("Teacher 6");
			
			//STEP 10:EDIT CLASSROOM
			WebElement classroom=driver.findElement(By.xpath("//select[@name='classroom_id']"));
			Select s3 = new Select(classroom);
			s3.selectByVisibleText("Class D");
			
			//STEP 11:EDIT START TIME
			driver.findElement(By.id("start_time1")).sendKeys("");
			
			//STEP 12:EDIT END TIME
			driver.findElement(By.id("end_time1")).sendKeys("");
			
			driver.findElement(By.id("btnSubmit1")).click();
			
			//STEP 13:ADD THE TIMETABLE
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[text()='Add ']")).click();
            
			
			
			Thread.sleep(4000);
			//STEP 14:ENTER THE DAY
			WebElement day1=driver.findElement(By.id("day"));
			Select S = new Select(day1);
			S.selectByVisibleText("Saturday");
			
			Thread.sleep(3000);
			
			WebElement st=driver.findElement(By.name("subject_id"));
			Select a = new Select(st);
			a.selectByVisibleText("Subject 4");
			
			//Thread.sleep(2000);

			WebElement T=driver.findElement(By.name("teacher_id"));
			Select S2 = new Select(T);
			S2.selectByVisibleText("Teacher 4");
			
			//Thread.sleep(2000); 
			
			WebElement C=driver.findElement(By.name("classroom_id"));
			Select S3 = new Select(C);
			S3.selectByVisibleText("Class C");

			driver.findElement(By.name("start_time")).sendKeys("0");
			driver.findElement(By.name("end_time")).sendKeys("0");
			
			//Thread.sleep(2000);
			
			driver.findElement(By.id("btnSubmit")).click();
			
			
			
			Thread.sleep(2000);
			//STEP 20:DELETE THE TIMETABLE
		    driver.findElement(By.xpath("//a[text()='Delete']"));
             
		    Thread.sleep(2000);
			//STEP 21:SIGN OUT OF APP
			driver.findElement(By.xpath("//span[text()='Ingenious Developer1']")).click();
			driver.findElement(By.xpath("//a[text()='Sign out']")).click();*/

			
		//	driver.close();
			
			
			
		}
		
		
		
		

	
		
	


