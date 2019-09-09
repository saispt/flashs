import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejetstatic {

	public static void main(String args[]) throws InterruptedException {
		//System.setProperty("Webdriver.chrome.diver","D:\\sai\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\sai\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//s.selectByValue("AED");
		s.selectByIndex(2);
		//s.selectByVisibleText("AED");
		// TODO Auto-generated method stub

	}

}
