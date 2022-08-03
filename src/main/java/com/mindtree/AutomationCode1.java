package com.mindtree;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationCode1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tide.com/en-us");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//To Automate the registration functionality
		
		driver.findElement(By.xpath("//span[@class='login-register']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'signup/tide-coupons')]")).click();
		
		Set<String> Str2=driver.getWindowHandles();
		Iterator <String> iterator1=Str2.iterator();
		String p_screen=iterator1.next();
		String n_screen=iterator1.next();
		driver.switchTo().window(n_screen);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kanhaiya");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kanu223@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kj@12242Ka");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div //input[@value='CREATE ACCOUNT']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button [@id='recaptcha-verify-button']")).click();
		
		
		
	}

}
