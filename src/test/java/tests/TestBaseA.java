package tests;

import com.codeborne.selenide.Configuration;
import config.WebDriverConfig;
import config.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBaseA {
    public WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

}

