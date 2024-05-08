package stepdefinision;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;

public class ApplicationlLogin {
	Loginpage loginpage=new Loginpage();
	WebDriver driver;
@Given("^User open the browser$")
public void user_open_the_browser() throws Throwable {
    driver=new ChromeDriver();
    
}

@Given("^User open application$")
public void user_open_application() throws Throwable {
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.manage().window().maximize();
}
@When("^User enter username and password$")
public void user_enter_username_and_password() throws Throwable {
   driver.findElement(loginpage.username).sendKeys("Admin"); 
   driver.findElement(loginpage.password).sendKeys("admin123");
}

@When("^User click login$")
public void user_click_login() throws Throwable {
   driver.findElement(loginpage.login).click();
}

@Then("^User validates orange hrm dashboard page is displayed$")
public void user_validates_orange_hrm_dashboard_page_is_displayed() throws Throwable {
   Assert.assertTrue(driver.findElement((loginpage.dashboard)).isDisplayed());
}


}
