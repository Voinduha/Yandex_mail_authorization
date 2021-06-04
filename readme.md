# Тестовое задание (Проверка функционала авторизации по логину и паролю на сайте http://yandex.ru

## Стэк технологий
[<img src="https://github.com/SmileySpb/AutomationProject/blob/main/github/java.png" alt="java_8" width="100" height="100"/>](https://www.oracle.com/ru/java/technologies/javase-jre8-downloads.html)
[<img src="https://github.com/SmileySpb/AutomationProject/blob/main/github/junit_5.png" alt="junit_5" width="100" height="100"/>](https://junit.org/junit5/)
[<img src="https://github.com/SmileySpb/AutomationProject/blob/main/github/selenide.png" alt="selenide" width="100" height="100"/>](https://ru.selenide.org/)
[<img src="https://github.com/SmileySpb/AutomationProject/blob/main/github/selenium.png" alt="selenium" width="100" height="100"/>](https://www.selenium.dev/)
[<img src="https://github.com/SmileySpb/AutomationProject/blob/main/github/gradle.png" alt="gradle" width="100" height="100"/>](https://gradle.org/)
[<img src="https://github.com/SmileySpb/AutomationProject/blob/main/github/allure.png" alt="allure" width="100" height="100"/>](https://docs.qameta.io/allure/)

## UI тесты
- [X] :mango: Отображение корректной информации о  пользователе, после авторизации на странице
- [X] :banana: Отображение корректной информации о пользователе, если ввести в поле авторизации пользователя логин с первой заглавной буквы
- [X] :orange: Отображение корректной информации о пользователе, если ввести в поле авторизации пользователя логин в верхнем регистре (заглавными буквами)
- [X] :strawberry: Авторизация не завершится, если ввести в поле пароль данные в верхнем регистре
- [X] :watermelon: Авторизация не завершится, если ввести в поле логин не верные данные, не удалось войти в учетную запись
- [X] :grapes: Авторизация не завершится, если ввести в поле пароль не верные данные
- [X] :apple: Авторизация не завершится, если оставить поле логин пустым
- [X] :kiwi: Авторизация не завершится, если оставить поле пароль пустым


## Скриншоты
#### *Allure Report - простой и доступный генератор отчетов:*
![selenoid_screenshot](src/test/resources/AllureReportAuth.png)


![selenoid_screenshot](src/test/resources/AllureReportAuthTests.png)
  