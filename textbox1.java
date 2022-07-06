package textboxop;
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.JavascriptExecutor;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class WebElementOp {
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
+		driver.get("http://magnus.jalaacademy.com/");
+
+	}
+	// 1] typing in text box by using sendKeys
+
+	@Test(priority = 1)
+	public void locatortest() {
+
+		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
+
+		driver.findElement(By.name("Password")).sendKeys("jobprogram");
+
+		driver.findElement(By.id("btnLogin")).click();
+
+	}
+
+	// 2] typing in text box by using javaScriptExecutor
+
+	@Test(priority = 2)
+
+	public void webElementTest() {
+
+		JavascriptExecutor js = (JavascriptExecutor) driver;
+
+		js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
+
+	}
+
+	@AfterMethod
+
+	public void closebrowser() {
+
+		//driver.close();
+
+		
+	}
+
+}