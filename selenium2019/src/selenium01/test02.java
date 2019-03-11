package selenium01;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test02 {
  private WebDriver driver;
  private String baseUrl;
  @BeforeClass
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://localhost:8080/examsys/index.thtml";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("hujianming");
    driver.findElement(By.name("userpass")).clear();
    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
    new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("¹ÜÀíÔ±");
    driver.findElement(By.name("usercode")).clear();
    Thread.sleep(15000);
    driver.findElement(By.cssSelector("button.tm_btn")).click();
    driver.switchTo().frame("main");
    String a=driver.findElement(By.cssSelector("body > div > div:nth-child(1) > ul > li")).getText();
    System.out.println(a);
  }

  @AfterClass
  public void tearDown() throws Exception {
   // driver.quit(); 
    }
  }

