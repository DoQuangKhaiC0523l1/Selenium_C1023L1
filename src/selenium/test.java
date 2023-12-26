package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver ;
    @BeforeClass
    public void f(){
        System.setProperty("webdriver.chrome.driver", "D:\\java_tester\\Java_1\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
    }
    @Test
    public void test(){
        String txbfirstName = "//input[@id='firstName']";
        String txblastName = "//input[@id='lastName']";
        String txbEmail = "//input[@id='userEmail']";
        String rdbMale = "//input[@value='Male']";
        String rdbFemale = "//input[@value='Female']";
        String rdbOther = "//input[@value='Other']";
        String rdbGender="//input[@value = '%s']";
        String txbMobile = "//input[@id='userNumber']";
        String txbdateOfBirth = "//input[@id='dateOfBirthInput']";
        String txbSubjects = "//div[@id='subjectsContainer']";
        String cxbSport = "//input[@id='hobbies-checkbox-1']";
        String cxbReading = "//input[@id='hobbies-checkbox-2']";
        String cxbMusic = "//input[@id='hobbies-checkbox-3']";

//        WebElement firstnameElement = driver.findElement(By.xpath(txbfirstName));
//        WebElement lastNameElement = driver.findElement(By.xpath(txblastName));
//        firstnameElement.sendKeys("aaa");
//        String exptedFirstName = firstnameElement.getAttribute("value");
//        System.out.println(exptedFirstName);
//        lastNameElement.sendKeys("do");
//        String expLastName = lastNameElement.getAttribute("value");
//        System.out.println(expLastName);
//        String slbTitle = "//select[@id='user_title']";
//        Select title = new Select(driver.findElement(By.xpath(slbTitle)));
////        title.selectByValue("Mrs");
////        title.selectByIndex(12);
//        String optionTitle = "//select[@id='user_title']//option[text()='%s']";
//        String optTitle = "//select[@id='user_title']//option";
////        title.selectByVisibleText("Sir");
////
////        WebElement optTitle= driver.findElement(By.xpath(String.format(optionTitle,"Sir")));
////        String exp = optTitle.getAttribute("selected");
////        System.out.println(exp);
//        List <WebElement> numberOption = driver.findElements(By.xpath(optTitle));
//        int numBer = numberOption.size();
//        System.out.println(numBer);
//        String cxbSports = "//label[@for='hobbies-checkbox-1']";
//        driver.findElement(By.xpath(cxbSports)).click();
        String iFrame= "//iframe[@id='frame1']";
        WebElement frame = driver.findElement(By.xpath(iFrame));
        driver.switchTo().frame(frame);
        String H1 ="//h1[@id='sampleHeading']";
        WebElement h1= driver.findElement(By.xpath(H1));
        System.out.println(h1.getText());
        driver.switchTo().defaultContent();

    }
    @AfterClass
    public void AfterClass(){
    driver.close();
    }
}
