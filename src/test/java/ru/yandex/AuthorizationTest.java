package ru.yandex;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("DanVu")
@Link(value = "Yandex", url = "http://yandex.ru")
@DisplayName("Тесты на проверку авторизации по логину и паролю")

public class AuthorizationTest extends TestBase {
    AuthorizationPage authorizationPage;

    @DisplayName("Отображение корректной информации о пользователе, " +
            "после авторизации на странице")
    @Test
    void userShouldBeAbleToLogin() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
        authorizationPage.makeScreenshot();
    }

    @DisplayName("Отображение корректной информации о пользователе, " +
            "если ввести в поле авторизации пользователя логин с первой заглавной буквы")
    @Test
    void userShouldBeAbleToLoginWithCapitalLatter() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLoginWithCapitalLetter();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
        authorizationPage.makeScreenshot();
    }

    @DisplayName("Отображение корректной информации о пользователе, " +
            "если ввести в поле авторизации пользователя логин в верхнем регистре (заглавными буквами)")
    @Test
    void userShouldBeAbleToLoginWithUppercase() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLoginWithUppercase();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
        authorizationPage.makeScreenshot();
    }

    @DisplayName("Авторизация не завершится, если ввести в поле логин не верные данные")
    @Test
    void userShouldNotBeAbleToLoginWithWrongLogin() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setWronglogin();
        authorizationPage.makeScreenshot();
    }

    @DisplayName("Авторизация не завершится, если ввести в поле пароль не верные данные")
    @Test
    void userShouldNotBeAbleToLoginWithWrongPassword() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setWrongPassword();
        authorizationPage.makeScreenshot();
    }

    @DisplayName("Авторизация не завершится, если оставить поле логин не заполненным")
    @Test
    void userShouldNotBeAbleToLoginWithEmptyFieldLogin() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setEmptyFieldLogin();
    }

    @DisplayName("Авторизация не завершится, если оставить поле пароль не заполненным")
    @Test
    void userShouldNotBeAbleToLoginWithEmptyFieldPassword() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setEmptyFiledPassword();
        authorizationPage.makeScreenshot();
    }

    @DisplayName("Авторизация не завершится, если заполнить поле пароль в вернем регистре")
    @Test
    void userShouldNotBeAbleToLoginWithUppercasePassword() {
        authorizationPage = new AuthorizationPage();

        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setPasswordWithUppercase();
        authorizationPage.makeScreenshot();
    }
}