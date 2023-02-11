package abstraction;

import org.openqa.selenium.chrome.chromeDrive;

public class closeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe"); 
		ChromeDriver driver=new chromeDrive();
		driver.manage().window().maximize();
		driver.get("https://wwww.instagram.com/");
		Thread.sleep(4000);
		driver.close();

	}

}
