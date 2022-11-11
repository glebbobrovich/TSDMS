import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HurtMePlenty {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://cloud.google.com/");
        driver.findElement((By.xpath("//div[@class='devsite-search-container']"))).click();

        WebElement search = driver.findElement(By.xpath("//input[@class='devsite-search-field devsite-search-query']"));
        search.click();
        search.sendKeys("Google Cloud Pricing Calculator");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//b[text()='Google Cloud Pricing Calculator']/parent::a")).click();
        Thread.sleep(2000);

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
    }
}