package LoginRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;
    String txbEmail="//input[@id='email']";
    String txbPassword = "//input[@id='password']";
    String bttLogin = "//input[@name='submit']";
    String bbtLogout = "//input[@value='Log out']";
    String mess = "//b[text()='Enter your Email address and password correct']";



    @BeforeClass
    public void Before(){
        System.setProperty("webdriver.chrome.driver","D:\\java_tester\\Java_1\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");
    }
    @Test
    public void TC_1(){
        WebElement InputEmail = driver.findElement(By.xpath(txbEmail));
        InputEmail.sendKeys();
        WebElement InputPassword = driver.findElement(By.xpath(txbPassword));
        InputPassword.sendKeys("123123");
        WebElement buttonLogin = driver.findElement(By.xpath(bttLogin));
        buttonLogin.click();
        WebElement Message = driver.findElement(By.xpath(mess));
        String Actual = Message.getText();
        Assert.assertEquals(Actual,"Enter your Email address and password correct");
        System.out.println(Actual);
    }
    @AfterClass
    public void after(){}
}
