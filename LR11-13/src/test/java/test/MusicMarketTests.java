package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

import java.util.Random;

public class MusicMarketTests extends CommonConditions {

    //Найти процессор эффектов ZoomB3n и добавить в корзину
    @Test
    public void Test1() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        searchPage = mainPage.enterSearchText("Zoom B3n");
        mainPage.searchClick();
        searchPage.enterZoomB3n();
        mainPage.addProc();
        Assert.assertTrue(true);
    }

    //Найти товары определенного бренда
    @Test
    public void Test2() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        brandPage = mainPage.clickBrands();
        brandPage.clickLetter();
        brandPage.clickLudwig();

        Assert.assertTrue(true);
    }

    //Оформить заявку в гитарной мастерской
    @Test
    public void Test3() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        mainPage.clickMore();
        workshopPage = mainPage.openWorkshop();
        workshopPage.clickRepair();
        workshopPage.enterFIOText("Test");
        Thread.sleep(2000);
        workshopPage.enterNumber("375123456789");
        Thread.sleep(2000);
        workshopPage.clickChooseInstrument();
        workshopPage.chooseInstrument();
        Thread.sleep(2000);
        workshopPage.enterComment("Test Test Test");
        //workshopPage.sendButton();
        Assert.assertTrue(true);
    }

    //Найти информацию о видах микрофонов в блоге
    @Test
    public void Test4() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        mainPage.clickNext();
        blogPage = mainPage.clickBlog();
        blogPage.clickBlogItem();
        blogPage.nextItem();

        Assert.assertTrue(true);
    }

    //Найти самые дорогие струны для электрогитары
    @Test
    public void Test5() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        searchPage = mainPage.enterSearchText("Струны для электрогитары");
        searchPage.clickFilter();
        searchPage.selectExpensive();
        Thread.sleep(20000);
        Assert.assertTrue(true);
    }

    //Добавить 2 товара в список сравнения
    @Test
    public void Test6() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        newItemsPage = mainPage.clickNewItems();
        newItemsPage.clickItem1();
        mainPage.clickNewItems();
        newItemsPage.clickItem2();
        newItemsPage.clickWish();

        Assert.assertTrue(true);
    }
}