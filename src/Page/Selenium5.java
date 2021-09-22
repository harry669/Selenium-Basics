package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium5 {
	
	 String driverpath;
	 String driverkey;
	
	public Selenium5(String driverpath,String driverkey)
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
				Selenium5 a = new Selenium5(path,key);
				  
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
			    
			    //Locate Element By id
			    //driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("test");
			    
			    //Locate Element By using contains of xpath
			   // driver.findElement(By.xpath("//input[ contains(@id,'-firstName')]")).sendKeys("test");
			    
			    //Locate Element By Xpath using index method
			    
			    //<div class="col-sm-12 google-sign-form"><input type="text" placeholder="Organization/Company Name" name="organization_name" value="" class="form-control sign-up-input-2 ">
			    //<input type="text" placeholder="Full Name*" name="name" value="" class="form-control sign-up-input-2 "> 
			    //<input type="email" placeholder="Work Email*" name="email" value="" class="form-control sign-up-input-2 ">
			    
			    //Xpath= //div[@class= ’col-sm-12 google-sign-form’]/input[2]
			    
			    //Xpath Chain Method
			    
			    WebElement menu1= driver.findElement(By.xpath("//ul[@data-region='header']//li[@class='primary-menu-level-0 parent-item-2 accordion-content-wrapper']"));
			    
			    menu1.click();
			    
			    System.out.println(driver.getCurrentUrl());
			    
			    //Locate Elements Using Xpath axes method
			    
			    //Xpath= //li[@class=’sign-in’]//following-sibling::li
			    
                //It Will Select Next li element afetr li class "sign-in"
			    
			    
			    
			    
			    
			    
		

	}

}
