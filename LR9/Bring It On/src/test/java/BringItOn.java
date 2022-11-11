import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BringItOn {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement inputText = driver.findElement(By.id("postform-text"));
        inputText.sendKeys(
                "git config --global user.name  \"New Sheriff in Town\"\n" +
                        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                        "git push origin master --force"
        );
        driver.findElement(By.id("select2-postform-format-container")).click();
        driver.findElement(By.xpath("//li[text()='Bash']")).click();
        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        WebElement inputName = driver.findElement(By.id("postform-name"));
        inputName.sendKeys("how to gain dominance among developers");
        driver.findElement(By.xpath("//button[@class='btn -big']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
