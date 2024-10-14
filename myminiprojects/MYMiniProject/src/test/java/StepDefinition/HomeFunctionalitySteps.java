package StepDefinition;

import Pages.Homepage;
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

public class HomeFunctionalitySteps {
  public WebDriver driver;
  Homepage homepage;

  @Before
  public void setup() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
  }

  @Given("the user is logged in2")
  public void userIsLoggedIn() {
    driver.get("https://qamoviesapp.ccbp.tech");
  }


  @When("the user navigates to the home page2")
  public void navigateToHomePage() {
    driver.get("https://qamoviesapp.ccbp.tech/");
  }


  @Then("the popular movies section should be displayed2")
  public void verifyPopularMoviesSection() {
    homepage.popularText().isDisplayed();
    homepage.popularText().isEnabled();
  }

  @Then("the search bar should be available2")
  public void verifySearchBar() {
    homepage.getSearchlocator().isDisplayed();
    homepage.getSearchlocator().isEnabled();
  }
  @After
  public void tearDown(){
    driver.quit();
  }
}
