package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\7_Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		WebElement name =  driver.findElement(By.id("fullName"));
		name.sendKeys("Senthilvel");
		
		WebElement append =  driver.findElement(By.id("join"));
		append.sendKeys("Senthilvel", Keys.TAB);
		
		WebElement insidetextbox =  driver.findElement(By.id("getMe"));
		String name1 = insidetextbox.getAttribute("value");
		System.out.println(name1);
		
		WebElement clearme =  driver.findElement(By.id("clearMe"));
		clearme.clear();
		
		WebElement noedit =  driver.findElement(By.id("noEdit"));
		Boolean disabled = noedit.isEnabled();
		System.out.println(disabled);
		if (disabled==false) {
			
			System.out.println("Edit field is Disabled");
		}
		
		WebElement isreadonly = driver.findElement(By.id("dontwrite"));
		String readOnly = isreadonly.getAttribute("readonly");
		System.out.println(readOnly);
	}

}
