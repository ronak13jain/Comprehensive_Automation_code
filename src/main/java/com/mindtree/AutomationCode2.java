package com.mindtree;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationCode2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tide.com/en-us");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//to automate login functionality
		
		driver.findElement(By.xpath("//span[@class='login-register']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'signup/tide-coupons')]")).click();
		
		Set<String> Str2=driver.getWindowHandles();
		
		Iterator <String> iterator1=Str2.iterator();
		
		String p_screen=iterator1.next();
		String n_screen=iterator1.next();
		
		driver.switchTo().window(n_screen);
		
		driver.findElement(By.xpath("//button[contains(@class,'underline text-primaryCta')]")).click();
		
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("kanu123@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("kj@12242Ka");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//button[@type='button'])[51]")).click();
		
	

		
		
	}

}
