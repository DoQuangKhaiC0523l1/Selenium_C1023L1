package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

public class Topic6 {
    Actions actions;
    WebDriver driver;
    String imgAvatar = "//h5[contains(text(),'user1')]/preceding::img[@alt='User Avatar']";
    String toolTip = "//div[@role='tooltip']";
    String Age = "//input[@id='age']";
    String iframe= "//iframe";
        @BeforeClass
        public void Before(){
            System.setProperty("webdriver.chrome.driver", "D:\\java_tester\\Java_1\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://jqueryui.com/tooltip/");
        }
    @Test
    public void Test(){
        actions = new Actions(driver);
//        WebElement IMGAvatar = driver.findElement(By.xpath(imgAvatar));
//        actions.moveToElement(IMGAvatar).build().perform();
        WebElement frame = driver.findElement(By.xpath(iframe));
        driver.switchTo().frame(frame);
        WebElement age = driver.findElement(By.xpath(Age));
        WebElement tooltip= driver.findElement(By.xpath(toolTip));
        actions.moveToElement(tooltip).build().perform();


    }
    @AfterClass
    public void After(){

    }
}
