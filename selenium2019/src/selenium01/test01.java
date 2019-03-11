package selenium01;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test01 {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before    //junit注解
  public void setUp() throws Exception {
	  System.setProperty("wedriver.chrome.driver", "./tools/chromedriver.exe");//定义谷歌浏览器的路径
    driver = new  ChromeDriver();        //FirefoxDriver();定义火狐浏览器
    
    baseUrl="file:///D:/Study/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E5%9F%BA%E7%A1%80/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/index(1).html";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//全局等待
  }

  @Test		//操作，测试用例
  public void testUntitled2() throws Exception {
	  	driver.get(baseUrl);
	  	driver.findElement(By.id("user")).clear();
	    driver.findElement(By.id("user")).sendKeys("7868");
	    new Select(driver.findElement(By.id("moreSelect"))).selectByVisibleText("huawei");
	    driver.findElement(By.xpath("(//input[@name='identity'])[3]")).click();
	    driver.findElement(By.name("checkbox2")).click();
	    driver.findElement(By.name("checkbox4")).click();
	    driver.findElement(By.id("id01")).click();
  }
  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
}
