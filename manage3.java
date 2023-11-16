package WebDriver1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		Point p = driver.manage().window().getPosition();
				System.out.println(p.getX());
		      System.out.println(p.getY());
	}

}




