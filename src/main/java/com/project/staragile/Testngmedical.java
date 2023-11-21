package com.project.staragile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngmedical {
	
	 @Test
	public void verifyPageContent() {
	WebDriverManager.chromedriver().setup();
//	WebDriver driver =new ChromeDriver();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("http://localhost:8082/contact.html");

    
    WebElement inputName = driver.findElement(By.id("inputName"));
    WebElement inputNumber = driver.findElement(By.id("inputNumber"));
    WebElement inputMail = driver.findElement(By.id("inputMail"));
    WebElement inputMessage = driver.findElement(By.id("inputMessage"));
    
    WebElement loginButton = driver.findElement(By.id("send_bt"));

    
    inputName.sendKeys("admin");
    inputNumber.sendKeys("1234567890");
    inputMail.sendKeys("admin@gamil.com");
    inputMessage.sendKeys("Hii This is my admin content");

    // Click the login button
    loginButton.click();
    
	 }

}
