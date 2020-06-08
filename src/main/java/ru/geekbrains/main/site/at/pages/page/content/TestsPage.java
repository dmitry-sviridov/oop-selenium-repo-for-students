package ru.geekbrains.main.site.at.pages.page.content;

import org.openqa.selenium.WebDriver;

public class TestsPage extends ContentBasePage {

    public TestsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public TestsPage openUrl() {
        driver.get("https://geekbrains.ru/tests");
        return this;
    }
}