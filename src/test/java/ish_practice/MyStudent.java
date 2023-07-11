package ish_practice;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyStudent {

	public static void main(String[] args) throws InterruptedException {
	
		
		 WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();

			driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
             Thread.sleep(2000);
			//for sign in
			driver.findElement(By.name("email")).sendKeys("t1@gmail.com");
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
			
			driver.findElement(By.xpath("//span[text()='My Student']")).click();
			WebElement g= driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
			Select s= new Select(g);
			s.selectByVisibleText("Grade 1");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,2002);");
			
			
			Random r = new Random();
			int num =r.nextInt(300);
			Thread.sleep(2000);
			//for edit
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("");
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			WebElement Address = driver.findElement(By.xpath("(//input[@placeholder='Enter address'])[1]"));
			Address.clear();
			Address.sendKeys("Bengaluru"+""+num);
			jse.executeScript("window.scrollBy(0,2000);");
			 Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@style='width:150px;']")).click();
			
			 Thread.sleep(4000);
			 
			 //edit subject
			driver.findElement(By.xpath("(//a[text()='Edit Subject'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@id='checkbox1'])[2]")).click();
			driver.findElement(By.xpath("//button[@onclick='editSubject1(this)']")).click();
			
			
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
			driver.findElement(By.xpath("//a[text()='Sign out']")).click();
			
			
			driver.close();
			
			
			
			
			


	}

}
