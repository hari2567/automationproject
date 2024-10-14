package StepDefinition;

import Pages.AcoountPage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountpageFunctionalitysteps {
    public WebDriver driver;
    AcoountPage acoountPage;
    LoginPage loginPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I click on login page7")
    public void iclickontheloginpage(){

      driver.get("https://qamoviesapp.ccbp.tech");
    }
    @When("the user enters valid credentials7")
    public void enterValidCredentials() {
    loginPage.userLink("rahul");
    loginPage.passwordLink2("rahul@2021");
    loginPage.submitLink2();
    driver.quit();
  }
  @And("the user navigates to the account page7")
   public void navigateToAccountPage() {
    driver.get("https://qamoviesapp.ccbp.tech/account");
  }

  @Then("the user’s profile information should be displayed7")
  public void verifyAccountDetails() {
    acoountPage.accounthead().isDisplayed();
    acoountPage.plancontai().isDisplayed();
    acoountPage.avatarli().isDisplayed();
  }

  // Then step for verifying log out or updating options
  @Then("the user should be able to log out or update their information7")
  public void verifyAccountOptions() {
    acoountPage.logoutele().isEnabled();
  }

    @After
    public void tearDown(){

    }
}
