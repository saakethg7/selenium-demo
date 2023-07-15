package com.assignment.my_assignment;

//import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {

	 public static void main( String[] args ) throws InterruptedException
	    {
	        //System.out.println( "Hello World!" );
	    	//System.setProperty("webdriver.chrome.driver", "/Users/Saaketh/Documents/Software/driver/chromedriver.exe");
	    	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	        
	       ChromeOptions chromeoptions = new ChromeOptions();
	       chromeoptions.addArguments("--no-sandbox");
	       chromeoptions.addArguments("--headless");
	       chromeoptions.addArguments("--disable-dev-shm-usage");
	       chromeoptions.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(chromeoptions);
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(10000);   
	       
	       
	       
	       driver.findElement(By.id("email")).sendKeys("saaketh.g1308@gmail.com");
	       driver.findElement(By.id("pass")).sendKeys("");
	       driver.findElement(By.name("login")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      String name= driver.findElement(By.xpath("//a[@aria-label='SaaKeth Gunturu']/div[3]/span/span")).getText();
	      if(name.equalsIgnoreCase("saaketh gunturu"))
	      {
	    	  System.out.println( "Facebook Login Successful" );
	      }
	      else
	      {
	    	  System.out.println( "Facebook Login NOT Successful" );
	      }
	       
	       
	       
	       driver.close();
	       driver.quit();
	    }

}
