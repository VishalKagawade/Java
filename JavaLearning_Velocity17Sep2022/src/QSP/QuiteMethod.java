package QSP;

import org.openqa.selenium.chrome.ChromeDriver;


public class QuiteMethod {
	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.deiver", "./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	    Thread.sleep(4000);
	    driver.quit();
	}


}
