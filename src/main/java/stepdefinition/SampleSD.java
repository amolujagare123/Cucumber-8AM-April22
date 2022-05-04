package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSD {
    WebDriver driver;
    @Given("I am on login page")
    public void i_am_on_login_page() {

        System.out.println("I am on login page");

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

    }

    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {

        System.out.println("I enter correct username and correct password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
    }

    @And("I click on login button")
    public void i_click_on_login_button() {

        System.out.println("I click on login button");
        driver.findElement(By.name("submit")).click();

    }

    @Then("I should be redirected to home page")
    public void i_should_be_redirected_to_home_page() {

        System.out.println("I should be redirected to home page");

        String expected = "https://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals("this is not a home page",expected,actual);

    }
}
