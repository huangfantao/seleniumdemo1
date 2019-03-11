package selenium01;


import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class e5 {
	 public static WebDriver driver;
	  public static String baseUrl;
	@BeforeClass
	  public void setUp() throws Exception {
		//  System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	   // driver = new ChromeDriver();
		  DesiredCapabilities a=DesiredCapabilities.chrome();
		   driver=new remotewebdriver(new url("http://localhost:5555/wd/hub"),a);
		  baseUrl = "http://localhost:8080/examsys/index.thtml";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  } 
	@Test
	public void hh() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("hujianming");
		driver.findElement(By.name("userpass")).clear();
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("π‹¿Ì‘±");
		driver.findElement(By.cssSelector("button.tm_btn")).click();
	}
	  @AfterClass
	  public void tearDown() throws Exception {
		   driver.quit(); 
	  }
}
