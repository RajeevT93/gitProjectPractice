package org.RajeevAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

public class practiceOne {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\rajee\\Downloads\\edgedriver\\msedgedriver.exe");
        driver = new EdgeDriver();



        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();


    }


    @Test(dataProvider = "getData")
    public void login(HashMap<String, String> input) throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//input[contains(@id,'userEmail')]"));
        email.sendKeys(input.get("emaill"));
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'userPassword')]"));
        password.sendKeys(input.get("passwordd"));
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);
        //driver.quit();
    }



    @DataProvider
    public Object[][] getData(){
//        Object[][] data = new Object[2][2];
//
//        data[0][0] = "Raju.babuuuuuu@gmail.com";
//        data[0][1] = "Raju@babu99";
//
//        data[1][0] = "Raju22.babuuuuuu@gmail.com";
//        data[1][1] = "Raju@babu99";
//        return data;
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("emaill", "Raju.babuuuuuu@gmail.com");
        map.put("passwordd", "Raju@babu99");

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("emaill", "Raju22.babuuuuuu@gmail.com");
        map1.put("passwordd" , "Raju@babu99");
        return new Object[][] {{map}, {map1}};
    }
}