+package dropdown;
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class SingleWindowHandle {
+	
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
+	public void windowhandle() throws InterruptedException {
+		
+		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
+		
+	    driver.findElement(By.name("Password")).sendKeys("jobprogram");
+	    
+	    driver.findElement(By.id("btnLogin")).click();
+	    
+	    String id= driver.getWindowHandle();         //will return only single/current window id ,will not handle multiple window
+	    
+	    System.out.println(" current window id "+id);
+
+     }
+   
+   
+   @AfterMethod
+   
+   public void tearDown() {
+	   
+	   driver.quit();
+   }
+   
+   
+}