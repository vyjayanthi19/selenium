+package elementlocate;
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class ElementLocatorIV {
+	
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
+		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("training@jalaacademy.com");
+		
+		driver.findElement(By.xpath("//input[@class='form-control' and @type='password']")).sendKeys("jobprogram");
+		
+		driver.findElement(By.partialLinkText("Sign ")).click(); 
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
+}