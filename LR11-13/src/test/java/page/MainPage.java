package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage{
    private static final String HOMEPAGE_URL = "https://musicmarket.by/";
    @FindBy(xpath = "//*[@id=\"button_cart_21702\"]")
    private WebElement buyButton;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div/div[2]/div[4]/form/button")
    private WebElement searchButton;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div/div[2]/div[4]/form/input[9]")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"text_links_1281\"]/li[6]/ul/li[3]")
    private WebElement workshopButton;

    @FindBy(xpath = "//*[@id=\"text_links_1281\"]/li[6]")
    private WebElement moreButton;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/div/div/div/div/ul/div[1]/li[10]/a\n")
    private WebElement brandsButton;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/div/div/div/div/ul/div[1]/div")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/div/div/div/div/ul/div[2]/li[3]")
    private WebElement blogButton;
    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/div/div/div/div/ul/div[1]/li[9]/a\n")
    private WebElement newItemButton;
    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public BrandPage addProc() throws InterruptedException{
        Thread.sleep(2000);
        buyButton.click();
        return new BrandPage(driver);
    }

    public void searchClick() {
        searchButton.click();
    }

    public SearchPage enterSearchText(String searchText) {
        searchInput.sendKeys(searchText);
        searchInput.submit();
        return new SearchPage(driver);
    }

    public void clickMore(){
        moreButton.click();
    }

    public WorkshopPage openWorkshop() throws InterruptedException {
        Thread.sleep(2000);
        workshopButton.click();
        return new WorkshopPage(driver);
    }

    public BrandPage clickBrands() {
        brandsButton.click();
        return new BrandPage(driver);
    }

    public void clickNext(){
        nextButton.click();
    }

    public BlogPage clickBlog() throws InterruptedException {
        blogButton.click();
        return new BlogPage(driver);
    }

    public NewItemsPage clickNewItems() throws InterruptedException {
        newItemButton.click();
        return new NewItemsPage(driver);
    }
}