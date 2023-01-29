package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week2/day2.assignments/DeleteLead.java
 */

/*
 * /*http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number 1 91-8754420144
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
 */
public class DeleteLead {

	public static void main(String[] args) {

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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8754420144");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String str = driver.findElement(By.xpath("//a[text()='12776']")).getText();
		System.out.println(str);
		driver.findElement(By.xpath("//a[text()='12776']")).click();

		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12776");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();

		System.out.println(text);

		driver.close();

	}

}
