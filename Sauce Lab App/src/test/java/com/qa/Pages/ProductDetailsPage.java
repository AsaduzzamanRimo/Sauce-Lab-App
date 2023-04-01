package com.qa.Pages;

import com.qa.utils.GlobalParams;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailsPage extends BaseTest {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]\n" +
            "")
    private MobileElement title;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]"
            + "")
    private MobileElement desc;

    @AndroidFindBy(accessibility = "test-BACK TO PRODUCTS")
    private MobileElement backToProductsBtn;


    public String getTitle() {
        return getText(title, "title is: ");
    }

    public String getDesc() {
        return getText(desc, "description is: ");
    }

    public String getPrice() throws Exception {
            return getText(andScrollToElementUsingUiScrollable("description", "test-Price"), "price is: ");

    }



    public ProductPage pressBackToProductsBtn() {
        click(backToProductsBtn);
        return new ProductPage();
    }


}
