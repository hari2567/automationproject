package Tests;

import Pages.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class searchpagetest {
    public WebDriver driver;
    LoginPage loginPage;
     Homepage homePage;
    HeadersectionPage headerSection;
    PopularPage popularPage;
    SearchPage searchPage;

    @BeforeMethod
    @Test
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");

        loginPage = new LoginPage(driver);
        homePage = new Homepage(driver);
        headerSection = new HeadersectionPage(driver);
        popularPage = new PopularPage(driver);
        searchPage = new SearchPage(driver);

    }

    @AfterMethod
    public void teardown() {
        driver.quit();

    }

    @Test(priority = 1)
    public void testSearchFunctionality() {
        loginPage.loginToApplication("rahul", "rahul@2021");
        loginPage.submitLink2();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String expectedurl="https://qamoviesapp.ccbp.tech/";
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedurl));
        driver.findElement(By.className("search-empty-button")).click();
        WebElement serachBox= driver.findElement(By.id("search"));
        serachBox.sendKeys("Titanic");
        WebElement button= driver.findElement(By.xpath("//button[@class='search-button']"));
        button.click();
        WebElement resultCount= driver.findElement(By.xpath("//img[@class='movie-image']"));
        resultCount.isEnabled();
        resultCount.getText();


    }
    @Test
  public void testInvalidFunctionality(){
      loginPage.loginToApplication("rahul", "rahul@2021");
      loginPage.submitLink2();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      String expectedurl2="https://qamoviesapp.ccbp.tech/";
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.urlToBe(expectedurl2));
      driver.findElement(By.className("search-empty-button")).click();
      WebElement serachBox2= driver.findElement(By.id("search"));
      serachBox2.sendKeys("rohit");
      WebElement button2= driver.findElement(By.xpath("//button[@class='search-button']"));
      button2.click();
      WebElement paragraph= driver.findElement(By.xpath("//p[@class='not-found-search-paragraph']"));
      paragraph.isEnabled();
      Assert.assertEquals("matched",paragraph.getText(),"Your search for rohit did not find any matches.");

    }
}




