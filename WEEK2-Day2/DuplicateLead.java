package week2.day2;
/*
 * /*http://leaftaps.com/opentaps/control/main
 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Enter UserName and Password Using Id Locator
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("/SFA")).click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String str = driver.findElement(By.xpath("//a[text()='Assignment']")).getText();
		System.out.println(str);

		driver.findElement(By.xpath("//a[text()='Assignment']")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

		String dl = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();

		if (dl.equalsIgnoreCase("duplicate lead")) {
			System.out.println(dl + "is correct");
		}

		else {
			System.out.println(dl + "is not correct");
		}

		if (str.equalsIgnoreCase("assignment")) {
			System.out.println(str + "is same as of assignment");
		}

		else {
			System.out.println(str + "is not same as of assignment");
		}

		System.out.println("program ends");
	}

}
