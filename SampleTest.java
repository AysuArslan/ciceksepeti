package com.testinium.ciceksepeti.test;
import com.testinium.ciceksepeti.test.base.BaseTest;
import com.testinium.ciceksepeti.test.page.LoginPage;
import com.testinium.ciceksepeti.test.page.ProductListPage;
import org.junit.Test;


public class SampleTest extends BaseTest {

   /* @Test
    public void loginTest() {
        new LoginPage(driver).login("deneme@gmail.com", "12345");

    } */
    @Test
    public void searchProduct() {
        new ProductListPage(driver).search("BonnyFood");


    }


}
