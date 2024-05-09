package amzonloginpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quiker {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

	driver.get("https://www.quikr.com/signin");	
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	WebElement droup=driver .findElement(By.xpath("//*[@id=\"quikrcom-header\"]/div[2]/div[1]/div[3]/div[1]"));
	
	List<WebElement>drouplinks=driver.findElements(By.tagName("a"));
	
	System.out.println(drouplinks.size());
	for(int i=0;i<=drouplinks.size();i++) {

		System.out.println(drouplinks.get(i).getText());   
		
		
		if(drouplinks.get(i).getText().equals("Deals")) {
			drouplinks.get(i).click();
		}
		
		  //validastion
		
	/*.get(i).click();
		if(drouplinks.get(i).isSelected()) {
			System.out.println(drouplinks.get(i).getText()+"is selected");
		}else {
			System.out.println(drouplinks.get(i).getText()+"is not selected");
	driver.close();
		}  
*/
		}
	   }
	}


