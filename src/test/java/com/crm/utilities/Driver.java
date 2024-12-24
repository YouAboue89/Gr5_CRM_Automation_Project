package com.crm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver() {

    }

    private static WebDriver driver;


    public static WebDriver getDriver() {

        if (driver == null) {

            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {

           /*
           This line will terminate the currently existing driver completely. it will not exist going forward.
            */
            driver.quit();
           /*
           We assign the value back to "null" so that my "Sing
            */
            driver = null;

        }
    }
}
