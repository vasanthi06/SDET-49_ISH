package ish.sms.admintest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ISH_sms_ObjectRepositories.HomePage;
import ISH_sms_ObjectRepositories.LoginPage;
import ISH_sms_ObjectRepositories.myStudentPage;
import iSH_sms_generic_Utilities.BaseClass;
import iSH_sms_generic_Utilities.ExcelUtlity;
import iSH_sms_generic_Utilities.FileUtility;
import iSH_sms_generic_Utilities.JavaUtlity;
import iSH_sms_generic_Utilities.WebActionUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_MyStudentTest   {
	
	
	@Test(groups = "SmokeSuite")
	public  void CreateMyStudentTest() throws Throwable {
		
             

		/*create Object for utility */
		FileUtility fLib = new FileUtility();
		ExcelUtlity eLib = new ExcelUtlity();
		JavaUtlity jLib = new JavaUtlity();
		WebActionUtility wLib = new WebActionUtility();
		
		/*get the FILE PATH*/
	       String ENV_FILE_PATH =    fLib.getFilePathFromPropertiesFile2("2projectConfigDataFilePath");
	      String TEST_SCRIPT_EXCEL_FILE_PATH =    fLib.getFilePathFromPropertiesFile("testScriptdataFilePath");
	       

	       /*Read the common data*/
		   String BROWSER = fLib.getDataFromProperties2(ENV_FILE_PATH, "browser");
		   String URL = fLib.getDataFromProperties2(ENV_FILE_PATH, "url");
		   String USERNAME = fLib.getDataFromProperties2(ENV_FILE_PATH, "username");
		   String PASSWORd = fLib.getDataFromProperties2(ENV_FILE_PATH, "password");
		   
		   
		   
		   int randomNum = jLib.getRandomNumber();
	       
		
		// STEP 2 : LAUNCH THE BROWSER - RUNTIME POLYMORPHISM
		
         WebDriver driver = null ;
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
				loginPage.LoginPage(USERNAME, PASSWORd);
		     myStudentPage stu = new myStudentPage(driver);
		     
		     stu.Stugrade();
		     String stugrade=eLib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "st", 1,3);
			stu.selGrade(stugrade);
		      stu.Submit();
		      
		    
		   //  String edit
			stu.edit();
		     String addr=eLib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "st", 1,1);
			stu.Edit(addr); 
			
			String init=eLib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "st", 1,1)+randomNum;
			stu.editInitials(init);
			stu.updatestu();
			
			
			Thread.sleep(5000);
		//for Upgrade
			stu.gradeUpdate();
		//	stu.NOupgrade();			
		    stu.upgradeYEs(); 
		    
		    
          //  stu.selectG();

            Thread.sleep(5000);
		    String name=eLib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "st", 2,3);
			stu.selectClass(name);
		    stu.Checksubject();  
		      
		      
		      
		      
		      
	/*	// STEP 3:LOGIN TO THE APPLICATION
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click(); 
        
		//STEP 4:NAVIGATE TO MY STUDENT
		driver.findElement(By.xpath("//span[text()='My Student']")).click();
		
		//STEP 5:SELECT THE GRADE AND SUBMIT
		WebElement g= driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select s= new Select(g);
		s.selectByVisibleText("Grade 1");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2002);");
		
		//STEP 6:SEARCH FOR PARTICULAR STUDENT IN SEARCH FIELD  
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		

		Random r=new Random();
		int num=r.nextInt(200);                               
		
		 //STEP 7:EDIT THE ADDRESS AND CLICK ON UPDATE 
		 driver.findElement(By.xpath("(//input[@placeholder='Enter address'])[1]")).sendKeys("Bengaluru-"+""+num);
		
		 jse.executeScript("window.scrollBy(0,2000);");
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//button[@style='width:150px;']")).click();
		
		 Thread.sleep(4000);
		 
		 //STEP 8:EDIT THE SUBJECT
		 driver.findElement(By.xpath("(//a[text()='Edit Subject'])[1]")).click();
		 driver.findElement(By.xpath("(//input[@id='checkbox1'])[2]")).click();
		 driver.findElement(By.xpath("//button[@onclick='editSubject1(this)']")).click();
		 driver.findElement(By.xpath("//a[text()='Upgrade Grade']")).click();
		 driver.findElement(By.id("btnYes1")).click();
		
		 
			
			
			//for upgrade
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Upgrade Grade']")).click();
		//	driver.findElement(By.xpath("(//button[text()='No'])[3]")).click();
			
			
			//STEP :FOR UPGRADE WE NEED TO CLICK ON YES
			driver.findElement(By.id("btnYes1")).click();
			
			Thread.sleep(4000);
			WebElement E=driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
			
			
			Select k=new Select(E);
			k.selectByVisibleText("Grade 3");
			
			Thread.sleep(4000);
			driver.findElement(By.name("checkbox[]")).click();
			driver.findElement(By.xpath("//button[@onclick='upgradeGrade(this)']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-remove'])[23]")).click();
			
			//for leave
			driver.findElement(By.xpath("(//a[text()='Leave'])[1]")).click();
			driver.findElement(By.xpath("(//button[@id='frm_cancel'])[2]")).click();
			
			
			//Thread.sleep(5000);
			//for sign out
			driver.findElement(By.xpath("//span[text()='Teacher 1fdsfhdfgdh']")).click();
			driver.findElement(By.xpath("//a[text()='Sign out']")).click();      */
			
			
			driver.close();
			
			
			
		
		
		
		
	}

}
