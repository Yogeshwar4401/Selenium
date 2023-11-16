package WebDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles1 {

	public static void main(String[] args) throws InterruptedException {
				
				ChromeDriver d=new ChromeDriver();
				d.manage().window().maximize();
				d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
				Thread.sleep(5000);
				d.findElement(By.id("newWindowBtn")).click();
				Set<String> a= d.getWindowHandles();
				System.out.println(a);
			//	Thread.sleep(2000);
//				d.quit();
//				
//				ChromeDriver d=new ChromeDriver();
//				d.manage().window().maximize();
//				d.get("https://letcode.in/windows");
//				d.findElement(By.xpath("//button[text()='Muiltiple windows']")).click();
//				Set <String> allid = d.getWindowHandles();
//				System.out.println(allid);
//  			d.quit();
//				d.close();
	}

}
