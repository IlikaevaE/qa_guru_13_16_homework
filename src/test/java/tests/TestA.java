package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class TestA extends TestBaseA {
    private final String SEARCH_VALUE = "Selenide";
    private final String VACANCY_NAME = "QA Automation Engineer (Java) / инженер по автоматизированному тестированию";
    private final String ANSWER_VACANCY = "Откликнуться";
    private final String PARAMETER_1 = "Можно работать из дома";
    private final String PARAMETER_2 = "Показать контакты";

    @Test
    @DisplayName("Searching for job")
    void searchForVacancy() {
        step("Ставим курсор в поле для поиска", () -> {
            $("[id=a11y-search-input]").click();
        });
        step("Вводим значение \"Selenide\"", () -> {
            $("[id=a11y-search-input]").sendKeys(SEARCH_VALUE);
        });

        step("Подтверждаем поиск", () -> {
            $(".supernova-search-group__input").submit();
        });

        step("Проверяем, что вакансия с заданными параметрами существует", () -> {
            $(".vacancy-serp-content").shouldHave(Condition.text(VACANCY_NAME))
                    .shouldHave(Condition.text(ANSWER_VACANCY))
                    .shouldHave(Condition.text(PARAMETER_1))
                    .shouldHave(Condition.text(PARAMETER_2));
        });
    }
}


