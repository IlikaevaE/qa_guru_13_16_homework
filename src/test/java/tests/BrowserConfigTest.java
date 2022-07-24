package tests;
import org.junit.jupiter.api.*;


public class BrowserConfigTest extends TestBaseA{

    @Test
    @Tag("browser_test")
    @DisplayName("Searching for job")
    void searchForVacancy() {
        String title = driver.getTitle();
        Assertions.assertEquals("Работа в Воронеже, поиск персонала и публикация вакансий - voronezh.hh.ru", title);
        driver.quit();


    }

}
