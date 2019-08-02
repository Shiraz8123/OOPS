import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagnumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.76.71.36:8080/webapp/web-api-demo/#/user-preferences");
		String s1=driver.getTitle();

		System.out.println(s1);
		driver.findElement(By.linkText("New Application")).click();
		
		
	}

}
