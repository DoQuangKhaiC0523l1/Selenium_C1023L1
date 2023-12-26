package ThucHanh2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public  class ThucHanh {
    static WebDriver driver;

    private String txbEmail = "//input[@name='email']";
    private String txbPass = "//input[@name='password']";
    private String bttLogin = "//button[text()='Sign in']";
    private String getUserName = "//div[text()='admin@demo.com']";
    private String getPassWord = "//div[text()='riseDemo'][1]";
    private String ClickTask = "//a[@href='https://rise.fairsketch.com/tasks/all_tasks']";
    private String ClickAddTask ="//a[@class='btn btn-default'][normalize-space()='Add task']";
    private String txbTitle="//input[@id='title']";
    private String txbDescription="//textarea[@id='description']";
    private String clickRelate = "//div[@id='s2id_task-context']";
    private String cbbRelated ="//div[@id='select2-drop']//div[text()='Client']";
//    private String txbTitle="//input[@id='title']";
//    private String txbTitle="//input[@id='title']";
//    private String txbTitle="//input[@id='title']";
//    private String txbTitle="//input[@id='title']";
//    private String txbTitle="//input[@id='title']";

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
        clickTask();
        clickAddTask();
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
    public void clickTask(){
        WebElement task = driver.findElement(By.xpath(ClickTask));
        task.click();
    }
    public void clickAddTask(){
        WebElement addTask=driver.findElement(By.xpath(ClickAddTask));
        addTask.click();
        WebElement inputTitle = driver.findElement(By.xpath(txbTitle));
        inputTitle.sendKeys("Demo2");
        WebElement inputDesc = driver.findElement(By.xpath(txbDescription));
        inputDesc.click();
        inputDesc.sendKeys("Thuc hanh bai tap");
        WebElement clickRelatedto = driver.findElement(By.xpath(clickRelate));
        clickRelatedto.click();
        WebElement relate = driver.findElement(By.xpath(cbbRelated));
        relate.click();




    }

    @AfterClass
    public static void after() {
}}
