package io.github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MainPage {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Получаем путь к ChromeDriver из переменной окружения
        String chromeDriverPath = System.getenv("CHROME_DRIVER_PATH");

        // Если переменная окружения не установлена, выводим ошибку
        if (chromeDriverPath == null) {
            throw new RuntimeException("CHROME_DRIVER_PATH не установлена!");
        }

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        driver = new ChromeDriver();
        driver.get("https://makarovartem.github.io/frontend-avito-tech-test-assignment/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
