import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.utilities.Assert;

import java.util.concurrent.TimeUnit;

public class CreateSurveys {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String login="dmitriy.novikov@worldapp.com";
        String password="1";
        String url="http://all1-lin-ora-reg.ssstest.com/Member/UserAccount/UserLogin.action";
        String formName="A3q1";



        driver.get(url);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//input[@id='login']")).sendKeys(login);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='loginButton']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class='BL FlL']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@id='selectMode_4_3']//b")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='surveyName']")).sendKeys(formName);
        driver.findElement(By.xpath("//div[@id='saveBttnD']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='xfQuestionList']//a")).click();
        driver.findElement(By.xpath("//b[@class='icoPO']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[contains(text(),'Toggle WYSIWYG editor')]")).click();
        driver.findElement(By.xpath("//textarea[@id='questionText']")).sendKeys("PO");
        driver.findElement(By.xpath("//td[@id='tdAns_0']//div[@class='input-field-div']")).sendKeys("A1");
        driver.findElement(By.xpath("//td[@id='tdAns_1']//div[@class='input-field-div']")).sendKeys("A2");
        driver.findElement(By.xpath("//td[@id='tdAns_2']//div[@class='input-field-div']")).sendKeys("A3");
        driver.findElement(By.xpath("//button[@name='saveSurveyButton1']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='xfQuestionList']//a")).click();
        driver.findElement(By.xpath("//b[@class='icoML']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[contains(text(),'Toggle WYSIWYG editor')]")).click();
        driver.findElement(By.xpath("//textarea[@id='questionText']")).sendKeys("ML");
        driver.findElement(By.xpath("//button[@name='saveSurveyButton1']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='xfQuestionList']//a")).click();
        driver.findElement(By.xpath("//b[@class='icoUF']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[contains(text(),'Toggle WYSIWYG editor')]")).click();
        driver.findElement(By.xpath("//textarea[@id='questionText']")).sendKeys("FU");
        driver.findElement(By.xpath("//td[@id='tdAns_0']//div[@class='input-field-div']")).sendKeys("A1");
        driver.findElement(By.xpath("//td[@id='tdAns_1']//div[@class='input-field-div']")).sendKeys("A2");
        driver.findElement(By.xpath("//td[@id='tdAns_2']//div[@class='input-field-div']")).sendKeys("A3");
        driver.findElement(By.xpath("//button[@name='saveSurveyButton1']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@id='btnLayout']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@id='template_10']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//img[@id='tlApplyTheme_4201_true']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@name='LABEL_SURVEY_QUESTION_LIST']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@id='btnPlugin']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@name='AddNewPlugin']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Signature Area Plugin");
        driver.findElement(By.xpath("//a[@id='search-button']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@name='insertPlugin1687']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='default1993_0']")).sendKeys("Q2");
        driver.findElement(By.xpath("//button[@name='saveSurveyButton1']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@name='LABEL_SURVEY_QUESTION_LIST']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@name='LABEL_CONTACTS']")).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@name='cm_name']")).sendKeys("T1");
        driver.findElement(By.xpath("//a[@class='a_create']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(10000);

        driver.findElement(By.xpath("//div[@id='divAddContact']")).click();
        driver.findElement(By.xpath("//input[@id='field_Name']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@id='field_Login']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@id='field_Password']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@name='buttonSave']")).click();
        Thread.sleep(10000);

        driver.quit();
    }

    }
