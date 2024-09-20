package guvitask19;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDs {

	public static void main(String[] args) {
		
		//Chromedriver instance
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigating the URL
		driver.get("https://www.guvi.in/register");
		
		List<By> list = new ArrayList<>();
		// ID Locators 
			list.add(By.id("name")); //Full Name input field
			list.add(By.id("email")); //Email address input field
			list.add(By.id("password")); //Password input field
			list.add(By.id("mobileNumber"));	//Mobile number input field
			list.add(By.id("signup-btn"));   //Full Name input field
			
			list.add(By.id("buttonDiv"));  //Sign up with google button
	
		for(By locators: list)
		{
			List<WebElement> locator = driver.findElements(locators);
			
			//Some of the output is empty because there is no text available on the locators.
			for(WebElement locate : locator)
			{
				System.out.println("Element found using the ID locators : " + locate.getText());
			}
		}
			
		
	}

}
