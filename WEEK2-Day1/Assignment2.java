package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("/SFA")).click();
		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		/*
		 * a. Enter CompanyName Field Using id Locator b. Enter FirstName Field Using id
		 * Locator c. Enter LastName Field Using id Locator d. Enter FirstName(Local)
		 * Field Using id Locator e. Enter Department Field Using any Locator of Your
		 * Choice f. Enter Description Field Using any Locator of your choice g. Enter
		 * your email in the E-mail address Field using the locator of your choice
		 */
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("companyName");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastName");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("firstName(Local)");
		driver.findElement(By.name("departmentName")).sendKeys("departmentName");
		driver.findElement(By.name("description")).sendKeys("descriptiondescriptiondescription");
		driver.findElement(By.name("primaryEmail")).sendKeys("primaryEmail@gmail.com");
		/*
		 * a. Click on Create Button b. Click on edit button c. Clear the Description
		 * Field using .clear() d. Fill ImportantNote Field with Any text 1e. Click on
		 * update button f. Get the Title of Resulting Page. refer the video using
		 * driver.getTitle()
		 */
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("importantNote");
		driver.findElement(By.name("submitButton")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

	}

}
