package selenium.khai;

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
        WebElement InputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement InputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement buttonLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        WebElement buttonLogout = driver.findElement(By.xpath("//input[@value='Log out']"));
        WebElement Message = driver.findElement(By.xpath("//input[@id='email']"));

        System.out.println("Step-1: Do not input Email and all data valid");
        InputEmail.sendKeys();
        InputPassword.sendKeys("123123");
        buttonLogin.click();
        String Actual = Message.getText();
        Assert.assertEquals(Actual,"Enter your Email address and password correct","Sai thông báo");
        buttonLogout.click();
    }
    @AfterClass
    public void after(){}
}
