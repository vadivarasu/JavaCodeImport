import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'header-signin-link\']/span")).click();
		driver.findElement(By.cssSelector("#createacc")).click();
		driver.findElement(By.cssSelector("[id*='firstName']")).sendKeys("Ricky");
		driver.findElement(By.cssSelector("[id*='lastName']")).sendKeys("Ponting");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("rickyvadi1909");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Vadii@1909");
		driver.findElement(By.xpath("//input[contains(@id,'phone')]")).sendKeys("7859652658");
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.manage().window().maximize();
		//driver.findElement(By.linkText("Need Help?")).click();
		
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
