package autoupdate;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class UpdateMonsterMiami {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        

         }
    
    @Test
    public void log() throws IOException {
    	wd.get("https://login20.monster.com/Login/SignIn?");
        wd.findElement(By.id("EmailAddress")).click();
        wd.findElement(By.id("EmailAddress")).clear();
        wd.findElement(By.id("EmailAddress")).sendKeys("mazharau.valery+2@gmail.com");
        wd.findElement(By.id("Password")).click();
        wd.findElement(By.id("Password")).clear();
        wd.findElement(By.id("Password")).sendKeys("smash2163666");
        wd.findElement(By.id("btn-login")).click();
        wd.findElement(By.className("skip-offer")).click();
        wd.findElement(By.id("subnav-link-1")).click();
        wd.findElement(By.xpath("//div[@id='subnav-sub-1']//a[.='Edit Profile']")).click();
        wd.findElement(By.linkText("Experience")).click();
        wd.findElement(By.linkText("Edit")).click();
        wd.findElement(By.id("Location")).clear();
        wd.findElement(By.id("Location")).sendKeys(Keys.TAB," "+Math.floor(Math.random()));
        WebElement webElement = wd.findElementByXPath(".//*[@id='btn-saveExperience']");
        webElement.sendKeys(Keys.TAB);
        webElement.sendKeys(Keys.ENTER);
        wd.findElement(By.id("subnav-link-2")).click();
        wd.findElement(By.xpath("//*[@id='subnav-sub-2']/div/div[2]/div/h3/a")).click();
        wd.findElement(By.xpath(".//*[@id='manageResumesContainer']/div[3]/div/a")).click();
        wd.findElement(By.xpath(".//*[@id='btnUploadFromMyComputer']")).click();
        
        
        
        
        
        
        
        
        
        
        
        Runtime.getRuntime().exec("osascript "+"/Users/smash/Downloads/upload1.scpt");		
        		
       
        
        
        wd.findElement(By.id("subnav-link-1")).click();
        
        
        wd.findElement(By.xpath("//div[@id='subnav-sub-1']//a[.='Sign Out']")).click();
        System.out.println("Update Monster Miami done");
          
        
        
        
        

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
