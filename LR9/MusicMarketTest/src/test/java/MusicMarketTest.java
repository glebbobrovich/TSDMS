import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MusicMarketTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://musicmarket.by");

        driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/div/div/div/div/ul/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/div/div/div/div/ul/div[2]/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div/div/div/div/div[1]/div/a[13]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"ab__sb_t_l\"]/td[2]/a[26]")).click();
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"button_cart_47462\"]/span/i"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"button_cart_47462\"]/span/i")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div[2]/a")).click();
    }
}
