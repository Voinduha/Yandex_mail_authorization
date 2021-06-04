package ru.yandex;

import com.github.javafaker.Faker;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {


    public void makeScreenshot() {
        InputStream stream = new ByteArrayInputStream(screenshot(OutputType.BYTES));
        Allure.attachment("Screenshot", stream);
    }

    Faker faker = new Faker();
    String login = "stoyuzer",
            password = "Zc43fal",
            login_with_capital_latter = "Stoyuzer",
            login_with_uppercase = "STOYUZER",
            password_with_uppercase = "ZC43FAL",
            wrong_login = faker.funnyName().name(),
            wrong_password = faker.internet().password(9, 15),
            empty_field_login = " ",
            empty_field_password = " ";

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

    @Step("Проверяем авторизацию пользователя")
    public void checkUserName() {
        $("div.desk-notif-card__title").shouldHave(text("stoyuzer"));
    }

    @Step("Вводим логин с заглавной буквы")
    public void setLoginWithCapitalLetter() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(login_with_capital_latter).pressEnter();
    }

    @Step("Вводим пароль в верхнем регистре")
    public void setPasswordWithUppercase() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(password_with_uppercase).pressEnter();
    }

    @Step("Вводим логин в верхнем регистре")
    public void setLoginWithUppercase() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(login_with_uppercase).pressEnter();
    }

    @Step("Вводим автосгенерированный логин")
    public void setWronglogin() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(wrong_login).pressEnter();
    }

    @Step("Вводим автосгенерированный пароль")
    public void setWrongPassword() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(wrong_password).pressEnter();
    }

    @Step("Оставляем пустое поле логин")
    public void setEmptyFieldLogin() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(empty_field_login).pressEnter();
    }

    @Step("Оставляем пустое поле пароль")
    public void setEmptyFiledPassword() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(empty_field_password).pressEnter();
    }
}
