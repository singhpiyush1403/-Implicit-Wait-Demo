
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("gh-search-btn")).click();
		driver.quit();
	}
}




import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitlywait {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	try {
	driver.findElement(By.id("gh-search-btn")).click();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println(driver.getTitle());
	System.out.println("Finished");
	driver.close();
	}
}

