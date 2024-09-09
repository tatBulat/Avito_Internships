package io.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PaginationTest extends MainPage {

    @Test
    public void testPages() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Укажем отображение 100 игр на страницу.
        WebElement firstQuantityGames = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ant-select-selection-item' and @title='10 / page']")));
        firstQuantityGames.click();
        WebElement secondQuantityGames = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and contains(text(),'100 / page')]"));
        secondQuantityGames.click();
        WebElement platformTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ant-select-item-option-content' and contains(text(),'100 / page')]")));
        Assert.assertTrue(platformTitle.isDisplayed(), "Количество '100' игр на странице не выбрано.");

        // Проверка, что мы действительно перешли на №3 страницу.
        WebElement thirdPageButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='3']/a")));
        thirdPageButton.click();
        WebElement thirdPage = driver.findElement(By.xpath("//li[contains(@class, 'ant-pagination-item-active') and @title='3']"));
        Assert.assertTrue(thirdPage.isDisplayed(), "Мы не на третьей странице.");


        // Проверка, что мы действительно перешли на №1 страницу.
        WebElement firstPageButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='1']/a")));
        firstPageButton.click();
        WebElement firstPage = driver.findElement(By.xpath("//li[contains(@class, 'ant-pagination-item-active') and @title='1']"));
        Assert.assertTrue(firstPage.isDisplayed(), "Мы не на первой странице.");

        // Проверка, что мы действительно перешли на №4 страницу.
        WebElement lastPageButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='4']/a")));
        lastPageButton.click();
        WebElement fourthPage = driver.findElement(By.xpath("//li[contains(@class, 'ant-pagination-item-active') and @title='4']"));
        Assert.assertTrue(fourthPage.isDisplayed(), "Мы не на четвертой странице.");

        System.out.println("Проверка пагинации успешно пройдены!");
    }
}