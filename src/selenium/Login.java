package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
    Actions actions;
     WebDriver driver;

    String txlHere= "//a[text()='here']";
    String txbEmail="//input[@name='emailid']";
    String bttSubmit = "//input[@name='btnLogin']";
     String UserName = "//td[text()='User ID :']/following::td";
     String PassWord = "//td[text()='Password :']/following::td";
    String txbUserId="//input[@name='uid']";
    String txbPassWord="//input[@name='password']";
    String bttLogin = "//input[@name='btnLogin']";

    @BeforeClass
    public void Before(){
        System.setProperty("webdriver.chrome.driver", "D:\\java_tester\\Java_1\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V1/index.php");
        actions = new Actions(driver);

    }
    @Test
    public void Main(){
    Here();
    Email();
    InputUserNamePassWord();
    LogOut();

    }
    public void Here(){
        WebElement here = driver.findElement(By.xpath(txlHere));
        here.click();
        driver.navigate().back();
        here.click();
    }
   public void Email(){
        WebElement Email = driver.findElement(By.xpath(txbEmail));
        Email.sendKeys("khaidz@gmail.com");
        WebElement Submit = driver.findElement(By.xpath(bttSubmit));
        Submit.click();
    }
    public String getUserName(){
        WebElement userName = driver.findElement(By.xpath(UserName));
       return userName.getText();
    }
    public String getPassWord(){
        WebElement passWord = driver.findElement(By.xpath(PassWord));
        return passWord.getText();
    }
    public void InputUserNamePassWord(){
//Get UserName and Pass
        String userNameValue = getUserName();
        String passWordValue = getPassWord();

            // Back Login Page
            driver.navigate().back();
            driver.navigate().back();
        // Input UserName and Password
        WebElement inputUserID = driver.findElement(By.xpath(txbUserId));
        inputUserID.sendKeys(userNameValue);
        WebElement inputPassWord = driver.findElement(By.xpath(txbPassWord));
        inputPassWord.sendKeys(passWordValue);

        // Click the login button
        WebElement bttlogin = driver.findElement(By.xpath(bttLogin));
        actions.click(bttlogin).build().perform();

    }

    public void LogOut(){
        String LogOut ="//a[text()='Log out']";
        WebElement logOut = driver.findElement(By.xpath(LogOut));
        actions.click(logOut).build().perform();
    }
    @AfterClass
    public void After(){
        driver.close();
    }
}
