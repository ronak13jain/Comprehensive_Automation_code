package com.mindtree;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationCode3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://tide.com/en-us");
		 
		//to open a article on website about how this product can affect human health, if children put them in mouth or play with them.
		
		driver.findElement(By.xpath("//a[@href='/en-us/latest-news']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'heavy-duty-10x-power-pods-original')]")).click();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='lilo3746-wrapper']//div[@class='lilo3746-overlay lilo3746-overlay-lightbox']//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a [@href='https://smartlabel.pg.com/00037000590804.html']")).click();
		Set<String> Str2=driver.getWindowHandles();
		Iterator <String> iterator1=Str2.iterator();
		String p_screen=iterator1.next();
		String n_screen=iterator1.next();
		driver.switchTo().window(n_screen);
	
		driver.findElement(By.xpath("//ul[@id='tab']//div [@id='healthy-safety tab']")).click();	
				
	}
}
