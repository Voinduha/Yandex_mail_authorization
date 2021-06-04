package ru.yandex;

import org.junit.jupiter.api.Test;

public class AuthorizationTest extends TestBase {
    AuthorizationPage authorizationPage;


    @Test
    void userShouldBeAbleToLogin() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
    }

    @Test
    void userShouldBeAbleToLoginWithCapitalLatter() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLoginWithCapitalLetter();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
    }

    @Test
    void userShouldBeAbleToLoginWithUppercase() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLoginWithUppercase();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
    }

    @Test
    void userShouldNotBeAbleToLoginWithWrongLogin() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setWronglogin();
    }

    @Test
    void userShouldNotBeAbleToLoginWithWrongPassword() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setWrongPassword();
    }

    @Test
    void userShouldNotBeAbleToLoginWithEmptyFieldLogin() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setEmptyFieldLogin();
    }

    @Test
    void userShouldNotBeAbleToLoginWithEmptyFieldPassword() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setEmptyFiledPassword();
    }

    @Test
    void userShouldNotBeAbleToLoginWithUppercasePassword() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setPasswordWithUppercase();
    }
}