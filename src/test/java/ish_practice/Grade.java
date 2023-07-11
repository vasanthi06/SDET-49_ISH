package ish_practice;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grade {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	WebDriverManager.chromedriver().setup();
	//  WebDriver driver = new ChromeDriver();
		

		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();

		
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Thread.sleep(3000);
		
		//for sign in
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Grade']")).click();
		
		//for creating grade
		driver.findElement(By.xpath("//span[text()='Grade']")).click();
		Thread.sleep(3000);
		Random r=new Random();
		int num=r.nextInt(200);
		String expected="Grade "+""+num;
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys(expected);
		driver.findElement(By.xpath("//input[@placeholder='Enter admission fee']")).sendKeys("250");
		driver.findElement(By.xpath("//input[@placeholder='Enter hall charge']")).sendKeys("15");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@placeholder='75-100']")).sendKeys("80");
		driver.findElement(By.xpath("//input[@placeholder='A']")).sendKeys("c");
		driver.findElement(By.xpath("//button[@class='btn btn-info btnS']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(expected);
		String Actual=driver.findElement(By.xpath("//div/table[@id='example1']/tbody/tr/td[5]/a[text()='Edit']")).getText();
		
		if(Actual.equals(expected))
		{
			System.out.println("create grade passed");
		}
		else{
			System.out.println("create grade failed");
		}
		
		
		
		
		
	/*	Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900);");  */
		
		
	/*	//FOR DELETE
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@data-id='16'])[1]/ancestor::td")).click();
		driver.findElement(By.xpath("(//button[@id='frm_cancel'])[2]")).click();
		
		//FOR EDIT
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[(text()='Edit')])[6]")).click();
		driver.findElement(By.xpath("//input[@id='name1']")).sendKeys(expected);
		driver.findElement(By.xpath("//button[@onclick='Updategrade(this)']")).click();
		
		//FOR VIEW MARKS
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@onclick='showModal1(this)'])[6]")).click();
		driver.findElement(By.xpath("//a[text()='Add eMark']")).click();
		driver.findElement(By.id("mark_range_text_1")).sendKeys("85");
		driver.findElement(By.id("mark_grade_text_1")).sendKeys("B"+""+num);
		driver.findElement(By.xpath("//button[@style='width:100%;']")).click();*/
		
		
		
		
	/*	driver.findElement(By.xpath("//span[text()='Ingenious Developer1']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();*/

	}

}
