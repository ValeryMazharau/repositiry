package autoupdate;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class UpdateMonsterTampa {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void log() {
        wd.get("https://login20.monster.com/Login/SignIn?");
        wd.findElement(By.id("EmailAddress")).click();
        wd.findElement(By.id("EmailAddress")).clear();
        wd.findElement(By.id("EmailAddress")).sendKeys("mazharau.valery+3@gmail.com");
        wd.findElement(By.id("Password")).click();
        wd.findElement(By.id("Password")).clear();
        wd.findElement(By.id("Password")).sendKeys("smash2163666");
        wd.findElement(By.id("btn-login")).click();
        wd.findElement(By.className("skip-offer")).click();
        wd.findElement(By.id("subnav-link-1")).click();
        wd.findElement(By.xpath("//div[@id='subnav-sub-1']//a[.='Edit Profile']")).click();
        wd.findElement(By.linkText("Experience")).click();
        wd.findElement(By.linkText("Edit")).click();
        wd.findElement(By.id("Location")).sendKeys(Keys.TAB," "+Math.floor(Math.random()));
        WebElement webElement = wd.findElementByXPath(".//*[@id='btn-saveExperience']");
        webElement.sendKeys(Keys.TAB);
        webElement.sendKeys(Keys.ENTER);
        
        wd.findElement(By.id("subnav-link-1")).click();
        wd.findElement(By.xpath("//div[@id='subnav-sub-1']//a[.='Sign Out']")).click();

          
        
        
        
        System.out.println("UpDate Monster Tampa done"); 
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