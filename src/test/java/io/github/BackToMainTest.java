package io.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BackToMainTest  extends MainPage {

    @Test
    public void testBacks() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Проверка открытия первой игры на странице.
        WebElement tarislandGame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Tarisland')]")));
        tarislandGame.click();
        WebElement firstGameTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Tarisland')]")));
        Assert.assertTrue(firstGameTitle.isDisplayed(), "Игра 'Tarisland' не открыта.");
        WebElement fitstButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[span[contains(text(),'Back to Main')]]")));
        fitstButton.click();
        WebElement firstGameList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Games List Below')]")));
        Assert.assertTrue(firstGameList.isDisplayed(), "Заголовок 'Games List Below' не открыт.");

        // Проверка открытия последней игры на странице.
        WebElement neverwinterGame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Neverwinter')]")));
        neverwinterGame.click();
        WebElement secondGameTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Neverwinter')]")));
        Assert.assertTrue(secondGameTitle.isDisplayed(), "Игра 'Neverwinter' не открыта.");
        WebElement secondButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[span[contains(text(),'Back to Main')]]")));
        secondButton.click();
        WebElement secondGameList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Games List Below')]")));
        Assert.assertTrue(secondGameList.isDisplayed(), "Заголовок 'Games List Below' не открыт.");

        // Переход на другую страницу.
        WebElement pageButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='5']/a")));
        pageButton.click();

        // Проверка открытия игры "Once Human" на странице №5.
        WebElement onceHumanGame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Once Human')]")));
        onceHumanGame.click();
        WebElement thirdGameTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Once Human')]")));
        Assert.assertTrue(thirdGameTitle.isDisplayed(), "Игра 'Once Human' не открыта.");
        WebElement thirdButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[span[contains(text(),'Back to Main')]]")));
        thirdButton.click();
        WebElement thirdGameList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Games List Below')]")));
        Assert.assertTrue(thirdGameList.isDisplayed(), "Заголовок 'Games List Below' не открыт.");

        // В случае успешных проверок выйдет данное сообщение.
        System.out.println("Проверки на возврат на главную страницу успешно пройдены!");
        System.out.println("");
    }
}