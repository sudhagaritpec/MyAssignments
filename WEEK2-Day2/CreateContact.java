package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		// Refer:
		// https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week2/day2.assignments/CreateContact.java
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("/SFA")).click();

		// Click on Contact Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// a[text()='Leads']
		// a[text()='Create Lead']
		// Click on Create Lead
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("firstName");
		driver.findElement(By.id("lastNameField")).sendKeys("lastName");

		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("createContactForm_lastNameLocal");

		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("createContactForm_lastNameLocal");

		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("createContactForm_departmentName");

		driver.findElement(By.id("createContactForm_description")).sendKeys("createContactForm_description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");

		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));

		Select dd = new Select(findElement);

		dd.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		driver.findElement(By.id("updateContactForm_description")).clear();

		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("updateContactForm_importantNote");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		driver.getTitle();

		System.out.println(driver.getTitle() + "program ends");

		// input[@name='submitButton']

		// driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("companyName");
//		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("firstName");
//		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("lastName");
//		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("firstName(Local)");
//		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("departmentName");
//		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"))
//				.sendKeys("descriptiondescriptiondescription");
//		driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("primaryEmail@gmail.com");
//		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

	}

}
