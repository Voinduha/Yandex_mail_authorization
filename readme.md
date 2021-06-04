# Проверка функционала авторизации по логину и паролю на сайте http://yandex.ru

## Стэк технологий
| GitHub | IDEA | Java | Junit5 | Gradle | Selenide | Allure | 
|:-----:|:-----:|:----:|:------:|:------:|:--------:|:--------:|
|<img src="https://user-images.githubusercontent.com/38681283/120561870-048f0480-c40e-11eb-9ff8-c155f9d617c4.png" width="40" height="40"> | <img src="https://user-images.githubusercontent.com/38681283/120561799-e88b6300-c40d-11eb-91ba-d4103ef6d4b5.png" width="40" height="40"> | <img src="https://user-images.githubusercontent.com/38681283/120561837-f7721580-c40d-11eb-8590-7b3b0b5eb50d.png" width="40" height="40"> | <img src="https://user-images.githubusercontent.com/38681283/120562013-43bd5580-c40e-11eb-926f-1b8d3dc9e965.png" width="40" height="40"> | <img src="https://user-images.githubusercontent.com/38681283/120562398-fbeafe00-c40e-11eb-9fe7-3a641bf7115c.png" width="40" height="40"> | <img src="https://user-images.githubusercontent.com/38681283/120562458-1c1abd00-c40f-11eb-8ce8-2eb023f3e24f.png" width="40" height="40"> | <img src="https://user-images.githubusercontent.com/38681283/120562511-38b6f500-c40f-11eb-8b04-208bec6529aa.png" width="40" height="40"> | <img src="https://user-images.githubusercontent.com/38681283/120562749-b5e26a00-c40f-11eb-91d9-641e254428c9.png" width="40" height="40"> <img src="https://user-images.githubusercontent.com/38681283/120562784-c692e000-c40f-11eb-8298-aa3858159184.png" width="40" height="40"> | <img src="https://user-images.githubusercontent.com/38681283/120562827-e0342780-c40f-11eb-9430-05ae54f145b1.png" width="40" height="40"> |

## UI тесты
- [X] :mango: Отображение корректной информации о  пользователе, после авторизации на странице
- [X] :banana: Отображение корректной информации о пользователе, если ввести в поле авторизации пользователя логин с первой заглавной буквы
- [X] :orange: Отображение корректной информации о пользователе, если ввести в поле авторизации пользователя логин в верхнем регистре (заглавными буквами)
- [X] :strawberry: Авторизация не завершится, если ввести в поле пароль данные в верхнем регистре
- [X] :watermelon: Авторизация не завершится, если ввести в поле логин не верные данные, не удалось войти в учетную запись
- [X] :grapes: Авторизация не завершится, если ввести в поле пароль не верные данные
- [X] :apple: Авторизация не завершится, если оставить поле логин пустым
- [X] :pear: Авторизация не завершится, если оставить поле пароль пустым


## Скриншоты
#### *Allure Report - простой и удобный генератор отчетов:*
![selenoid_screenshot](src/test/resources/AllureReportAuth.png)


![selenoid_screenshot](src/test/resources/AllureReportAuthTests.png)
  