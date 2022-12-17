package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkshopPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[3]/div/div[1]/div/div/div/div[2]/div/div/div/div/div/div/div[3]")
    private WebElement repairButton;

    @FindBy(xpath = "//*[@id=\"elm_25\"]")
    private WebElement fioField;

    @FindBy(xpath = "//*[@id=\"elm_27\"]")
    private WebElement numberField;

    @FindBy(xpath = "//*[@id=\"elm_28\"]")
    private WebElement clickChooseInstrument;

    @FindBy(xpath = "//*[@id=\"elm_28\"]/option[6]")
    private WebElement chooseInstrument;

    @FindBy(xpath = "//*[@id=\"elm_30\"]")
    private WebElement commentField;

//    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[3]/div/div[7]/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[7]/button")
//    private WebElement sendButton;

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public WorkshopPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickRepair(){
        repairButton.click();
    }

    public void enterFIOText(String searchText) {
        fioField.sendKeys(searchText);
        fioField.submit();
    }

    public void enterNumber(String searchText) {
        numberField.sendKeys(searchText);
        numberField.submit();

    }

    public void clickChooseInstrument(){
        clickChooseInstrument.click();
    }

    public void chooseInstrument(){
        chooseInstrument.click();
    }

    //public void sendButton(){
    //   sendButton.click();
    // }

    public void enterComment(String searchText) {
        commentField.sendKeys(searchText);
        //commentField.submit();
    }
}
