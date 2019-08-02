import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		
		WebElement ele= driver.findElement(By.xpath("//input[@name='email']"));
		JavaScript.sendKeys(ele, driver);
		Thread.sleep(3000);
		//
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("Blacklist00!");	
		driver.findElement(By.xpath("//div/div[@class='ui fluid large blue submit button']")).click();
		
	}

public static void sendKeys(WebElement element, WebDriver driver){
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("document.getElementById('ele').value='shiraz8123ahmed@gmail.com')");
}
}