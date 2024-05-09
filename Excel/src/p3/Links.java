package p3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Links {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	/*
	 * List <WebElement>links=driver.findElements(By.tagName("Option"));
	 * System.out.println(links.size()); for(int i=1;i<=links.size();i++) {
	 * 
	 * System.out.println(links.get(i).getText());
	 * 
	 * if(links.get(i).getText().equals("Books")) { links.get(i).click(); }
	 * 
	 * }
	 */
	
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	Select sl=new Select(drop);
	List<WebElement>droplist=sl.getOptions();
	System.out.println(droplist.size());
	for(int i=1;i<=droplist.size();i++) {
		
	System.out.println(droplist.get(i).getText());
	droplist.get(i).click();

	}
	
	}
}
