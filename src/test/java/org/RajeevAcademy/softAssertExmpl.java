package org.RajeevAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.*;
import java.util.List;

public class softAssertExmpl {

    public static void main(String[] args) throws URISyntaxException, IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\rajee\\Downloads\\edgedriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 2000)");


        List<WebElement> links = driver.findElements(By.cssSelector(".gf-t tbody tr td ul li a"));
        System.out.println(links.size());


        SoftAssert a = new SoftAssert();
        for (WebElement link : links){
            String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);


            //a.assertTrue(respCode<400, "The Link with Text" + link.getText() + " is broken with code" + respCode);
            if (respCode > 300){
                System.out.println("The Link with Text " +  link.getText()+ " is broken with code " + respCode);
            }
        }
        a.assertAll();
    }
}
