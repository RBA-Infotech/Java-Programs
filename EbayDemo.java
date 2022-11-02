package ProjectsDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayDemo {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));

        //clicking on advanced button
		driver.findElement(By.xpath("//*[@id=\"gh-as-a\"]")).click();
		
		boolean flag = true;
		
		//validating ehteher page is opened or not
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Advanced Search']")));
		}catch(TimeoutException te) {
			System.out.println("The button advanced has not been clicked");
			flag = false;
			captureScreenshot("Advanced Button Failure");
		}
		
		if(flag) 
			System.out.println("Clicking Advanced button is successful");
		else
			System.out.println("Clicking Advanced button is failure");
		
		
		boolean result=driver.findElement(By.xpath("//*[text()='Advanced Search']")).isDisplayed();
		if(result) {		
		      System.out.println("Advanced Search is opened");
		}
		
		//sending data to input
		driver.findElement(By.xpath("//*[@id=\"_nkw\"]")).sendKeys("Phone");
		wait(1000);
	
		//accessing data in select box	
		Select sel=new Select( driver.findElement(By.xpath("//*[@id=\"_in_kw\"]")));
		sel.selectByIndex(1);
		wait(1000);
		
		//sending data to price range
		driver.findElement(By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[2]")).sendKeys("10000");
		wait(500);
		driver.findElement(By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[3]")).sendKeys("50000");
		wait(500);
		
		//clicking on new checkbox
		driver.findElement(By.xpath("//*[@id=\"LH_ItemConditionNew\"]")).click();
		wait(1000);
		
		//selecting location
		Select sel2= new Select(driver.findElement(By.xpath("//*[@id=\"_sargnSelect\"]")));
		sel2.selectByIndex(1);
		
		//serach button clicked
		driver.findElement(By.xpath("//*[@id=\"searchBtnLowerLnk\"]")).click();
		wait(1000);
		
		//click on best item
		String noOfItem=  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]")).getText();
		System.out.println(noOfItem);
		wait(1000);
		driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[1]/div/div[1]/div[3]/div[1]/div/span/button/span/span")).click();
		wait(1000);		
		driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[1]/div/div[1]/div[3]/div[1]/div/span/span/ul/li[5]")).click();
		
		//prinitng 3 items
		for(int i=2;i<6;i++) {
		       System.out.println(driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li["+i+"]/div/div[2]/a/div/span")).getText());
		       System.out.println(driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li["+i+"]/div/div[2]/div[2]/div[1]/span")).getText());
		}
	}

	public static void wait(int a) {
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void captureScreenshot(String scrnShotName) {
		System.out.println("Screen shot for " + scrnShotName);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss"); //yyyy-MM-dd
		String dateTime = sdf.format(date);  // 31-10-2022_12_37_25
		String fileName = "screenshot_" + dateTime;  // screenshot_31-10-2022_12_37_25
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("Screenshots\\" + fileName + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
