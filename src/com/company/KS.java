package com.company;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KS {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String email="dmitriy.novikov@worldapp.com";

        driver.get("http://all1-lin-ora-reg.ssstest.com/Registration/Register.action?logon=false&sfRegistration=false");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Dima");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Novikov");
        driver.findElement(By.xpath("//input[@placeholder='Company name']")).sendKeys("sss(qa)");
        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("1234567");
        driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@placeholder='Confirm password']")).sendKeys("1");
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='signUpButton']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@id='loginButton']")).click();
        driver.findElement(By.xpath("//input[@id='11']")).sendKeys(email);
        driver.findElement(By.xpath("//button[@name='searchButton']")).click();
        Thread.sleep(5000);


        Set<String> ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String parentId=it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

        Actions a=new Actions(driver);

        driver.findElement(By.xpath("//button[@id='btnShowRights']")).click();

        //driver.switchTo().window(parentId);
        driver.quit();


    }

}
