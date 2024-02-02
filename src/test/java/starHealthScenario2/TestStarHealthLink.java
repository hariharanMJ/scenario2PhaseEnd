package starHealthScenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStarHealthLink {
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harih\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
	}
	
	@Test(priority='1')
	public void click_onPlans() throws InterruptedException
	{
		Actions a = new Actions(driver);
		WebElement plan = driver.findElement(By.xpath("//div[@class='Header_nav-link-container__nlUUp dropdown-active flex only-desktop']/descendant::img[2]"));
		a.moveToElement(plan).build().perform();
		Thread.sleep(1500);
	}
	
	@Test(priority='2')
	public void click_on_option() throws InterruptedException
	{
		WebElement formyfamilylink = driver.findElement(By.xpath("//div[@class='ant-popover-inner']/descendant::a[2]"));
		String link1 = formyfamilylink.getText();
		System.out.println(link1);
		
		WebElement formelink = driver.findElement(By.xpath("//div[@class='ant-popover-inner']/descendant::a[1]"));
		String link2 = formelink.getText();
		System.out.println(link2);
		
		WebElement l3 = driver.findElement(By.xpath("//div[@class='ant-popover-inner']/descendant::a[3]"));
		String link3 = l3.getText();
		System.out.println(link3);
		
		WebElement l4 = driver.findElement(By.xpath("//div[@class='ant-popover-inner']/descendant::a[4]"));
		String link4 = l4.getText();
		System.out.println(link4);
		
		WebElement l5 = driver.findElement(By.xpath("//div[@class='ant-popover-inner']/descendant::a[5]"));
		String link5 = l5.getText();
		System.out.println(link5);
		
		
		
	}
}
