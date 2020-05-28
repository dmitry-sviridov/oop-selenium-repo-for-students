package ru.geekbrains.main.site.at.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseExampleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Base class before all");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Base class before each");

    }

    @AfterEach
    void tearDown() {
        System.out.println("Base class after each");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("Base class after all");
    }
}
