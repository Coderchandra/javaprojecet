package p3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mose {

public void mouseaction() {
	
WebDriver driver=new ChromeDriver();
driver.get("https://www.telangana.gov.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
Actions move=new  Actions(driver);
	
WebElement  about=driver.findElement(By.xpath("//*[@id=\"mega-menu-item-7172\"]"));
	
WebElement  symbol=driver.findElement(By.xpath("//*[@id=\"mega-menu-item-7226\"]/a"));	
move.moveToElement(about).moveToElement(symbol).click().perform();
	
}
public static void main(String[] args) {
	Mose app=new Mose();
	app.mouseaction();
}	
	
	
	
}
