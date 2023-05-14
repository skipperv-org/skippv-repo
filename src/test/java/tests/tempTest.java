package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class tempTest {
    protected JavascriptExecutor jse;

    @Test
    public void testTemp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://uk.wikipedia.org/wiki/ASF");
        sleep(1000);

//        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("google");
        Assert.assertTrue(driver.findElement(By.xpath("//button[@title='Налаштування мови']")).isEnabled());


//        new Actions(driver)
//                .click(driver.findElement(By.xpath("//div[@class='products-list-item prc__item products-list-item--grid']")));       ;
    }

//    protected void clickJS(WebElement element) {
//        jse.executeScript("arguments[0].click()", element);
//    }
//
//    public static void scrollForElement(WebElement element, WebDriver drv) {
//        ((JavascriptExecutor) drv).executeScript("arguments[0].scrollIntoView(true);", element);
//        CommonActions.sleep(200);
//    }
}
