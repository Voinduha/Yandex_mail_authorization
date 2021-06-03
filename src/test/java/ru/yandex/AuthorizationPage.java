package ru.yandex;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

    String login = "danvu",
           password = " ",
           login_with_capital_latter = "Danvu",
           login_with_uppercase = "DANVU",
           wrong_login = "jfkfk",
           wrong_password = "hej198gf",
           empty_field_login = " ",
           empty_field_password = " ";

    public void openPage() {
        open("http://yandex.ru");
        $x("//div[text()='Войти']").click();
    }

    public void setLogin() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(login).pressEnter();
    }

    public void setPassword() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(password).pressEnter();
    }

    public void checkUserName() {
        $("div.desk-notif-card__title").shouldHave(text("Даниил Вулих"));
    }

    public void setLoginWithCapitalLetter() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(login_with_capital_latter).pressEnter();
    }

    public void setLoginWithUppercase() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(login_with_uppercase).pressEnter();
    }

    public void setWronglogin() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(wrong_login).pressEnter();
    }

    public void setWrongPassword() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(wrong_password).pressEnter();
    }

    public void setEmptyFieldLogin() {
        $("div[data-t='field:login']").click();
        $("#passp-field-login").val(empty_field_login).pressEnter();
    }

    public void setEmptyFiledPassword() {
        $("div[data-t='field:passwd']").click();
        $("#passp-field-passwd").val(empty_field_password).pressEnter();
    }
}
