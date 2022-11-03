import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class veggies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\divyashree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsNeeded = { "Cucumber","Tomato","Brinjal" };
		Thread.sleep(2000);
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
		 //List al = Arrays.asList(geeks);
		 List itemsNeededList=Arrays.asList(itemsNeeded);
		 String[] name=products.get(i).getText().split("-");
		 String formattedName=name[0].trim();
		 if(itemsNeededList.contains(formattedName))
		 {
			 int j=0;
			 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			 if(j==itemsNeeded.length)
				 break;
		 }
		 
		

	}
	}
}
