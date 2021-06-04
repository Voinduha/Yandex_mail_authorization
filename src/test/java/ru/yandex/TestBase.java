package ru.yandex;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static org.openqa.selenium.remote.HttpSessionId.getSessionId;

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