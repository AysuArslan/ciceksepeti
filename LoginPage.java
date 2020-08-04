package com.testinium.ciceksepeti.test.page;

import com.testinium.ciceksepeti.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username,String password){
        driver.get("https://www.ciceksepeti.com/uye-girisi");
        setById("EmailLogin",username);
        setById("Password",password);
        clickByXpath("//*[@id=\"userLogin\"]/div[6]/button");

    }

    private void setBy(String EmailLogin, String username) {
    }


}

