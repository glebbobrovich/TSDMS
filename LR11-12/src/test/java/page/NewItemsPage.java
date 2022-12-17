package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewItemsPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"products_newest_pagination_contents\"]/div[1]/div/form/div/div[2]/div[1]/a")
    private WebElement item1Button;

    @FindBy(xpath = "//*[@id=\"add_to_cart_update_62686\"]/a[2]")
    private WebElement item1WishButton;

    @FindBy(xpath = "//*[@id=\"products_newest_pagination_contents\"]/div[2]/div/form/div/div[2]/div[1]/a")
    private WebElement item2Button;

    @FindBy(xpath = "//*[@id=\"add_to_cart_update_62687\"]/a[2]")
    private WebElement item2WishButton;

//    @FindBy(xpath = "//*[@id=\"sw_dropdown_73\"]")
//    private WebElement catalogBut;
//
//    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[2]/div/div[2]/nav/div/div[1]\n")
//    private WebElement userBut;
    @FindBy(xpath = "//*[@id=\"abt__ut2_compared_products\"]")
    private WebElement wishListBut;

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public NewItemsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickItem1() throws InterruptedException {
        item1Button.click();
        Thread.sleep(3000);
        item1WishButton.click();
        Thread.sleep(3000);
    }

    public void clickItem2() throws InterruptedException {
        Thread.sleep(3000);
        item2Button.click();
        Thread.sleep(3000);
        item2WishButton.click();
    }

//    public void clickCat() throws InterruptedException {
//        Thread.sleep(3000);
//        catalogBut.click();
//    }

//    public void clickPlus() throws InterruptedException {
//        userBut.click();
//    }

    public void clickWish() throws InterruptedException {
        wishListBut.click();
    }
}
