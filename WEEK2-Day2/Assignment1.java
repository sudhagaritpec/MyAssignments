package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		// driver.findElement(By.xpath("//*[@id='u_0_0_H0']")).click();
		// driver.findElement(By.id("u_0_0_H0")).click();

		//// a[@id='u_0_0_F3']

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("firstname");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lasttname");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abcpassword");

		WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));

		Select select = new Select(birthDay);

		select.selectByValue("14");

		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));

		Select select1 = new Select(birthMonth);

		select1.selectByValue("9");

		WebElement birthYesr = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		Select select2 = new Select(birthYesr);

		select2.selectByValue("1989");

		driver.findElement(By.xpath("//input[@class='_8esa']")).click();

		//driver.close();

		System.out.println("Program ends");
	}

}
