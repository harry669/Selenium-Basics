package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.Assert;  

public class Selenium2 {
	
	 String driverpath;
	 String driverkey;
	 
	 public Selenium2(String driverpath,String driverkey)
	 {
		 this.driverpath=driverpath;
		 this.driverkey= driverkey;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //set System Path  and Key variables For WebDriver  
		String path= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";
		String key= "webdriver.chrome.driver";
		
		
		//Initiate  Object
				Selenium2 a = new Selenium2(path,key);
				  
				 //Set System Path 
				System.setProperty(a.driverkey,a.driverpath);
				
				//add chrome option
				ChromeOptions chOption = new ChromeOptions();
				chOption.addArguments("user-data-dir=D:\\Chrome_profiles");
				
				
				  //set Chrome driver;
			    WebDriver driver=new ChromeDriver(chOption);  
			    
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    //driver.manage().window().maximize();
			    chOption.addArguments("--start-maximized");
			    
			    driver.get("https://www.google.co.in/");
			    
			    //find Google Sign In button
			    driver.findElement(By.cssSelector("a[class='gb_3 gb_4 gb_9d gb_3c']")).click();
			    
			    //find and fill email with true value
			    WebElement trueEmail= driver.findElement(By.cssSelector("input[type='email']"));
			    
			    //true value
			    //trueEmail.sendKeys("manasdhumal159@gmail.com");
			    
			    //invalid value
			    trueEmail.sendKeys("1212234");
			   // WebElement Error=driver.findElement(By.cssSelector("div[class='o6cuMc']"));
			    
			    //Assert.assertTrue(driver.findElement(By.cssSelector("div[class='o6cuMc']"))).isDisplayed();  
			    
			    //if any error occur then error element should fill
			    driver.findElement(By.cssSelector("span[class='VfPpkd-vQzf8d']")).click();
			    
			    //halt script for some time
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    Assert.assertTrue( driver.findElement(By.cssSelector("div[class='o6cuMc']")).isDisplayed() );  
	}

}
