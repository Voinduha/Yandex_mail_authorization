package ru.yandex;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

    Faker faker = new Faker();
    String login = "stoyuzer",
            password = "Zc43fal",
            loginWithCapitalLatter = "Stoyuzer",
            loginWithUppercase = "STOYUZER",
            passwordWithUppercase = "ZC43FAL",
            wrongLogin = faker.funnyName().name(),
            wrongPassword = faker.internet().password(9, 15),
            emptyFieldLogin = " ",
            emptyFieldPassword = " ";

    @Step("Открываем Yandex.ru")
    public void openPage() {
        open("http://yandex.ru");
        $x("//div[text()='Войти']").click();
    }

    @Step("Вводим логин")
    public void setLogin() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(login).pressEnter();
    }

    @Step("Вводим пароль")
    public void setPassword() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(password).pressEnter();
    }

    @Step("Вводим логин с заглавной буквы")
    public void setLoginWithCapitalLetter() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(loginWithCapitalLatter).pressEnter();
    }

    @Step("Вводим пароль в верхнем регистре")
    public void setPasswordWithUppercase() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(passwordWithUppercase).pressEnter();
    }

    @Step("Вводим логин в верхнем регистре")
    public void setLoginWithUppercase() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(loginWithUppercase).pressEnter();
    }

    @Step("Вводим автосгенерированный логин")
    public void setWronglogin() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(wrongLogin).pressEnter();
    }

    @Step("Вводим автосгенерированный пароль")
    public void setWrongPassword() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(wrongPassword).pressEnter();
    }

    @Step("Оставляем пустое поле логин")
    public void setEmptyFieldLogin() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(emptyFieldLogin).pressEnter();
    }

    @Step("Оставляем пустое поле пароль")
    public void setEmptyFiledPassword() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(emptyFieldPassword).pressEnter();
    }

    @Step("Проверяем авторизацию пользователя")
    public void checkUserName() {
        $("div.desk-notif-card__title").shouldHave(text("stoyuzer"));
    }

    @Step("Проверяем сообщение об ошибке")
    public void checkThatPasswordDenied() {
        $(".Textinput-Hint").shouldHave(Condition.text("Неверный пароль"));
    }

    @Step("Проверяем ошибку, что поле пароль не заполнено")
    public void checkThatPasswordFieldEmpty() {
        $(".Textinput-Hint_state_error").shouldHave(Condition.text("Пароль не указан"));
    }

    @Step("Проверяем ошибку, что поле логин не заполнено")
    public void checkThatLoginFieldEmpty() {
        $(".Textinput-Hint").shouldHave(Condition.text("Логин не указан"));
    }

    @Step("Проверяем ошибку, что поле пароль заполнено не правильно")
    public void checkThatPasswordFieldNotCorrected() {
        $(".Textinput-Hint").shouldHave(Condition.text("Неверный пароль"));
    }

    public void checkThatLoginFieldNotCorrected() {
        $(".Textinput-Hint_state_error").shouldHave(Condition.text("Такого аккаунта нет"));
    }
}