package ru.yandex;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

    String login = "",
            password = "";

    public void openPage() {
        open("http://yandex.ru/");
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
}
