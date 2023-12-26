package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic5 {
    ChromeDriver driver;
    @BeforeClass
    public void f(){
        System.setProperty("webdriver.chrome.driver", "D:\\java_tester\\Java_1\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
    }
    @Test
    public void Test(){
        //Title
        String slbTitle = "//select[@id='user_title']";
        Select Title = new Select(driver.findElement(By.xpath(String.format(slbTitle))));
        Title.selectByVisibleText("Mrs");
        //FirstName
        String txbFirstName ="//input[@id='user_firstname']";
        WebElement FirstName = driver.findElement(By.xpath(txbFirstName));
        FirstName.sendKeys("Khai");
        //SurName
        String txbSurname = "//input[@id='user_surname']";
        WebElement Surname = driver.findElement(By.xpath(txbSurname));
        Surname.sendKeys("Do");
        //Phone
        String txbPhone="//input[@id='user_phone']";
        WebElement Phone = driver.findElement(By.xpath(txbPhone));
        Phone.sendKeys("0797653680");
        //Year
        String slbYear ="//select[@id='user_dateofbirth_1i']";
        Select Year = new Select(driver.findElement(By.xpath(String.format(slbYear))));
        Year.selectByVisibleText("1999");
        System.out.println(Year);
        String slbMonth ="//select[@name='month']']";
        String slbDay ="//select[@name='date']";
        String rdbFull = "label[for='licencetype_t']";
        String cbbLicence = "//select[@id='user_licenceperiod']";
        String slbOccupation="//select[@id='user_occupation_id']";
        String txbAddress = "//input[@id='user_address_attributes_street']";
        String txbCity = "//input[@id='user_address_attributes_city']";
        String txbCounty = "//input[@id='user_address_attributes_county']";
        String txbPostCode = "//input[@id='user_address_attributes_postcode']";
        String txbEmail = "//input[@id='user_user_detail_attributes_email']";
        String txbPassWord = "//input[@id='user_user_detail_attributes_password']";
        String txbConFirm = "//input[@id='user_user_detail_attributes_password_confirmation']";
        String bttReset = "//input[@id='resetform']";
        String bttCreate = "//input[@name='submit']";




    }

    @AfterClass
    public void AfterClass(){

    }
}
