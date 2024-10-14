package StepDefinition;

import Pages.HeadersectionPage;
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
import org.testng.Assert;

import java.time.Duration;

public class HeadersectionFunctionalitysteps {
  public WebDriver driver;
  HeadersectionPage headersectionPage;
  LoginPage loginPage;

  @Before
  public void setup() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
  }

  @Given("the user is logged in3")
  public void userIsLoggedIn() {
    driver.get("https://qamoviesapp.ccbp.tech");
  }

  @When("the user enters valid credentials3")
  public void enterValidCredentials() {
    loginPage.userLink("rahul");
    loginPage.passwordLink2("rahul@2021");
    loginPage.submitLink2();
    driver.quit();
  }
  @Then("the header should display the logo3")
  public void verifyHeaderElements() {
    headersectionPage.logoNavigation().isDisplayed();
    headersectionPage.homeNavigation().isDisplayed();
    headersectionPage.popularNavigation().isDisplayed();
    headersectionPage.avatarNaviagtion().isDisplayed();
  }

  @When("the user clicks the Popular link in the header3")
  public void clickPopularLink() {
    headersectionPage.popularNavigation().click();
  }


  @Then("the popular movies page should be displayed3")
  public void verifyPopularPage() {
    headersectionPage.popularNavigation().isDisplayed();

  }
  @After
  public void tearDown(){
    driver.quit();
  }
}
