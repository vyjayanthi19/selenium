+package radiobuttons;
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
+public class RadioButtonII {
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
+		driver.get("http://magnus.jalaacademy.com/Account/Login");
+		
+		
+	}
+	
+	
+	@Test
+	public void radiobuttontest() throws InterruptedException {
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
+		driver.findElement(By.linkText("CSS Properties")).click();
+
+		Thread.sleep(2000);
+		
+		driver.findElement(By.linkText("Buttons")).click();
+		
+		
+		
+		
+		List<WebElement>  ck= driver.findElements(By.xpath("//div[@id='tab_3']//button"));
+		
+		
+		System.out.println(ck.size());
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
+		
+	}
+
+
+}