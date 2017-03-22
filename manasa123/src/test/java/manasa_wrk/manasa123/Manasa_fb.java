package manasa_wrk.manasa123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Manasa_fb {

	public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver","D:/Manasa_Work/lib/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:/Manasa_Work/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("edit");
		driver.findElement(By.xpath("//input[@id='u_0_3']")).sendKeys("g");
		driver.findElement(By.xpath("//input[@id='u_0_6']")).sendKeys("1223123123");
		driver.findElement(By.xpath("//input[@id='u_0_l']")).click();
		
	}

}
