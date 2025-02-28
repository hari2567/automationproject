package StepDefinition;

import Pages.LoginPage;
import Pages.PopularPage;
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
import java.util.List;

public class PopularpageFunctionalitysteps {
    public WebDriver driver;
    PopularPage popularPage;
    LoginPage loginPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I click login page5")
    public void iclickloginpage(){
        driver.get("https://qamoviesapp.ccbp.tech");

    }
  @When("the user enters valid credentials5")
    public void enterValidCredentials() {
    loginPage.userLink("rahul");
    loginPage.passwordLink2("rahul@2021");
    loginPage.submitLink2();
    driver.quit();
  }

    @Then("I should enter into popular page5")
    public void ishouldenterintopopularpage(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popularpagelink=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Popular")));
        popularpagelink.click();
        String expectedurlp="https://qamoviesapp.ccbp.tech/popular";
        Assert.assertEquals(expectedurlp,driver.getCurrentUrl(),"not displayed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement>popularapageList=driver.findElements(By.className("movie-icon-item"));
        Assert.assertEquals(popularapageList.size(),30,"not all movies are present in popular movies section ");

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
