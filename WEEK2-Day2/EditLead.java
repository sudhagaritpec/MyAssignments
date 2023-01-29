package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*http://leaftaps.com/opentaps/control/main
			
			* 1	Launch the browser
			* 2	Enter the username
			* 3	Enter the password
			* 4	Click Login
			* 5	Click crm/sfa link
			* 6	Click Leads link
			* 7	Click Find leads
			* 8	Enter first name
			* 9	Click Find leads button
			* 10 Click on first resulting lead
			* 11 Verify title of the page
			* 12 Click Edit
			* 13 Change the company name
			* 14 Click Update
			* 15 Confirm the changed name appears
			* 16 Close the browser (Do not log out)
  
 */

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EditLead a6 = new EditLead();
		a6.editLead();

	}

	public void editLead() {
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

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sudhagar");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='12801']")).click();
		String str = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();

		if (str.equalsIgnoreCase("view lead")) {
			System.out.println(str + " " + "--Title is correct");
		}

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("company name is updated");
		String ut = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getAttribute("value");
		//System.out.println(ut);

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		//System.out.println("update button clicked");

		if (ut.equalsIgnoreCase("company name is updated")) {
			System.out.println(ut + " " + "--Company name is correct");
		}

		//System.out.println("program ends");
		
		driver.close();

	}

}
