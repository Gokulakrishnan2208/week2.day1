package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		// driver.findElement(By.id("username")).sendKeys("iii");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/22/92");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04259");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8765432");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("222");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("John");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.xyz.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Simon");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Peter");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("54/1 street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Washington");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Sydney");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Florida");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("000123");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("321");
		driver.findElement(By.name("submitButton")).click();
		driver.close();

	}
}
