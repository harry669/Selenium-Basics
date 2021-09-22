package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium3 {
	
	 String driverpath;
	 String driverkey;

	 public Selenium3(String driverpath,String driverkey)
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
				Selenium3 a = new Selenium3(path,key);
				  
				 //Set System Path 
				System.setProperty(a.driverkey,a.driverpath);
				
				//add chrome option
				//ChromeOptions chOption = new ChromeOptions();
				//chOption.addArguments("user-data-dir=D:\\Chrome_profiles");
				
				
				  //set Chrome driver;
			    WebDriver driver=new ChromeDriver();  
			    
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    driver.manage().window().maximize();
			    
			    driver.get("https://www.royalmail.com/");
			    
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    //Locate Element By ID 
			    //WebElement prompt= driver.findElement(By.id("consent_prompt_submit"));
			    
			    //Locate Element By Css Selector
			    WebElement prompt= driver.findElement(By.cssSelector("#consent_prompt_submit"));
			    
			    prompt.click();
			    
			   // WebElement Prompt= driver.findElement(By.className("privacy_prompt explicit_consent"));
			   // Prompt.click();
			    
			    //Locate Element By Id
			    //WebElement TrackItem = driver.findElement(By.id("edit-track-number"));
			    
			    //Locate Element By Multiple Attribute
			    //WebElement TrackItem = driver.findElement(By.cssSelector("input[class='label-hidden form-text required']"));
			    
			    //Locate Element By SubString - contains
			   // WebElement TrackItem= driver.findElement(By.cssSelector("input[name*='track_']"));
			    
			    //Locate Element By SubString - Starts With
			    
			    WebElement TrackItem= driver.findElement(By.cssSelector("input[name^='track_']"));
			    
			    //input invalid Track No
			    TrackItem.sendKeys("asasasasas");
			    
			    WebElement SearchTrackItem= driver.findElement(By.id("edit-submit"));
			    
			   // SearchTrackItem.click();
			    
			    //System.out.println(Ul);
			    

		
		 
	}

}
