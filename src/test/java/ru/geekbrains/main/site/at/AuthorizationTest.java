package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.page.auth.AuthPage;

import static ru.geekbrains.main.site.at.base.TestDataConfig.USER_NAME;
import static ru.geekbrains.main.site.at.base.TestDataConfig.USER_PASSWORD;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Проверка авторизации")
public class AuthorizationTest extends BaseTest {

    @DisplayName("Вход с валидный логин/пароль")
    @Test
    void checkSingInValidLogin() {
        new AuthPage(driver)
                .openUrl()
                .authorization(USER_NAME, USER_PASSWORD)
                .checkNamePage("Главная");
    }

}
