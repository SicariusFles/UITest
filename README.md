Разница двух целых чисел
1. Открыть сайт https://testsheepnz.github.io/BasicCalculator.html
2. Проскроллить вниз до конца
3. Выбрать сборку (Build) «Prototype»
4. Ввести в поле First number значение «2»
5. Ввести в поле Second number значение «3»
6. Выбрать операцию (Operation) «Subtract»
7. Нажать на кнопку «Calculate»
8. Проверить, что в поле ответа (Answer) значение равно «-1»

### PAGES
* CalculatePage - страница калькулятора

### BASICCALCULATOR
* SubstractPositiveTests - набор позитивных тестов для вычитания

### ЗАПУСК ТЕСТОВ
```mvn clean test```

### ЗАПУСК ALLURE
```cd .\target```
```allure serve```
