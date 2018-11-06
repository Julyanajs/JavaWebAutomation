import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class GoogleTest {
	
	
	@org.junit.Test
	public void Test() {
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200,765));
//		driver.manage().window().maximize();
//		driver.manage().window().setPosition(new Point(500,100));
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
		
	}
}
