import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> handles= driver.getWindowHandles();
		System.out.println(handles.size());
		ArrayList<String> arr= new ArrayList<String>(); 
		
		for(String w: handles){
			driver.switchTo().window(w);
		arr.add(driver.getTitle());
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}		
		if(driver.getTitle().equals("Amazon")){ 
			driver.close();
		}
			if(driver.getTitle().equals("Sierra Cedar")){
				driver.close();
			}
				if(driver.getTitle().equals("Sykes"))
			driver.close();
		}
		
		
	}

}
