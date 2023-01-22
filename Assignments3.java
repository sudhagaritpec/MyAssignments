package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignments3 {

	/*
	 * Assignment 3:Duplicate Lead 1. Launch URL
	 * "http://leaftaps.com/opentaps/control/login" 2. Enter UserName and Password
	 * Using Id Locator 3. Click on Login Button using Class Locator 4. Click on
	 * CRM/SFA Link 5. Click on Leads Button 6. Click on Create Lead 7. Enter
	 * CompanyName Field Using id Locator 8. Enter FirstName Field Using id Locator
	 * 9. Enter LastName Field Using id Locator 10. Enter FirstName(Local) Field
	 * Using id Locator 11. Enter Department Field Using any Locator of Your Choice
	 * 12. Enter Description Field Using any Locator of your choice 13. Enter your
	 * email in the E-mail address Field using the locator of your choice 14. Click
	 * on Create Button 15. Get the Title of Resulting Page(refer the video) using
	 * driver.getTitle() 16. Click on Duplicate button 17. Clear the CompanyName
	 * Field using .clear() And Enter new CompanyName 18.Clear the FirstName Field
	 * using .clear() And Enter new FirstName 19.Click on Create Lead Button 20. Get
	 * the Title of Resulting Page(refer the video) using driver.getTitle()
	 */

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

		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("newCompanyName");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("newFirstName");
		driver.findElement(By.className("smallSubmit")).click();
		String pageTitle1 = driver.getTitle();
		System.out.println(pageTitle1);

	}

}
