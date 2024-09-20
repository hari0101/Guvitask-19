package guvitask19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) {

		// Chromedriver instance
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// navigating the URL
		driver.get("https://www.guvi.in/register");
		
		//Xpath locators
		WebElement xpath1= driver.findElement(By.xpath("//h2[normalize-space(text())='Sign Up']"));
		WebElement xpath2 = driver.findElement(By.xpath("//p[contains(.,'Already have an account? Login')]"));
		WebElement xpath3 = driver.findElement(By.xpath("//a[@class='login']"));
		WebElement xpath4 = driver.findElement(By.xpath("//div[@id='buttonDiv']"));
		WebElement xpath5 = driver.findElement(By.xpath("//label[normalize-space()='Full Name']"));
		WebElement xpath6 = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement xpath7 = driver.findElement(By.xpath("//small[@class='certificates']"));
		WebElement xpath8 = driver.findElement(By.xpath("//label[normalize-space()='Email Address']"));
		WebElement xpath9 = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement xpath10 = driver.findElement(By.xpath("//input[contains(@class, 'password-err')]"));
		WebElement xpath11 = driver.findElement(By.xpath("//label[text()='Password']"));
		WebElement xpath12 = driver.findElement(By.xpath("//label[normalize-space(text())='Mobile number']"));
		WebElement xpath13 = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		WebElement xpath14 = driver.findElement(By.xpath("//a[@class='signup-btn']"));
		
		 
		//Outputing the element as true which is available in Website.
		//Some of the output is empty or true because there is no text available on the locators.
		System.out.println(xpath1.getText());
		System.out.println(xpath2.getText());
		System.out.println(xpath3.getText());
		System.out.println(xpath4.isDisplayed());
		System.out.println(xpath5.getText());
		System.out.println(xpath6.isDisplayed());
		System.out.println(xpath7.getText());
		System.out.println(xpath8.getText());
		System.out.println(xpath9.isDisplayed());
		System.out.println(xpath10.isDisplayed());
		System.out.println(xpath11.getText());
		System.out.println(xpath12.getText());
		System.out.println(xpath13.isDisplayed());
		System.out.println(xpath14.isEnabled());
	}

}
