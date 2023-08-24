import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroSel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/reddy/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "/Users/reddy/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractice");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
