package tests;

import config.WebDriverProvider;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;



public class BrowserConfigTest {
    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }


    @Test
    @DisplayName("Searching for job")
    void searchForVacancy() {
        String title = driver.getTitle();
        Assertions.assertEquals("Работа в Воронеже, поиск персонала и публикация вакансий - voronezh.hh.ru", title);
        driver.quit();


    }

}
