package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilpKartsearchPage {
	

	WebDriver driver;
	public FilpKartsearchPage(WebDriver driver)
	{
		
	this.driver = driver;
		
	}
	
	 By searchBox = By.xpath("//input[@placeholder='Search for products, brands and more']");
	 By SearchButton = By.xpath("//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[@class='Y5-ZPI']/form[@class='_1WMLwI header-form-search']/div[@class='col-12-12 _2tVp4j']/button[@class='vh79eN']/*[1]");
	    

	   
	 	public void searchinBox(String keyword)
	 	{
	 	
	 		driver.findElement(searchBox).click();
	 		driver.findElement(searchBox).sendKeys(keyword);
	         

	        }




		public void clickOnSearch() {
			// TODO Auto-generated method stub
			
			driver.findElement(SearchButton).click();
		}




		public void dismissalert() {
			// TODO Auto-generated method stub
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			
		}
		
		
	


}
