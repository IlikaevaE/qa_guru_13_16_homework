package tests;

import com.codeborne.selenide.Configuration;
import config.WebDriverConfig;
import config.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class TestBaseA {

    @BeforeAll
    static void BeforeAll() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        Configuration.baseUrl = config.getBaseURL();
           Configuration.browser = config.getBrowser();
           Configuration.browserVersion = config.getBrowserVersion();
        String remoteUrl = System.getProperty("remote.url");
        if(Objects.isNull(remoteUrl)) {
            Configuration.remote = String.valueOf(config.getRemoteUrl());
        }
        String defaultBaseUrl = System.getProperty("browser.baseURL");
        if (Objects.isNull(defaultBaseUrl)) {
            defaultBaseUrl = "https://voronezh.hh.ru/";
        }
        open(defaultBaseUrl);


    }

}

