package StepDefinition;


import cucumber.api.DataTable;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Login {
        WebDriver driver;

//    @Given("^user able to open Browser$")
//    public void user_able_to_open_Browser()  {
//        WebDriverManager.chromedriver().setup();
//        driver =new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @Given("^Enter an Url$")
//    public void enter_an_Url()  {
//        driver.get("https://demo.nopcommerce.com/");
//    }

//    @When("^User click on Login Link$")
//    public void user_click_on_Login_Link()  {
//        driver.findElement(By.className("ico-login")).click();
//    }
//
//    @When("^User is on Login Page and Verify Login Page Title$")
//    public void user_is_on_Login_Page_and_Verify_Login_Page_Title()  {
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("nopCommerce demo store. Login",title);
//    }
//// simple hard coded step
//    @Then("^User enter username and password and click on Login button$")
//    public void user_enter_username_and_password_and_click_on_Login_button()  {
//        System.out.println("User Login");
//        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//        driver.findElement(By.id("Email")).sendKeys("test12@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("12ggkjgj");
//    }
//    //simple data driven without example keyword
//    @Then("^User enter \"([^\"]*)\" and \"([^\"]*)\" and click on Login button$")
//    public void user_enter_and_and_click_on_Login_button(String username, String password)  {
//        driver.findElement(By.id("Email")).sendKeys(username);
//        driver.findElement(By.id("Password")).sendKeys(password);
//        driver.findElement(By.className("login-button")).click();
//    }
//    // data driven with example keyword
//    @Then("^User enter \"([^\"]*)\" and \"([^\"]*)\" and Click on login button$")
//    public void user_enter_and_and_Click_on_login_button(String Username, String Password)  {
//        driver.findElement(By.id("Email")).sendKeys(Username);
//        driver.findElement(By.id("Password")).sendKeys(Password);
//        driver.findElement(By.className("login-button")).click();
//    }
//    //data table
//    @Then("^User enter USERNAME and PASSWORD and click on login button$")
//    public void user_enter_USERNAME_and_PASSWORD_and_click_on_login_button(DataTable credentials) {
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        List<List<String>> data =credentials.raw();
//
//
//    }
//
//    @Then("^User close the browser$")
//    public void user_close_the_browser() {
//        System.out.println("Logout done");
//        driver.close();
//    }
//

}
