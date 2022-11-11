import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Hardcore {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://yopmail.com/en");
        driver.findElement(By.xpath("//a[@href='email-generator']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='cprnd']")).click();
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.get("https://cloud.google.com/");
        driver.findElement((By.xpath("//div[@class='devsite-search-container']"))).click();

        WebElement search = driver.findElement(By.xpath("//input[@class='devsite-search-field devsite-search-query']"));
        search.click();
        search.sendKeys("Google Cloud Pricing Calculator");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(10000);

        driver.findElement(By.xpath("//b[text()='Google Cloud Pricing Calculator']/parent::a")).click();
        Thread.sleep(10000);

        driver.get("https://cloud.google.com/products/calculator");

        WebElement webElement = driver.findElement(By.xpath("//iframe[contains(@name,'goog_')]"));
        driver.switchTo().frame(webElement);
        driver.switchTo().frame("myFrame");

        WebElement numberOfInstance = driver.findElement(  By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']"));
        numberOfInstance.sendKeys("4");
        Thread.sleep(2000);

        WebElement series = driver.findElement(By.xpath("//*[@id=\"select_value_label_85\"]"));
        series.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//md-option[@id='select_option_201']")).click();
        Thread.sleep(2000);

        WebElement machineFamily= driver.findElement(By.xpath("//*[@id=\"select_value_label_86\"]"));
        machineFamily.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//md-checkbox[@aria-label='Add GPUs']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//md-select[@placeholder='GPU type']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_474']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//md-select[@placeholder='Number of GPUs']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_477']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//md-select[@placeholder='Local SSD']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_450']")).click();
        driver.findElement(By.xpath("//md-select[@placeholder='Datacenter location']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_229']")).click();
        driver.findElement(By.xpath("//md-select[@placeholder='Committed usage']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_128']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Add to Estimate']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Email']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.CONTROL+ "v");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@aria-label='Send Email']")).click();
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[2]/div/div/div[2]/button[2]/span")).click();
    }
}