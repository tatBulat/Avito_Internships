# Maven
__Для Windows__  
1. Перейдите на сайт [Apache Maven](https://maven.apache.org/download.cgi).  
2. Скачайте архив с Maven и распакуйте его на вашем компьютере (например, в `C:\Users\mirov\Downloads\`).  
3. Добавьте путь к папке `bin` в `Maven` в переменную среды `PATH`:  
* Откройте «Панель управления» -> «Система и безопасность» -> «Система» -> «Дополнительные параметры системы» -> «Переменные среды».  
* Найдите переменную PATH в разделе переменных пользователя и добавьте путь к Maven, например C:\Program Files\Apache\maven\bin.
4. Откройте новое окно командной строки и выполните команду:  
```
mvn -v
```
5. Проверьте установку Maven и после установки снова выполните команду:
```
mvn -v
```
***  
__Для Mac__  
Установите Homebrew (если он еще не установлен).  

Откройте терминал и выполните следующую команду для установки Homebrew:
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
После установки Homebrew проверьте его работоспособность:  
```
brew --version
```
Установите Maven через Homebrew.  

Теперь вы можете установить Apache Maven, используя Homebrew:
```
brew install maven
```
Проверьте установку Maven.  

После установки убедитесь, что Maven установлен правильно, проверив его версию:
```
mvn -v
```
Настройка переменной окружения `MAVEN_HOME`.  

Если Maven установлен, но не работает корректно, вам может потребоваться настроить переменную `MAVEN_HOME`.  

Откройте файл конфигурации `.bash_profile` или `.zshrc` (в зависимости от вашего терминала):  
```
nano ~/.bash_profile  # или ~/.zshrc, если вы используете zsh
```
Добавьте следующую строку:  
```
export MAVEN_HOME=/usr/local/Cellar/maven/<версия_установленного_maven>
export PATH=$MAVEN_HOME/bin:$PATH
```
Сохраните файл и выполните следующую команду для обновления переменных окружения:  
```
source ~/.bash_profile  # или source ~/.zshrc, если используется zsh
```
Проверка работы Maven

Проверьте снова:  
```
mvn -v
```
Теперь Maven должен быть установлен и готов к использованию на вашем Mac.  
# ChromeDriver
__Для Windows__  
1. Скачайте [ChromeDriver](https://storage.googleapis.com/chrome-for-testing-public/128.0.6613.119/win64/chrome-win64.zip).    
2. Разархивируйте его и положите файл `chromedriver.exe` в удобную директорию, например `C:\Users\mirov\Downloads\`.  
3. Добавьте путь к ChromeDriver в переменные среды:  
* Перейдите в "Параметры системы" → "Дополнительные параметры системы" → "Переменные среды".  
* В разделе "Переменные пользователя" найдите переменную `PATH` и добавьте путь к папке с `chromedriver.exe`.  
4. После этого проверьте снова:  
```
chromedriver --version
```  
Если все настроено правильно, эта команда должна показать версию установленного ChromeDriver.  
***
__Для Mac__  
Выполните следующие команды в терминале, чтобы установить ChromeDriver:
```
brew install chromedriver
```
Добавление в PATH (если путь не настроен):  
* После установки ChromeDriver его нужно добавить в `PATH`.

Откройте файл `~/.bashrc` (или `~/.bash_profile`):
```
nano ~/.bashrc
```
Добавьте строку:  
```
export PATH=$PATH:/path/to/chromedriver
```
Замените `/path/to/chromedriver` на фактический путь к ChromeDriver.  

Примените изменения:  
```
source ~/.bashrc
```
После этого проверьте снова:  
```
chromedriver --version
```  
