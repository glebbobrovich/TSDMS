package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div/div/div/div/div[1]/div/a[13]")
    private WebElement letterButton;

    @FindBy(xpath = "//*[@id=\"ab__sb_t_l\"]/td[2]/a[27]")
    private WebElement ludwigButton;

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public BrandPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLetter() throws InterruptedException {
        letterButton.click();
    }

    public void clickLudwig() throws InterruptedException {
        Thread.sleep(2000);
        ludwigButton.click();
    }

}
