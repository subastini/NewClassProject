package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//http://www.greenstechnologys.com/java-training-in-chennai.html
//http://demo.automationtesting.in/Alerts.html
//https://en-gb.facebook.com/
//http://demo.guru99.com/test/guru99home/

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Home\\eclipse-workspace\\SeleniumRevise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
						
		driver.manage().window().maximize();
		
		driver.switchTo().frame("a077aa5e");
		
		WebElement element = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		element.click();
		
		
	}

}
