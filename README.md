# Avito_Internships
Здравствуйте!
В данном файле опишу как я выполнял тестовое задание и как подготовить окружение для запуска авто-тестов.  
## Структура проекта тестового задания:
Файл [firstTask.md](https://github.com/tatBulat/Avito_Internships/blob/master/firstTask.md) содержит решение первого задания.  
Скриншоты, относящиеся к нему, находятся в папке [screenshots](https://github.com/tatBulat/Avito_Internships/tree/master/screenshots).  

Файл TestCases.md включает тест-кейсы для второго задания.  
В файле ReportedBugs.md составлены баг-репорты, выявленные в процессе выполнения автоматизированных тестов.  

Файлы с автоматизированными тестами расположены в корневой директории проекта.
***
# Задание №1
В задании требуется перечислить баги со скриншота и указать их приоритет.  
Подробнее можно ознакомиться в файле [firstTask.md](https://github.com/tatBulat/Avito_Internships/blob/master/firstTask.md).
***
# Задание №2
Задание выполнено в связке с Java + ChromeDriver + Maven 
* В тест-кейсах проверяется пользовательские сценарии:
  * Фильтрация по категории.    
  * Возврат на главную страницу с помощью кнопки Back to main.  
  * Переход по страницам результата поиска с помощью пагинации.  
***
## Инструкция по запуску тестов
#### 1. Убедитесь, что на Вашем компьютере установлена Java. В командной строке/терминале выполните команду. ####
```
java -version
```
Если он не установлен, то установите с сайта [AdoptOpenJDK](https://adoptium.net/), загрузите последнюю версию.

#### 2. Убедитесь, что на Вашем компьютере установлена Maven и ChromeDriver. В командной строке/терминале выполните команду ####   
`Maven:`    
```
mvn -v
```
`ChromeDriver:`  
```
chromedriver --version
```
В случае, если выходит данная ошибка `bash: chromedriver: command not found` или `bash: mvn: command not found`, то переходим в [инструкцию](https://github.com/tatBulat/Avito_Internships/blob/master/MavenAndWebDriver.md) по установке и настройке.  
#### 3. Клонируйте репозиторий с проектом тестового задания к себе, выполнив следующую команду в терминале: ####  
```
git clone https://github.com/tatBulat/Avito_Internships.git
```

Или можно скачать zip архив по [ссылке](https://github.com/tatBulat/Avito_Internships/archive/refs/heads/master.zip) и распакуйте его.  

#### 4. Если вы клонировали репозиторий, Вы можете перейти в директорию с проектом, используя команду `cd`.  ####
```
cd Avito_Internships
```
Если вы скачали архив с проектом, тогда:  
```
cd Например: C:/Users/mirov/Downloads/Avito_Internships-master/Avito_Internships-master
```

`Важно: Если Вы копируете путь проекта на Windows, необходимо поменять слеши с "\" на "/".`

#### 5. Установите необходимые зависимости из файла `pom.xml`, выполнив команду: ####
```
mvn dependency:resolve
``` 
#### 6. Запустите тесты, выполнив команду: ####
```
mvn test
```
