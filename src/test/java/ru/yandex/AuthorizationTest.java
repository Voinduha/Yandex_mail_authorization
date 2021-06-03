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
}
