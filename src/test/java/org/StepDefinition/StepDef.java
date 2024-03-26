package org.StepDefinition;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.helper.Baseclass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends Baseclass {
		@Given("the user launches the Origin Dashboard through Chrome Browser")
		public void the_user_launches_the_Origin_Dashboard_through_Chrome_Browser() {
		  
		}

		@When("the user clicks on Code Mapping and selects Testing company from the Dropdown option")
		public void the_user_clicks_on_Code_Mapping_and_selects_Testing_company_from_the_Dropdown_option() throws InterruptedException, AWTException {
			Thread.sleep(3000);
		    WebElement a = driver.findElement(By.xpath("//input[@class = 'MuiAutocomplete-input MuiAutocomplete-inputFocused']"));
		   a.sendKeys("testCompany");
		   Thread.sleep(3000);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ENTER);  
		    };
		@When("Enter aa as {string} and bb as {string} and cc as {string} and dd as {string}and ee as {string}")
		public void enter_aa_as_and_bb_as_and_cc_as_and_dd_as_and_ee_as(String m, String n, String o, String p, String q) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			   driver.findElement(By.xpath("//input[@name='products']")).sendKeys("TAL");
			   WebElement a = driver.findElement(By.xpath("//div[text()='TALSTAR 10EC_100ML_IN']"));
			   Actions a1=new Actions(driver);
			   a1.moveToElement(a).click().build().perform();
			   driver.findElement(By.xpath("//input[@name='batchNo']")).sendKeys(m);
			   driver.findElement(By.name("startValue")).sendKeys(n);
			   driver.findElement(By.name("endValue")).sendKeys(o);
			   driver.findElement(By.name("totalNumberofBox")).sendKeys(p);
			   driver.findElement(By.name("totalNumberofValume")).sendKeys(q);
			   driver.findElement(By.name("mfgDate")).sendKeys("03-12-2024");
			}
		
		
		@When("the user clicks the Submit Button")
		public void the_user_clicks_the_Submit_Button() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));			 
			WebElement a = driver.findElement(By.xpath("//button[@class ='common-active-btn']"));
			 Actions a1=new Actions(driver);
			 a1.moveToElement(a).click().build().perform();
		}

		@Then("the user should receive a mapping successful message")
		public void the_user_should_receive_a_mapping_successful_message() throws InterruptedException {
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//			Alert al = driver.switchTo().alert();
//			String text2 = al.getText();
//			System.out.println(text2);
//		    WebElement element = driver.findElement(By.xpath("//div[@class='dialog-content d-flex flex-column  align-center details-popup']"));
//			String text = element.getText();
//			System.out.println(text);
			
			WebElement e = driver.findElement(By.xpath("//div[@class ='status-img']/following-sibling::p"));
			System.out.print(e.getText());
			String text = e.getText();
			
		   Assert.assertEquals(text,"Submitted Successfully !!");
		}

		@When("the user clicks on the History module")
		public void the_user_clicks_on_the_History_module() throws InterruptedException {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.findElement(By.xpath("//div[@class ='close']/child::*")).click();
		    driver.findElement(By.xpath("//span[text()='History']")).click();
		    driver.findElement(By.xpath("//button[text()='Get History Data']")).click();
		    Thread.sleep(5000);
		    
		}

		@When("the user validates whether the mapping has occurred or not")
		public void the_user_validates_whether_the_mapping_has_occurred_or_not() throws AWTException, InterruptedException {
			
			
			
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(3000);
			    driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("AutomationTestmarch25");
			
			    WebElement element = driver.findElement(By.xpath("//td[text()='AutomationTestmarch25']"));
			    String text = element.getText();
			    System.out.println(text);
			    Assert.assertEquals(text,"AutomationTestmarch25");
			    
			//a.click();
			
//			Robot r=new Robot();
//			r.keyPress(KeyEvent.VK_ENTER);
			
			
			
		}

		
			@When("the user performs demapping")
			public void the_user_performs_demapping() throws InterruptedException {
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
				driver.findElement(By.xpath("//div[text()='Action']")).click();
				Thread.sleep(5000);
				WebElement aa = driver.findElement(By.xpath("(//tr[@class='MuiTableRow-root css-m5zuvj']/child::*/following::p[1])[1]"));
				String text = aa.getText();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
				aa.click();
				Alert a=driver.switchTo().alert();
				a.accept();
				
				

			   
			   
			}
		@Then("the user should receive a demapping successful message")
		public void the_user_should_receive_a_demapping_successful_message() {
		    WebElement a = driver.findElement(By.xpath("//div[@class='status-img']/following::p[1]"));
		    String text = a.getText();
		    System.out.println(text);
		    Assert.assertEquals(text,"Submitted Successfully !!");
		}



}
