package guvitask19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {

	public static void main(String[] args) {

		// Chromedriver instance
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// navigating the URL
		driver.get("https://www.guvi.in/register");
		
		//CSSselector locators 
		 WebElement css1 = driver.findElement(By.cssSelector("h2"));
		 WebElement css2 = driver.findElement(By.cssSelector(".login"));
		 WebElement css3 = driver.findElement(By.cssSelector("#buttonDiv"));
		 WebElement css4 = driver.findElement(By.cssSelector("div[class='email-line mt-4'] p"));
		 WebElement css5= driver.findElement(By.cssSelector("label[for='name']"));
		 WebElement css6 = driver.findElement(By.cssSelector("#name"));
		 WebElement css7 = driver.findElement(By.cssSelector("label[for='email']"));
		 WebElement css8 = driver.findElement(By.cssSelector("#email"));
		 WebElement css9 = driver.findElement(By.cssSelector("label[for='password']"));
		 WebElement css10 = driver.findElement(By.cssSelector("input[type='password']"));
		 WebElement css11 = driver.findElement(By.cssSelector("label[for='mobileNumber']"));
		 WebElement css12 = driver.findElement(By.cssSelector("#mobileNumber"));
		 WebElement css13= driver.findElement(By.cssSelector("#signup-btn"));
		 WebElement css14 = driver.findElement(By.cssSelector(".signup-btn"));
		 
		//Outputing the element as true which is available in Website.
		//Some of the output is empty or true because there is no text available on the locators. 
		System.out.println(css1.getText());
		System.out.println(css2.getText());
		System.out.println(css3.isDisplayed()); //return true because of button
		System.out.println(css4.getText());
		System.out.println(css5.getText()); 
		System.out.println(css6.isDisplayed()); //return true because of input box.
		System.out.println(css7.getText());
		System.out.println(css8.isDisplayed()); //return true because of input box.
		System.out.println(css9.getText());
		System.out.println(css10.isDisplayed()); //return true because of input box
		System.out.println(css11.getText());
		System.out.println(css12.isDisplayed()); //return true because of input box
		System.out.println(css13.isDisplayed()); //Return true button 
		System.out.println(css14.isDisplayed());  //Return true button
		
	}

}
