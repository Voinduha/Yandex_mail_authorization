package ru.yandex;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("DanVu")
@Link(value = "Yandex.ru", url = "http://yandex.ru")
@DisplayName("Тесты на проверку авторизации по логину и паролю")

public class AuthorizationTest extends TestBase {
    private final AuthorizationPage authorizationPage = new AuthorizationPage();

    @DisplayName("Отображение корректной информации о пользователе, " +
            "после авторизации на странице")
    @Test
    void userShouldBeAbleToLogin() {
        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
    }

    @DisplayName("Отображение корректной информации о пользователе, " +
            "если ввести в поле авторизации пользователя логин с первой заглавной буквы")
    @Test
    void userShouldBeAbleToLoginWithCapitalLatter() {
        authorizationPage.openPage();
        authorizationPage.setLoginWithCapitalLetter();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
    }

    @DisplayName("Отображение корректной информации о пользователе, " +
            "если ввести в поле авторизации пользователя логин в верхнем регистре (заглавными буквами)")
    @Test
    void userShouldBeAbleToLoginWithUppercase() {
        authorizationPage.openPage();
        authorizationPage.setLoginWithUppercase();
        authorizationPage.setPassword();
        authorizationPage.checkUserName();
    }

    @DisplayName("Авторизация не завершится, если ввести в поле логин не верные данные")
    @Test
    void userShouldNotBeAbleToLoginWithWrongLogin() {
        authorizationPage.openPage();
        authorizationPage.setWronglogin();
        authorizationPage.checkThatLoginFieldNotCorrected();
    }

    @DisplayName("Авторизация не завершится, если ввести в поле пароль не верные данные")
    @Test
    void userShouldNotBeAbleToLoginWithWrongPassword() {
        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setWrongPassword();
        authorizationPage.checkThatPasswordFieldNotCorrected();
    }

    @DisplayName("Авторизация не завершится, если оставить поле логин не заполненным")
    @Test
    void userShouldNotBeAbleToLoginWithEmptyFieldLogin() {
        authorizationPage.openPage();
        authorizationPage.setEmptyFieldLogin();
        authorizationPage.checkThatLoginFieldEmpty();
    }

    @DisplayName("Авторизация не завершится, если оставить поле пароль не заполненным")
    @Test
    void userShouldNotBeAbleToLoginWithEmptyFieldPassword() {
        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setEmptyFiledPassword();
        authorizationPage.checkThatPasswordFieldEmpty();
    }

    @DisplayName("Авторизация не завершится, если заполнить поле пароль в верxнем регистре")
    @Test
    void userShouldNotBeAbleToLoginWithUppercasePassword() {
        authorizationPage.openPage();
        authorizationPage.setLogin();
        authorizationPage.setPasswordWithUppercase();
        authorizationPage.checkThatPasswordDenied();
    }
}