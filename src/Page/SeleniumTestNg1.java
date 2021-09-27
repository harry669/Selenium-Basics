package Page;

//import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SeleniumTestNg1 {
	
      WebDriver driver= null;
	  String path=null;
	  String key=null;
	
	@BeforeTest
	public  void setUpTest()
	{
		  path= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";
		  key= "webdriver.chrome.driver";
		 System.setProperty(key,path);
		  driver=new ChromeDriver();  
		 
	}
	
	@Test
	public void test()
	{
		//this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//this.driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		    
	WebElement Timer= driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
		    
		    Timer.click();
		    
		    WebDriverWait wait = new WebDriverWait(driver, 20);
		    
		    WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		    
		    boolean status= element.isDisplayed();
		    
		    if(status)
		    {
		    	System.out.println("Element is visible");
		    }
		    else 
		    {
		    	System.out.println("Element is  Not visible");
		    }
	}
	
	@AfterTest
	public void tearDownTest()
	{
		 driver.close();
	}

}
