package StepDefinition;

import Pages.LoginPage;
import Pages.SearchPage;
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

public class SearchpageFunctionalitysteps {
    public WebDriver driver;
    SearchPage searchPage;
    LoginPage loginPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I click to login page6")
    public void iclicktologinpage() {

      driver.get("https://qamoviesapp.ccbp.tech");
    }
  @When("the user enters valid credentials6")
  public void enterValidCredentials() {
    loginPage.userLink("rahul");
    loginPage.passwordLink2("rahul@2021");
    loginPage.submitLink2();
    driver.quit();
  }
   @And("the user enters a movie title in the search bar6")
    public void enterValidSearchQuery() {
    searchPage.getserachname().sendKeys("Titanic");
    searchPage.getbutton().click();
  }

  // When step for entering invalid search query
  @And("the user enters a non-existent movie title6")
  public void enterInvalidSearchQuery() {
    searchPage.getserachname().sendKeys("rohit");
    searchPage.getbutton().click();
  }

  // Then step for displaying matching search results
  @Then("matching movies should be displayed6")
  public void verifyMatchingMoviesDisplayed() {
    searchPage.getImage().isDisplayed();
  }

  // Then step for showing no results found
  @Then("matching no results found6")
  public void verifyNoResultsMessage() {
    searchPage.getPagarapgtext().isDisplayed();
  }

  @After
    public void tearDown(){
        driver.quit();
    }
}
