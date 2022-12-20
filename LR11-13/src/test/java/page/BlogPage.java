package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class BlogPage extends AbstractPage{
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[2]/div[11]/div/div/div[2]/div[1]/a")
    private WebElement blogItem;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[4]/div/div[2]/div/div[1]/div[1]/div/div/div[2]/div[2]/a")
    private WebElement nextItemButton;

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public BlogPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickBlogItem() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"pagination_contents\"]/div[2]/div[11]/div/div/div[2]/div[1]/a"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        blogItem.click();
    }

    public void nextItem() throws InterruptedException{
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"tygh_main_container\"]/div[4]/div/div[2]/div/div[1]/div[1]/div/div/div[2]/div[2]/a"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        nextItemButton.click();
    }
}