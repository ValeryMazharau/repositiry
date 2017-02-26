package autoupdate;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdateDiceTampa {
	 FirefoxDriver wd;
	 @BeforeMethod
	
	    public void setUp() throws Exception {
	        wd = new FirefoxDriver();
	        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }
  
  @Test
  public void m() {
	  wd.get("https://www.dice.com/dashboard/login");
      wd.findElement(By.id("email")).click();
      wd.findElement(By.id("email")).clear();
      wd.findElement(By.id("email")).sendKeys("mazharau.valery+3@gmail.com");
      wd.findElement(By.id("password")).click();
      wd.findElement(By.id("password")).clear();
      wd.findElement(By.id("password")).sendKeys("smash2163666");
      wd.findElement(By.xpath("//form[@id='loginDataSubmit']//button[.='Sign In ']")).click();
      wd.findElement(By.xpath("//div[@id='profileForm']/div[1]/div/div[3]/div[2]/div/div/button")).click();
      wd.findElement(By.id("company2")).click();
      wd.findElement(By.id("company2")).clear();
      wd.findElement(By.id("company2")).sendKeys("Minskiy metropolitan"+Math.floor(Math.random()*10));
      wd.findElement(By.xpath("//div[@id='profileForm']//button[.='Done']")).click();
      wd.findElement(By.xpath("//div[@id='profileForm']/div[1]/div/div[3]/div[2]/div/div/button")).click();
      wd.findElement(By.id("resumeFileInput")).click();
      wd.findElement(By.xpath("//div[@id='profileForm']//button[.='Done']")).click();
      wd.findElement(By.linkText("Valery Mazharau")).click();
      wd.findElement(By.cssSelector("button.btn.btn-link")).click();
	  
      System.out.println("UpDate Dice Tampa done"); 
      
    
  }

@AfterMethod
  public void tearDown() {
      wd.quit();
  }
  
  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }
}
