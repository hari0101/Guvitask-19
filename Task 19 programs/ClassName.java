package guvitask19;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassName {

	public static void main(String[] args) {
		
		//Chromedriver instance
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//navigating the URL
		driver.get("https://www.guvi.in/register");
		
		//ClassName Locators which are available in Website.
		WebElement class1 = driver.findElement(By.className("justify-content-center"));  //Sign up google button.
		WebElement class2 = driver.findElement(By.className("certificates")); // finds the notification string of (*This name will appear in certificates).
		WebElement class3 = driver.findElement(By.className("password-err")); //finds the password input field.
		class3.click();
		WebElement class4 = driver.findElement(By.className("countrycode-left")); // finds the phone number input field.
		WebElement class5 = driver.findElement(By.className("ul-head")); //find the notification string of (Set a password with).
		WebElement class6 = driver.findElement(By.className("min-char")); // find the notification string of (Atleast 6 characters)
		
		//Outputing the element as true which is available in Website.
		//Some of the output is empty because there is no text available on the locators.
		System.out.println(class1.isDisplayed());
		System.out.println(class2.getText());
		System.out.println(class3.isDisplayed());
		System.out.println(class4.isDisplayed());
		System.out.println(class5.getText());
		System.out.println(class6.getText());
		
	}

}
