package link;
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
+public class LinkTestIII {
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
+		driver.get("http://magnus.jalaacademy.com/Account/Login");
+		
+		
+	}  
+	
+	
+	
+	
+	@Test
+	public void linktestt() throws InterruptedException {
+		
+		
+		
+		//int a=links.size();
+		
+		//System.out.println(a);
+		
+		//for(int i=0;i<=links.size();i++) {
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
+		driver.findElement(By.linkText("Links")).click();
+		
+		Thread.sleep(2000);
+		
+		driver.findElement(By.partialLinkText("Working ")).click();
+		
+		List<WebElement> links=driver.findElements(By.tagName("a"));
+		
+			for(WebElement linkss:links) {
+				
+				System.out.println(linkss.getText());
+			}
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
+	
+}