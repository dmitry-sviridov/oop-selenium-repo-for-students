package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.page.content.CoursePage;
import ru.geekbrains.main.site.at.view.LeftNavigation;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Страница Курсы")
public class CourseTest extends BaseTest {

    @DisplayName("Проверка отображения курсов по фильтам")
    @Test
    void checkCourseDisplayingFilter() {
        ((CoursePage) new CoursePage(driver)
                        .openUrl()
                        .closedPopUp()
                        .getLeftNavigation()
                        .clickButton(LeftNavigation.Button.buttonCourses)
        )
                .getContentNavigationCourseBlock().clickButton(LeftNavigation.Button.buttonCourses.getName())
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses(
                        "Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2"
                )
        ;

    }
}
