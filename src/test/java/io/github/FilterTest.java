package io.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class FilterTest extends MainPage {

    // Тесты по фильтрациям категорий.
    // Первый тест, проверка платформы PC.
    @Test(priority = 1)
    public void testFiltersPC() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Выбор платформы, в нашем случае будет "PC"
        WebElement platformDropdown = driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div/div[1]/div[2]/div/span[2]"));
        platformDropdown.click();
        WebElement pcOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'PC')]")));
        pcOption.click();
        WebElement platformTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ant-select-selection-item' and @title='PC']")));
        Assert.assertTrue(platformTitle.isDisplayed(), "Платформа 'PC' не выбрана.");

        //Выбор категории игр
        WebElement categoryDropdown = driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div[2]/div/span[2]"));
        categoryDropdown.click();
        WebElement mmoOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'mmorpg')])[2]")));
        mmoOption.click();
        WebElement categoryTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ant-select-selection-item' and @title='mmorpg']")));
        Assert.assertTrue(categoryTitle.isDisplayed(), "Категория 'mmorpg' не выбрана.");

        //Выбор сортировки
        WebElement sortDropdown = driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div/div[3]/div[2]/div/span[2]"));
        sortDropdown.click();
        WebElement releaseOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'Release date')])[11]")));
        releaseOption.click();
        WebElement sortTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ant-select-selection-item' and @title='Release date']")));
        Assert.assertTrue(sortTitle.isDisplayed(), "Сортировка 'Release date' не выбрана.");

    }

    // Второй тест, проверка платформы Browser.
    @Test(priority = 2)
    public void testFiltersBrowser() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Выбор платформы, в нашем случае будет "Browser"
        WebElement platformDropdown = driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div/div[1]/div[2]/div/span[2]"));
        platformDropdown.click();
        WebElement pc_Option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Browser')]")));
        pc_Option.click();
        WebElement platformTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ant-select-selection-item' and @title='Browser']")));
        Assert.assertTrue(platformTitle.isDisplayed(), "Платформа 'Browser' не выбрана.");

        //Выбор категории игр
        WebElement categoryDropdown = driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div[2]/div/span[2]"));
        categoryDropdown.click();
        WebElement racing_Option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'racing')])")));
        racing_Option.click();
        WebElement categoryTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ant-select-selection-item' and @title='racing']")));
        Assert.assertTrue(categoryTitle.isDisplayed(), "Категория 'mmorpg' не выбрана.");

        //Выбор сортировки
        WebElement sortDropdown = driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div/div[3]/div[2]/div/span[2]"));
        sortDropdown.click();
        WebElement popularity_Option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'Popularity')])")));
        popularity_Option.click();
        WebElement sortTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ant-select-selection-item' and @title='Popularity']")));
        Assert.assertTrue(sortTitle.isDisplayed(), "Сортировка 'Release date' не выбрана.");

        System.out.println("Проверка платформ успешно пройдены!");
        System.out.println("");
    }
}
