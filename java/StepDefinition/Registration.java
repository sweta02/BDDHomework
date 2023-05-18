package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Y;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    WebDriver driver;
    @Given("^User able to Open Browser$")
    public void user_able_to_Open_Browser()  {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("^Enter an Url$")
    public void enter_an_Url() {
        driver.get("https://demo.nopcommerce.com/");
    }
    @When("^User click on Registration Link$")
    public void user_click_on_Registration_Link()  {
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
    }
    @When("^User can click on gender Female$")
    public void user_can_click_on_gender_Female()  {
        driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
    }
    @Then("^User can enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_can_enter(String Firstname, String Lastname)  {
        driver.findElement(By.id("FirstName")).sendKeys(Firstname);
        driver.findElement(By.id("LastName")).sendKeys(Lastname);
    }

    @Then("^User can enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_can_enter_and_and(String BirthDate, String Month, String Year)  {
    driver.findElement(By.name("DateOfBirthDay")).sendKeys(BirthDate);
    driver.findElement(By.name("DateOfBirthMonth")).sendKeys(Month);
    driver.findElement(By.name("DateOfBirthYear")).sendKeys(Year);

    }
    @Then("^User enter \"([^\"]*)\"$")
    public void user_enter(String email){
     driver.findElement(By.id("Email")).sendKeys(email);
    }

    @Then("^User is able to enter \"([^\"]*)\"$")
    public void user_is_able_to_enter(String password)  {
        driver.findElement(By.id("Password")).sendKeys(password);
    }
    @Then("^User now can enter \"([^\"]*)\"$")
    public void user_now_can_enter(String conPassword)  {
        driver.findElement(By.id("ConfirmPassword")).sendKeys(conPassword);
    }
    @Then("^User click on Register button$")
    public void user_click_on_Register_button()  {
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
    }

    @Then("^User close the browser$")
    public void user_close_the_browser()  {
        driver.close();
    }

}
