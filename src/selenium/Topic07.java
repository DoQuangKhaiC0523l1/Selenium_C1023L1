package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic07 {
    WebDriver driver ;
    @BeforeClass
    public void Before(){
        System.setProperty("webdriver.chrome.driver","D:\\java_tester\\Java_1\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
    }
    @Test
    public void test(){
        String button = "//button[normalize-space()='Start']";
        String Text="//div[@id='finish']//h4";
        driver.findElement(By.xpath(button)).click();
        WebElement text = driver.findElement(By.xpath(Text));
    }
    @AfterClass
    public void after(){}
}
