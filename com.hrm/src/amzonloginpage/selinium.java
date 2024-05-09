package amzonloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selinium {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("redmi mobiles");	
		//searchBox.submit();
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		//driver.findElement(By.linkText());
	}

	
		
		
	}


