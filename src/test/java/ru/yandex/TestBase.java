package ru.yandex;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.screenshot;

public class TestBase {

    @BeforeAll
    static void setup() {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));

        Configuration.browser = "chrome";
        Configuration.browserCapabilities = capabilities;

    }

    @AfterEach
    public void addAttachments() {

        closeWebDriver();
    }
}