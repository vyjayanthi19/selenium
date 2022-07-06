+package dropdown;
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class FrameHandle {
+	
+WebDriver driver;
+	
+	@BeforeMethod
+	
+	public void setUp() {
+		
+		System.setProperty("webdriver.chrome.driver","H:\\Work\\JalaTech\\chromedriver_win32\\chromedriver.exe");
+		
+	    driver=new ChromeDriver();
+		
+		driver.manage().window().maximize();
+	
+		driver.manage().deleteAllCookies();
+		
+		driver.get("http://magnus.jalaacademy.com/");
+	}
+	
+	
+   @Test()
+	
+	public void frameHandle() throws InterruptedException {
+		
+		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
+		
+	    driver.findElement(By.name("Password")).sendKeys("jobprogram");
+	    
+	    driver.findElement(By.id("btnLogin")).click();
+	    
+        Thread.sleep(2000);
+	    
+	    driver.findElement(By.linkText("More")).click();
+	  
+	    Thread.sleep(2000);
+	    
+	    driver.findElement(By.linkText("iFrames")).click();
+	    
+	    Thread.sleep(1000);
+	    
+	    driver.switchTo().frame("iframe2");
+	    
+	    Thread.sleep(2000);
+	    
+	    
+	    driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Magnus')]")).click();
+	    
+	   
+	    
+     }
+   
+   
+   @AfterMethod
+   
+   public void tearDown() {
+	   
+	   //driver.quit();
+   }
+   
+ 
+
+}