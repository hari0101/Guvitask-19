package guvitask19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {

		// Chromedriver instance
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// navigating the URL
		driver.get("https://www.guvi.in/register");
		
		//All the TagName are stored as List to collect multiple elements
		List<WebElement> aherf = driver.findElements(By.tagName("a"));
		List<WebElement> label = driver.findElements(By.tagName("label"));
		List<WebElement> p = driver.findElements(By.tagName("p"));
		List<WebElement> h2 = driver.findElements(By.tagName("h2"));
		
		System.out.println("******************************* < TagName <a> Values> *******************************");
		//Iterating all <a> tag values. 
		for(WebElement tag1 : aherf)
		{
			System.out.println(tag1.getText());
		}
		
		System.out.println("******************************* < TagName <label> Values> *****************************");
		//Interating all <label> tag values.
		for(WebElement tag2 : label)
		{
			System.out.println(tag2.getText());
		}
		
		System.out.println("******************************* < TagName <p> Values> *********************************");
		//Interating all <p> tag values.
		for(WebElement tag3 : p)
		{
			System.out.println(tag3.getText());
		}
		
		System.out.println("******************************* < TagName <h2> Values> *********************************");
		//Interating all <h2> tag values.
		for(WebElement tag4 : h2)
		{
			System.out.println(tag4.getText());
		}
		
		
	
	}

}
