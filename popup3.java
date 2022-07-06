+package popup;
+
+import org.openqa.selenium.Alert;
+import org.openqa.selenium.By;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class PopUpTestIII {
+
+	WebDriver driver;
+
+	@BeforeMethod
+
+	public void launchbrowser() {
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
+		driver.get("http://magnus.jalaacademy.com/Account/Login");
+
+	}
+
+	@Test
+	public void popup() throws InterruptedException {
+
+		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
+
+		driver.findElement(By.name("Password")).sendKeys("jobprogram");
+
+		driver.findElement(By.id("btnLogin")).click();
+
+		Thread.sleep(2000);
+
+		driver.findElement(By.linkText("More")).click();
+
+		Thread.sleep(2000);
+
+		driver.findElement(By.linkText("Popups")).click();
+
+		Thread.sleep(2000);
+
+		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
+
+		Alert aler = driver.switchTo().alert();
+
+		aler.sendKeys("Gopi");
+
+		Thread.sleep(2000);
+
+		 aler.accept();
+
+	}
+
+	@AfterMethod
+
+	public void closebrowser() {
+
+		// driver.close();
+
+	}
+
+}