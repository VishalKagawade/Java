package QSP;

import org.openqa.selenium.chrome.ChromeDriver;


public class GetTitleMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.deiver", "./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	    String titleOfLoginPage=driver.getTitle();
	    System.out.println(titleOfLoginPage);
	}

}

}
