+package testMiscellaneous;
+
+import java.util.List;
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.WebElement;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class WebTableOperations {
+
+	WebDriver driver;
+
+	@BeforeMethod
+
+	public void launchbrowser() throws InterruptedException {
+
+		System.setProperty("webdriver.chrome.driver",
+				"H:\\Work\\JalaTech\\chromedriver_win32\\chromedriver.exe");
+
+		driver = new ChromeDriver();
+
+		driver.manage().window().maximize();
+
+		driver.manage().deleteAllCookies();
+
+		driver.get("http://magnus.jalaacademy.com/");
+		
+		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
+
+		driver.findElement(By.name("Password")).sendKeys("jobprogram");
+
+		driver.findElement(By.id("btnLogin")).click();
+
+		Thread.sleep(2000);
+
+		driver.findElement(By.linkText("Employee")).click();
+		
+		Thread.sleep(2000);
+
+		driver.findElement(By.linkText("Search")).click();
+		
+		Thread.sleep(2000);
+		
+		driver.findElement(By.id("btnSearch")).click();
+
+	}
+
+	@Test(priority=1)
+
+	public void tableRows() throws InterruptedException {
+
+		List<WebElement> row = driver.findElements(By.xpath("//table[@id='tblEmployee']/tbody/tr"));
+
+		System.out.println("Total number of Rows " + row.size());
+
+	}
+
+	@Test(priority=2)
+
+	public void tableCols() {
+
+		List<WebElement> col = driver
+				.findElements(By.xpath("//table[@id='tblEmployee']/tbody/tr[1]/td"));
+
+		System.out.println("Total number of columns " + col.size());
+
+	}
+
+	@Test(priority=3)
+
+	public void getdata() {
+
+		String sr = driver.findElement(By.xpath("//table[@id='tblEmployee']/tbody/tr[3]/child::*")).getText();
+
+		System.out.println(sr);
+
+	}
+
+	@AfterMethod
+
+	public void tearDown() {
+
+		driver.quit();
+	}
+
+}