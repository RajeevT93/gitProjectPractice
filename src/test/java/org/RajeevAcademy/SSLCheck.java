package org.RajeevAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLCheck {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\rajee\\Downloads\\edgedriver\\msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();

        options.setAcceptInsecureCerts(true);
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();

    }
}
