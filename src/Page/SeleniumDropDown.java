package Page;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropDown {

	 String driverpath;
	 String driverkey;
	 
	public SeleniumDropDown(String driverpath,String driverkey) {
		// TODO Auto-generated constructor stub
		
		 this.driverpath=driverpath;
		 this.driverkey= driverkey;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String path= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";
		String key= "webdriver.chrome.driver";
		
		SeleniumDropDown a = new SeleniumDropDown(path,key);
		  
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
	    
	    driver.get("https://www.amazon.in/");
	    
	    WebElement testDropDown = driver.findElement(By.cssSelector("select[aria-describedby='searchDropdownDescription']"));  
	    
	    Select dropdown = new Select(testDropDown);  
	    
	    //Assertion Test
	    //Assert.assertFalse(dropdown.selectByIndex(5).isSelected());  
	    
	   dropdown.selectByIndex(5);  
	    
	    
	    
	    
	    
		
		

	}
	
	

}
