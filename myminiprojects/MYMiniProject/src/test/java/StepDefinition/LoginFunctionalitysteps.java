package StepDefinition;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginFunctionalitysteps {
  WebDriver driver;
  LoginPage loginPage;
  @Before
  public void setup() {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
  }

  @Given("the user is on the login page1")
  public void userOnLoginPage() {
    driver.get("https://qamoviesapp.ccbp.tech");
  }

  @When("the user enters valid credentials1")
  public void enterValidCredentials() {
    loginPage.userLink("rahul");
    loginPage.passwordLink2("rahul@2021");
    loginPage.submitLink2();
    driver.quit();
  }

  @When("the user enters invalid credentials1")
  public void enterInvalidCredentials() {
    loginPage.userLink("rahull");
    loginPage.passwordLink2("rahul@2021");
    loginPage.submitLink2();
    driver.quit();
  }

  @Then("the user should be redirected to the homepage1")
  public void verifyRedirectionToHomePage() {
    driver.get("https://qamoviesapp.ccbp.tech");
  }
  @Then("an error message should be displayed")
  public void verifyErrorMessage() {
    loginPage.errorMessage();
    driver.quit();
  }

  @Then("the username, password fields, and login button should be visible1")
  public void verifyLoginPageUI() {
    loginPage.usernamelinkl().isDisplayed();
    loginPage.passwordLink().isDisplayed();
    loginPage.submitLink().isDisplayed();
  }
  @After
  public void tearDown(){
    driver.quit();
  }

}
