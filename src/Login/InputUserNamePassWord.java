package Login;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public  class InputUserNamePassWord {
    static WebDriver driver;

    private String txbEmail = "//input[@name='email']";
    private String txbPass = "//input[@name='password']";
    private String bttLogin = "//button[text()='Sign in']";
    private String getUserName = "//div[text()='admin@demo.com']";
    private String getPassWord = "//div[text()='riseDemo'][1]";

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "D:\\java_tester\\Java_1\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rise.fairsketch.com/signin");
    }

    @Test
    public void test() {
        inputEmailPass();
    }

    public String GetUserName() {
        WebElement UserName = driver.findElement(By.xpath(getUserName));
        return UserName.getText();
    }

    public String GetPass() {
        WebElement Pass = driver.findElement(By.xpath(getPassWord));
        return Pass.getText();
    }

    public void inputEmailPass() {
        String Email = GetUserName();
        String PassWord = GetPass();
        WebElement email = driver.findElement(By.xpath(txbEmail));
        email.clear();
        email.sendKeys(Email);
        WebElement pass = driver.findElement(By.xpath(txbPass));
        pass.clear();
        pass.sendKeys(PassWord);
        WebElement Login = driver.findElement(By.xpath(bttLogin));
        Login.click();
    }

    @AfterClass
    public static void after() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
}}
