package StepDefinition;

import Pages.LoginPage;
import Pages.MovieDetailsPage;
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

public class MoviedetailsFunctionalitysteps {
    public WebDriver driver;
    MovieDetailsPage movieDetailsPage;
    LoginPage loginPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I enter  login page4")
    public void ienterloginpage(){
        driver.get("https://qamoviesapp.ccbp.tech");

    }
  @When("the user enters valid credentials4")
  public void enterValidCredentials() {
    loginPage.userLink("rahul");
    loginPage.passwordLink2("rahul@2021");
    loginPage.submitLink2();
    driver.quit();
  }
  @And("I should enter   home page4")
  public void ishouldenterhomepage(){
        String expectedurl="https://qamoviesapp.ccbp.tech/";
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        String actualUL= driver.getCurrentUrl();
        Assert.assertEquals(actualUL,expectedurl,"url doesnot match");
    }
  @And("I should enter   popular page4")
  public void ishouldenterpopularpage(){
    String expectedurl2="\"https://qamoviesapp.ccbp.tech/popular";
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.urlToBe(expectedurl2));
    String actualUL= driver.getCurrentUrl();
    Assert.assertEquals(actualUL,expectedurl2,"url doesnot match");


  }
  @Then("the title, description, rating, and reviews should be displayed4")
  public void verifyMovieDetails() {
    movieDetailsPage.movieheadi().isDisplayed();
    movieDetailsPage.moviedescrip().isDisplayed();
    movieDetailsPage.contactparag().isDisplayed();
    movieDetailsPage.footercontain().isDisplayed();
  }


  @After
     public void tearDown(){
        driver.quit();
    }
}
