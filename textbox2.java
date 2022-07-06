+package textboxop;
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.WebElement;
+import org.openqa.selenium.chrome.ChromeDriver;
+import org.testng.annotations.AfterMethod;
+import org.testng.annotations.BeforeMethod;
+import org.testng.annotations.Test;
+
+public class WebElementOpII {
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
+		driver.get("http://magnus.jalaacademy.com/");
+		
+		
+	}
+	
+	
+	@Test
+	public void locatortest() {
+		
+	WebElement wt=	driver.findElement(By.name("UserName"));
+	
+	wt.sendKeys("training@jalaacademy.com");
+	
+	String st=wt.getAttribute("value");
+	
+	System.out.println(st);
+		
+		
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
+}