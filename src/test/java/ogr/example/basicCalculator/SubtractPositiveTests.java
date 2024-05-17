package ogr.example.basicCalculator;

import io.qameta.allure.Description;
import ogr.example.pages.CalculatePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractPositiveTests {
    WebDriver driver = new ChromeDriver();
    CalculatePage calc = new CalculatePage(driver);

    @Test
    @DisplayName("Subtract")
    @Description("Тест по проверки калькулятора на вычитание")
    public void Calculate() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        calc.scrollDown();
        calc.selectBuild("Prototype");
        calc.enterFirstNumber("2");
        calc.enterSecondNumber("3");
        calc.selectOperation("Subtract");
        calc.clickCalculate();
        assertEquals("-1",calc.GetAnswer(), "Результат не соответствует ожиданию");
        driver.close();
    }
}
