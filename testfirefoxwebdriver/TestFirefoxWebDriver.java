package testfirefoxwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxWebDriver {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\wamp\\www\\seleniumproj\\somedrivers\\geckodriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.coursera.org/specializations/software-testing-automation");

        TimeUnit.SECONDS.sleep(5);

        WebElement search = driver.findElement(
            By.cssSelector("input[placeholder='What do you want to learn?']")
        );

        search.sendKeys("economics");
        search.sendKeys(Keys.ENTER);

        TimeUnit.SECONDS.sleep(5);

        driver.close();

    }
}
