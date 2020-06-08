package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.pages.page.content.TestsPage;

import static org.hamcrest.Matchers.*;
import static ru.geekbrains.main.site.at.pages.view.SearchTabsView.Tab.*;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Проверка работы Поиска")
public class SearchTest extends BaseTest {

    @DisplayName("Проверка Поиска")
    @Test
    void searchTest() {
        new TestsPage(driver)
                .openUrl()
                .getHeader()
                .searchText("java")
                .getSearchTabView()
                .checkCount(Professions, greaterThanOrEqualTo(2))
                .checkCount(Courses, greaterThan(15))
                .checkCount(Webinars, allOf(greaterThan(180), lessThan(300)))
                .checkCount(Blogs, greaterThan(300))
                .checkCount(Forums, not(350))
                .checkCount(Tests, not(0));
    }
}
