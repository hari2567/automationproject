package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
  public WebDriver driver;
  public WebDriverWait wait;
  @FindBy(id = "search")
  WebElement searchname;
  @FindBy(xpath = "//button[@class='search-button']")
  WebElement button;
  @FindBy(xpath = "//img[@class='movie-image']")
  WebElement image;
  @FindBy(xpath ="//p[@class='not-found-search-paragraph']" )
  WebElement pagarapgtext;

  public  WebElement getserachname(){
    return searchname;

  }
  public  WebElement getbutton(){
    return button;
  }
  public  WebElement getImage(){
    return image;
  }
  public WebElement getPagarapgtext(){
    return pagarapgtext;
  }

  public SearchPage(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

  }
}





