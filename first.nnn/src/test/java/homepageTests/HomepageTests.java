package homepageTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.FilpKartsearchPage;
import pageobjects.HomePage;
import resources.base;

public class HomepageTests  extends base
{
	WebDriver driver;
	@BeforeTest
	public void initializeTest()
	{
		
		driver = intializeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void VerificationTest()
	{
		
		HomePage hp = new HomePage(driver);
		hp.searchinBox("iPhone XR(64GB)");
		hp.clickOnSearch();
		WebElement iphonePriceinamazon = driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//div[@class='s-include-content-margin s-border-bottom']//div[@class='a-section a-spacing-medium']//div[@class='sg-row']//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']//div[@class='sg-col-inner']//div[@class='sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 sg-col-4-of-36 sg-col-4-of-28 sg-col-4-of-16 sg-col sg-col-4-of-20 sg-col-4-of-32']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-small']//div[@class='a-row a-size-base a-color-base']//div[@class='a-row']//a[@class='a-size-base a-link-normal s-no-hover a-text-normal']//span[@class='a-price']//span//span[@class='a-price-whole'][contains(text(),'47,900')]"));
		String[] strs = iphonePriceinamazon.getText().split(",");
		String price = "";
		for(int i =0;i<strs.length;i++) {
			price = price+ strs[i];
		}
		int IphonePriceinamazon = Integer.parseInt(price);
		System.out.println("Iphone price in amazom : "+IphonePriceinamazon);
		FilpKartsearchPage fpg = new FilpKartsearchPage(driver);
		driver.get("https://www.flipkart.com/");
		fpg.dismissalert();
		fpg.searchinBox("iPhone XR(64GB)");
		fpg.clickOnSearch();
		WebElement iphonePriceinFilpKrat = driver.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C']//div[2]//div[1]//div[1]//div[1]//a[1]//div[2]//div[2]//div[1]//div[1]//div[1]"));
		String iphonepriceinFp  = iphonePriceinFilpKrat.getText().replaceAll("[^a-zA-Z0-9]", "");
		int IphonePriceinFilpkrat = Integer.parseInt(iphonepriceinFp);
		System.out.println("Iphone price in Filpkrat : "+IphonePriceinFilpkrat);
		
		
		if(IphonePriceinamazon < IphonePriceinFilpkrat)
		{
			System.out.println("Iphone price is less in amazon");
			
		}
		else
			System.out.println("Iphone price is less in Filpkrat");	
		
	}

}
