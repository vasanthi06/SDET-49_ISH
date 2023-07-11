package ish_practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Timetable {


	public static void main(String[] args) throws InterruptedException {
        
         

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();


		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		Thread.sleep(2000);
		//for sign in
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();


		//for edit the timetable

		driver.findElement(By.xpath("//span[text()='Timetable']")).click();
		WebElement grade=driver.findElement(By.id("grade"));
		Select l=new Select(grade);
		l.selectByVisibleText("Grade 2");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		WebElement day =driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select s=new Select(day);
		s.selectByVisibleText("Monday");


		WebElement subj=driver.findElement(By.xpath("//select[@name='subject_id']"));
		Select s1=new Select(subj);
		s1.selectByVisibleText("Subject 6");


		WebElement teacher=driver.findElement(By.xpath("//select[@name='teacher_id']"));
		Select s2=new Select(teacher);
		s2.selectByVisibleText("Teacher 6");


		WebElement classroom=driver.findElement(By.xpath("//select[@name='classroom_id']"));
		Select s3 = new Select(classroom);
		s3.selectByVisibleText("Class D");

		driver.findElement(By.id("start_time1")).sendKeys("");
		
		driver.findElement(By.id("end_time1")).sendKeys("");
		Thread.sleep(4000);
		driver.findElement(By.id("btnSubmit1")).click();

		//adding timetable
		
		Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,2000);");
	    
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-sm pull-right']")).click();
		
		Thread.sleep(2000);
		WebElement day1=driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select S = new Select(day1);
		S.selectByVisibleText("Thursday");
        
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
		
		
		
		
		//for delete timetable
         
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[@class='confirm-delete btn btn-danger btn-xs']")).click();
	    driver.findElement(By.xpath("(//button[text()='No'])[2]")).click();
	   // driver.findElement(By.xpath("(//a[text()='Yes'])[2]")).click();

		//for sign out
		driver.findElement(By.xpath("//span[text()='Ingenious Developer1']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();


	}


}
