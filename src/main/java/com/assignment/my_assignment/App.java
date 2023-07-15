package com.assignment.my_assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
    	System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
    	//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        
       ChromeOptions chromeoptions = new ChromeOptions();
       WebDriver driver = new ChromeDriver(chromeoptions);
       driver.get("http://18.223.248.64:8080/addressbook-demo/");
       Thread.sleep(10000);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       driver.findElement(By.className("v-button")).click();
       
       driver.findElement(By.id("gwt-uid-5")).sendKeys("Saaketh");
       driver.findElement(By.id("gwt-uid-7")).sendKeys("G");
       driver.findElement(By.id("gwt-uid-9")).sendKeys("7940012259");
       driver.findElement(By.id("gwt-uid-11")).sendKeys("Saaketh@gmail.com");
       driver.findElement(By.id("gwt-uid-13")).sendKeys("4/3/21,");
       
       driver.findElement(By.className("v-button-primary")).click();
       Thread.sleep(10000);
       driver.close();
       driver.quit();
    }
}
