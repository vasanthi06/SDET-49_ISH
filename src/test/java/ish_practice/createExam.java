package ish_practice;

import java.time.Duration;
import java.util.Random;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createExam {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();


		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		Thread.sleep(2000);
		//for sign in
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);");
		
		Thread.sleep(2000);
		//NAVIGATE TO EXAM
		
		

		Random r=new Random();
		int num=r.nextInt(1000);
		
		//CREATE EXAM
		
		driver.findElement(By.xpath("//span[text()='Exam']")).click();
		driver.findElement(By.xpath("//a[text()='Create Exam']")).click();
		driver.findElement(By.xpath("//a[@data-id='1']")).click();
		String expected= "Unit Test "+num;
		driver.findElement(By.id("name")).sendKeys(expected);
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(expected);
		String Actual=driver.findElement(By.xpath("//div/table/tbody/tr/td[2]")).getText();
		
		if(Actual.equals(expected))
		{
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
		
		
	/*	jse.executeScript("window.scrollBy(0,300);");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Exam']")).click();
		driver.findElement(By.xpath("//a[text()='Student Exam Marks']")).click();
		WebElement Element = driver.findElement(By.name("grade"));
        Select s=new Select(Element);
        s.selectByVisibleText("Grade 1");
        
        WebElement Element1 = driver.findElement(By.name("exam"));
        Select s1=new Select(Element1);
        s1.selectByVisibleText("Term 2");
        
        driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
        
        
        
		jse.executeScript("window.scrollBy(0,300)");
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("");
		
		
		
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Edit Exam Marks']")).click();
		WebElement e=driver.findElement(By.id("exam_mark_1"));
       // e.clear();
		//e.sendKeys(""+num);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnSubmit3")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[text()='View Exam Marks'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Add Exam Marks']")).click();
		//driver.findElement(By.id("exam_mark_1")).sendKeys(""+num);
	//	driver.findElement(By.id("exam_mark_2")).sendKeys(""+num);
		//driver.findElement(By.id("btnSubmit3")).click();
		driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-remove'])[21]")).click();   */
		
		
		
	
        
        
        
        
        
	}

}
