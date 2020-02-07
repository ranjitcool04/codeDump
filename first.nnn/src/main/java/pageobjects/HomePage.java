package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		
	this.driver = driver;
		
	}
	
	 By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	 By SearchButton = By.xpath("//input[@type='submit']");
	    

	   
	 	public void searchinBox(String keyword)
	 	{
	 	
	 		driver.findElement(searchBox).sendKeys(keyword);
	         

	        }




		public void clickOnSearch() {
			// TODO Auto-generated method stub
			
			driver.findElement(SearchButton).click();
		}

	

	
	
	
	
	
	
	
	
	
	
	
}
