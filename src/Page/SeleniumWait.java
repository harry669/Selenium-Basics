package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
	
	
	String driverpath;
	 String driverkey;

	public SeleniumWait(String driverpath,String driverkey) {
		// TODO Auto-generated constructor stub
		
		 this.driverpath=driverpath;
		 this.driverkey= driverkey;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";
		String key= "webdriver.chrome.driver";
		
		SeleniumWait a = new SeleniumWait(path,key);
		  
		 //Set System Path 
		System.setProperty(a.driverkey,a.driverpath);
		
		//add chrome option
		//ChromeOptions chOption = new ChromeOptions();
		//chOption.addArguments("user-data-dir=D:\\Chrome_profiles");
		
		//Assertion
		  //set Chrome driver;
	    WebDriver driver=new ChromeDriver();  
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
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

}
