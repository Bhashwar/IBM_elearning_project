package Elearning_Project.Project_Elearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class project {
	WebDriver driver;
	
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
		
	}
	
	@DataProvider(name = "testcase")
	public Object[][] testdata(){
		
		Object[][] data = new Object[1][2];
		data[0][0]="Sadhguru";
		data[0][1]="@1234";
		return data;
		
	}

	
	
	@Test(dataProvider = "testcase",groups = {"first"})
	
	
	public void main(String userid, String password) throws InterruptedException {

		
		WebElement obj = driver.findElement(By.id("login"));
		obj.sendKeys(userid);
		
		obj = driver.findElement(By.id("password"));
		obj.sendKeys(password);
		
		obj = driver.findElement(By.xpath("//button[@type='submit']"));
		obj.click();
		
		obj = driver.findElement(By.xpath("//*[contains(text(),'Social network')]"));
	    obj.click();
	       
	    Thread.sleep(3000);
	    
	    
	    obj = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div[2]/div/div/div[2]/div/ul/li[5]/a"));
	    obj.click();
	    
	    
	    Thread.sleep(3000);
	    
	    obj = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/a"));
	    obj.click();
	    
	    obj = driver.findElement(By.xpath("//select/following-sibling::div/button"));
	    obj.click();
	    
	    
	    
	    obj = driver.findElement(By.xpath("//a/span[text()='User']"));
	    obj.click();
	    
	    
	    obj = driver.findElement(By.xpath("//input[@type='text']"));
	    obj.sendKeys("Ankit");
	    
	    obj = driver.findElement(By.xpath("//button[@type='submit']"));
	    obj.click();
	    
	    obj = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div[2]/a[2]"));
	    obj.click();
	    
	    
	    Thread.sleep(40000);
	    
	    
	    
	    obj = driver.findElement(By.xpath("//input[@name='subject']"));
	    obj.sendKeys("This is subject of my message");
	    
	   
	    
	   obj = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/fieldset/div[2]/div[1]/textarea"));
	    obj.sendKeys("This is my message");
	    
	    Thread.sleep(40000);

	    obj = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/a"));
	    obj.click();
	    
	    Thread.sleep(60000);
	    
	    obj = driver.findElement(By.xpath("//*[@id='global-modal']/div/div/div[1]/button/span"));
		obj.click();	
		
		
	    String actualalert = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div")).getText();
	    String expectedalert = "Your message has been sent.";
	   
	    SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertEquals(actualalert, expectedalert);
		System.out.println(actualalert);
		Thread.sleep(5000);
	

		obj = driver.findElement(By.xpath("//*[@id='logout_button']"));
		obj.click();	
		System.out.println("test completed");
	}
	
	
	}
	    
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

