package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.get("https://www.jio.com/");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		 Thread.sleep(2000); 
		 

	}

}
