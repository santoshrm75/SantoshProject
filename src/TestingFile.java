import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestingFile {

public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","G:\\OUPI_Automation\\OUP_Oxford\\exefiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// Navigate to URL
		driver.get("http://203.129.242.98/OxfordAdvantage/School/Home.aspx");
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		driver.findElement(By.id("txtEmail")).sendKeys("superhod");
		// Enter Password
		driver.findElement(By.id("txtPWD")).sendKeys("school");
		//driver.findElement(By.id("txcSC")).sendKeys("000");
		// Wait For Page To Load
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Click on 'Sign In' button
		driver.findElement(By.id("btnSignIn")).click();
		//////
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		System.out.println(browserName);
		String v = cap.getVersion().toString();
		System.out.println(v);
		System.out.println(browserName +"" +" "+v);
	}

}
