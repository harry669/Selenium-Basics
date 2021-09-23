package Page;

import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumDragDrop {
	
	 String driverpath;
	 String driverkey;

	public SeleniumDragDrop(String driverpath,String driverkey) {
		// TODO Auto-generated constructor stub
		 this.driverpath=driverpath;
		 this.driverkey= driverkey;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";
		String key= "webdriver.chrome.driver";
		
		SeleniumDragDrop a = new SeleniumDragDrop(path,key);
		  
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
	    
	      //Actions class method to drag and drop		
	  		Actions builder = new Actions(driver);
	    
	    driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
	    
	    //identify source element
	    WebElement src = driver.findElement(By.xpath("//*[text()= 'Draggable 1']"));
	    
	    //identify target element
	    WebElement target= driver.findElement(By.cssSelector("div[id='mydropzone']"));
	    
	    System.out.println(target);
	    
	    //perform drag and drop
	    // builder.dragAndDrop(src, target).build().perform();
	    
	     //perform composite drag and drop operation
	    
	     //click and hold src webelement
	    builder.clickAndHold(src).moveToElement(target).release(target).build().perform();
	    
	    //builder.moveByOffset(-1, -1);
	    
	   // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    //move to target element
	   //builder.moveToElement(target).build().perform();
	    
	    //release src element into target element box
	    //builder.release(target).build().perform();
	}

}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
