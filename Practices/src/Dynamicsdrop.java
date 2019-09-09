import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicsdrop{
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		
    }
}
