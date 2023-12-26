package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBT {
    Actions actions;
    WebDriver driver;
    String buttonIphone = "//h2[contains(.,\"IPhone\")]/following-sibling::div[@class='actions']//button";
    WebElement Iphone = driver.findElement(By.xpath(buttonIphone));
    String buttonSamsung = "//h2[contains(.,\"Samsung Galaxy\")]/following-sibling::div[@class='actions']//button";
    WebElement Samsung = driver.findElement(By.xpath(buttonSamsung));
    String buttonSony="//h2[contains(.,\"Sony Xperia\")]/following-sibling::div[@class='actions']//button";
    WebElement Sony = driver.findElement(By.xpath(buttonSony));
    String priceIphone = "//span[text()=\"$500.00\"]";
    WebElement PriceIphone = driver.findElement(By.xpath(priceIphone));

    @BeforeClass
    public void Before() {
        System.setProperty("webdriver.chrome.driver", "D:\\java_tester\\Java_1\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://live.techpanda.org/index.php/mobile.html");
        actions= new Actions(driver);
    }
    public void getText(){
        Iphone.click();
    }
    @Test
    public void f(){
        getText();
    }
    @AfterClass
    public void after() throws InterruptedException {
        Thread.sleep(30000);
        driver.close();
    }

}
