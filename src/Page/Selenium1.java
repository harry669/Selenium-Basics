package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium1 {
	
	 String driverpath;
	 String driverkey;
	 
	 public Selenium1(String driverpath,String driverkey)
	 {
		 this.driverpath=driverpath;
		 this.driverkey= driverkey;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GOOGLE SEARCH AUTOMATION
		 //set System Path  and Key variables For WebDriver  
		String path= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";
		String key= "webdriver.chrome.driver";
		
		
		//Initiate  Object
				Selenium1 a = new Selenium1(path,key);
				  
				 //Set System Path 
				System.setProperty(a.driverkey,a.driverpath);
				
				  //set Chrome driver;
			    WebDriver driver=new ChromeDriver();  
			    
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    driver.manage().window().maximize();
			    
			    driver.get("https://www.google.co.in/");
			    
			    //Google Search Automation
			   // driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium");
			    
			    //google empty textblock search
			    driver.findElement(By.cssSelector("input[name='q']")).sendKeys(" ");
			    
			    //search this 
			    driver.findElement(By.cssSelector("input[value='Google Search']")).click();
			    
			    driver.close();
	}

}
