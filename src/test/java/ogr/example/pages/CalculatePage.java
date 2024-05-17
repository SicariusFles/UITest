package ogr.example.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalculatePage
{
    private final WebDriver webDriver;

    public CalculatePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    @Step("Ввод первого числа")
    public void enterFirstNumber(String firstNumber) {
        webDriver.findElement(By.id("number1Field")).sendKeys(firstNumber);
    }
    @Step("Ввод второго числа")
    public void enterSecondNumber(String secondNumber) {
        webDriver.findElement(By.id("number2Field")).sendKeys(secondNumber);
    }
    @Step("Скрол страницы вниз")
    public void scrollDown(){
        WebElement Frame = webDriver.findElement(By.tagName("footer"));
        new Actions(webDriver)
                .scrollToElement(Frame)
                .perform();
    }
    @Step("Выбор сборки")
    public void selectBuild(String build){
        WebElement selectBuild = webDriver.findElement(By.id("selectBuild"));
        Select select = new Select(selectBuild);
        select.selectByVisibleText(build);
    }
    @Step("Выбор оператора")
    public void selectOperation(String operation){
        WebElement selectOperation = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(selectOperation);
        select.selectByVisibleText(operation);
    }
    @Step("Нажатие на кнопку Calculate")
    public void clickCalculate(){
        webDriver.findElement(By.id("calculateButton")).click();
    }
    @Step("Получение ответа")
    public String GetAnswer(){
        return webDriver.findElement(By.id("numberAnswerField")).getAttribute("value");
    }
}

