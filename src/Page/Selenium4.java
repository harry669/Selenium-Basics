package Page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {
	
	String driverpath;
	 String driverkey;
	 
	public Selenium4(String driverpath,String driverkey)
	{
		 this.driverpath=driverpath;
		 this.driverkey= driverkey;
	}
	
	public static void main(String args[])
	{
		String path= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";
		String key= "webdriver.chrome.driver";
		
		
		//Initiate  Object
				Selenium4 a = new Selenium4(path,key);
				  
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
			    
                 WebElement prompt= driver.findElement(By.cssSelector("#consent_prompt_submit"));
			    
			    prompt.click();
			    
			    //Locate Elements By XPath and InnerText
			    //driver.findElement(By.xpath("//*[text()='Find out more']")).click();
			    
			    
			    //Locate Elements By XPath and Contains InnerText Method
			    List<WebElement> links= driver.findElements(By.xpath("//*[contains(text(),'Sending')]"));
			    
			    System.out.println(links.size());
			    
			    
			    
			    
			    
	}

}
