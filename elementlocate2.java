+package elementlocate;
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class ElementLocatorII {
+	
+	WebDriver driver;
+	
+	 
+	@BeforeMethod
+	
+	public void launchbrowser() {
+		
+
+		System.setProperty("webdriver.chrome.driver",
+				"H:\\Work\\JalaTech\\chromedriver_win32\\chromedriver.exe");
+		
+		 driver=new ChromeDriver();
+		
+		driver.manage().window().maximize();
+	   
+		driver.manage().deleteAllCookies();
+		
+		driver.get("http://magnus.jalaacademy.com");
+		
+		
+	}
+	
+	
+	@Test
+	public void locatortest() {
+		
+		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
+		
+		driver.findElement(By.cssSelector("#Password")).sendKeys("jobprogram");
+		
+		driver.findElement(By.className("_btn btn-primary btn-flat")).click(); //failed bcoz class name is not unique  ...
+		
+		
+		}
+	
+
+	
+	@AfterMethod
+	
+	public void closebrowser() {
+		 
+		driver.close();
+		
+		
+	}
+
+
+
+
+}