+package textboxop;
+
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class WebElementOpIV {
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
+		driver.get("http://magnus.jalaacademy.com/");
+		
+		
+	}
+	
+	
+	@Test
+	public void locatortest() throws InterruptedException {
+		
+		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("training@jalaacademy.com");
+		
+		Thread.sleep(5000);
+		
+		driver.findElement(By.xpath("//input[@name='UserName']")).clear();
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
+		//driver.close();
+		
+		
+	}
+}