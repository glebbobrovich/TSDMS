package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"products_search_pagination_contents\"]/div[1]/div/form/div/div[1]/a")
    private WebElement getZoomB3n;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[3]/div/div[3]/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/a")
    private WebElement filterList;

    @FindBy(xpath="/html/body/div[1]/div[4]/div[3]/div/div[3]/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/ul/li[3]")
    private WebElement filterExpensive;

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public SearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterZoomB3n() {
        getZoomB3n.click();
    }

    public void clickFilter(){
        filterList.click();
    }

    public void selectExpensive(){
        filterExpensive.click();
    }

}