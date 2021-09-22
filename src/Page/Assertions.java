package Page;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {

	
	 String driverpath;
	 String driverkey;
	
	public Assertions(String driverpath,String driverkey)
	{
		 this.driverpath=driverpath;
		 this.driverkey= driverkey;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";
		String key= "webdriver.chrome.driver";
		
		
		//Initiate  Object
		
		 //Locating Elements By XPath
		Assertions a = new Assertions(path,key);
				  
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
			    
			    driver.get("https://www.royalmail.com/");
			    
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
                WebElement prompt= driver.findElement(By.cssSelector("#consent_prompt_submit"));
			    
			    prompt.click();
			    
			    
			    Assert.assertFalse(driver.findElement(By.cssSelector("a[title='DC Collection Special Stamps']")).isSelected());  
			    
			    System.out.println(driver.findElement(By.cssSelector("a[title='DC Collection Special Stamps']")).isSelected());  

	}

}
