package Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\resources\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("BUTTONS")).click();
		driver.findElement(By.xpath("//*[@id=\"btn_one\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("#btn_two")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.linkText("CONTACT US FORM TEST")).click();
		driver.findElement(By.name("first_name")).sendKeys("Phiphsuh");

		Thread.sleep(5000);
		driver.close();
		System.out.println("over");

	}

}
