import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		Dimension d = new Dimension(400,500);
		driver.manage().window().setSize(d);

        Point p = new Point(450,350);
		driver.manage().window().setPosition(p);

	}

}
