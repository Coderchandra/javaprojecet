package p3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://testautomationpractice.blogspot.com/");	
		driver.manage().window().maximize();
		
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
		
		
		/*
		 * for(WebElement Checkbox:checkBoxes) {
		 * 
		 * Checkbox.click();
		 * 
		 * 
		 * 
		 * }
		 */
		/*
		 * for(int i=0;i<3;i++) { checkBoxes.get(i).click(); }
		 */
		
		/*
		 * for(int i=0;i<checkBoxes.size();i++) { checkBoxes.get(i).click(); }
		 */
		for(int i=4;i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
			
			Thread.sleep(5000);
			if(checkBoxes.get(i).isSelected()) {
				checkBoxes.get(i).click();
	
			}
		}

	}

}
