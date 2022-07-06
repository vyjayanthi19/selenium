+package testMiscellaneous;
+
+import java.io.IOException;
+import java.util.ArrayList;
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
+public class BrokenLinks {
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
+	
+	
+	@Test
+	public void brokenlinks() throws IOException, InterruptedException {
+		
+		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
+		
+	    driver.findElement(By.name("Password")).sendKeys("jobprogram");
+	    
+	    driver.findElement(By.id("btnLogin")).click();
+	    
+	    Thread.sleep(2000);
+	    
+	    driver.findElement(By.linkText("More")).click();
+		  
+	    Thread.sleep(1000);
+	    
+	    driver.findElement(By.linkText("Links")).click();
+	    Thread.sleep(1000);
+	    
+	    
+       List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
+		
+		totalLinks.addAll(driver.findElements(By.tagName("img")));
+		
+		System.out.println(  "total links "+totalLinks.size());
+		
+        ArrayList<WebElement> activelinks=new ArrayList<WebElement>();
+		
+		for(int i=0; i<totalLinks.size(); i++) {
+			
+			if(totalLinks.get(i).getAttribute("href") !=null && (! totalLinks.get(i).getAttribute("href").contains("javascript"))) {
+				activelinks.add(totalLinks.get(i)); // checking attribute of links
+				
+				
+			}
+				
+			}
+		
+		System.out.println(activelinks.size());
+		
+		int brokenlinks= (totalLinks.size())-(activelinks.size());
+		
+		System.out.println("total broken links "+brokenlinks);
+
+		   
+	    
+	}
+		
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