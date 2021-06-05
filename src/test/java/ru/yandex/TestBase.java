package ru.yandex;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import static com.codeborne.selenide.Selenide.closeWebDriver;

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