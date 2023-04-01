package com.qa.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class ProductPage extends MenuPage {

    @AndroidFindBy (xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/preceding-sibling::android.view.ViewGroup/android.widget.TextView")
    private MobileElement titleTxt;



    public String getTitle() {
        return getText(titleTxt, "product page title is - ");
    }

    public String getProductTitle(String title) throws Exception {
        return getText(andScrollToElementUsingUiScrollable("text", title), "product title is: " + title);
    }

    public By defProductPrice(String title) throws Exception {
        return By.xpath("//*[@text=\"" + title + "\"]/following-sibling::*[@content-desc=\"test-Price\"]");
    }

    public String getProductPrice(String title, String price) throws Exception {
        return getText(scrollToElement(defProductPrice(title), "up"), "product price is: " + price);
    }

    public ProductDetailsPage pressProductTitle(String title) throws Exception {
        click(andScrollToElementUsingUiScrollable("text", title));
        return new ProductDetailsPage();
    }

}
