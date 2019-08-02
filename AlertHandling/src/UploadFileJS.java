import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.findElement(By.id("btn_basic_example")).click();
		
		

	}

}
