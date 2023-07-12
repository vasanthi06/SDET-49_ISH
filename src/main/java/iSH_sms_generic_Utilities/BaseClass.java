package iSH_sms_generic_Utilities;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import ISH_sms_ObjectRepositories.HomePage;
import ISH_sms_ObjectRepositories.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver sdriver;
	public WebDriver driver ;
	public FileUtility fLib = new FileUtility();
	public ExcelUtlity eLib = new ExcelUtlity();
	public JavaUtlity jLib = new JavaUtlity();
	public WebActionUtility wLib = new WebActionUtility();
	public DataBaseUtility dLib =new DataBaseUtility();
	public String ENV_FILE_PATH;
	public String TEST_SCRIPT_EXCEL_FILE_PATH;
	
	/**
	 * CONNECTING TO MYSQL DATABASE
	 * @throws SQLException
	 */
	
	
	@BeforeSuite(groups = {"SmokeSuite","RegressionSuite"})
	public void connecToDB() throws SQLException
	{
		try {
			
			dLib.connectDB();
			System.out.println("=======DATABASE IS CONNECTED=======");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	/**
	 * LAUNCHING THE BROWSER
	 * @param BROWSER
	 * @throws Throwable
	 */
	
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"SmokeSuite","RegressionSuite"})
	public void launchTheBrowser() throws Throwable 
	{
		
		ENV_FILE_PATH = fLib.getFilePathFromPropertiesFile("projectConfigDataFilePath");
		String BROWSER = fLib.getDataFromProperties(ENV_FILE_PATH, "browser");
		String URL = fLib.getDataFromProperties(ENV_FILE_PATH, "url");
		System.setProperty(BROWSER, URL);
		 
         if(BROWSER.equalsIgnoreCase("chrome"))
         {
        	// WebDriverManager.chromedriver().setup();
        	 driver= new ChromeDriver();
         }
         else if(BROWSER.equalsIgnoreCase("firefox"))
         {
        	 WebDriverManager.firefoxdriver().setup();
        	 driver= new FirefoxDriver();
         }
         else if(BROWSER.equalsIgnoreCase("edge"))
         {
        	// WebDriverManager.edgedriver().setup();
        	 driver= new EdgeDriver();
         }
         else
         {
        	 System.out.println("Invalid Browser Name");
         }
        
	    sdriver=driver;
	    driver.get(URL);
		wLib.waitForElementInDOM(driver);
		
		System.out.println("============browser  launched  sucessfully================");  
	       
	}
	
	/**
	 * 
	 * @throws Throwable
	 */
	@BeforeMethod(groups = {"SmokeSuite","RegressionSuite"})
	public void loginToApp() throws Throwable
	{
		 
	     TEST_SCRIPT_EXCEL_FILE_PATH =    fLib.getFilePathFromPropertiesFile("testScriptdataFilePath");
	     ENV_FILE_PATH = fLib.getFilePathFromPropertiesFile("projectConfigDataFilePath"); 
		String username = fLib.getDataFromProperties(ENV_FILE_PATH, "username");
		String password = fLib.getDataFromProperties(ENV_FILE_PATH, "password");
		
		System.out.println(username);
		System.out.println(password);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginPage(username,password);
		
		System.out.println("===========SUCESSFULLY LOGGED INTO THE APPLICATION============");
		
	}
	/**
	 * log out from the application
	 */
	
	@AfterMethod (groups = {"SmokeSuite","RegressionSuite"})
	public void logoutFromApplication()
	{
		HomePage homePage = new HomePage(driver);
		
		homePage.signOut(driver);
		
		System.out.println("==========SUCESSFULLY LOGGEDOUT FROM THE APPLICATION============");
		
	}
	/**
	 * closing the browser
	 */
	
	@AfterClass (groups = {"SmokeSuite","RegressionSuite"})
	public void closeTheBrowser()
	{
		driver.quit();
		System.out.println("===========BROWSER CLOSED SUCESSFULLY===========");
	}
	
	/**
	 * closing the database
	 * @throws SQLException
	 */
	@AfterSuite (groups = {"SmokeSuite","RegressionSuite"})
	public void closeDB() throws SQLException
	{
		dLib.closeDB();
		System.out.println("=========DATABASE CLOSED SUCESSFULLY=========");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}