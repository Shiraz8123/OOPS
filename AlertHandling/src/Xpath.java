import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shiraz8123ahmed@gmail.com");
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("Blacklist00!");	
		driver.findElement(By.xpath("//div/div[@class='ui fluid large blue submit button']")).click();
		
	}

}
