🧠 Design Patterns Demo Project (Interpreter, Memento, Observer)
Этот проект демонстрирует применение трёх поведенческих шаблонов проектирования на языке Java:

Interpreter (Интерпретатор) – для обработки арифметических выражений

Memento (Снимок) – для сохранения и восстановления состояния редактора текста

Observer (Наблюдатель) – для оповещения новостных каналов при обновлении заголовков

🔧 Структура проекта
bash
Копировать код
.
├── Expression.java
├── Interpreter.java
├── OperationExpression.java
├── NumberExpression.java
│
├── Memento.java
├── TextEditor.java
├── History.java
│
├── Observer.java
├── Observable.java
├── NewsAgency.java
├── NewsChannel.java
│
└── Main.java
📦 Используемые технологии
Язык: Java 8+

IDE: Совместимо с IntelliJ IDEA, Eclipse, VS Code

🚀 Как запустить
Склонируйте проект или просто скопируйте файлы:

bash
Копировать код
git clone <this-repo-url>
Откройте проект в своей IDE (например, IntelliJ IDEA)

Убедитесь, что в проекте есть JDK (Java Development Kit)

Запустите файл Main.java

🔍 Как это работает
1. Interpreter Pattern (Паттерн "Интерпретатор")
Класс Interpreter принимает строку вида "5 + 2 - 3"

Преобразует её в стек выражений и вычисляет результат

Используются классы Expression, NumberExpression, OperationExpression

2. Memento Pattern (Паттерн "Снимок")
Класс TextEditor позволяет вводить текст

Состояния текста сохраняются в объекте Memento через History

Можно отменить изменения, восстанавливая предыдущее состояние

3. Observer Pattern (Паттерн "Наблюдатель")
NewsAgency — издатель, который отправляет новости

NewsChannel — подписчики, которые получают обновления

Когда устанавливается новый заголовок, все наблюдатели уведомляются

📦 Пример вывода в консоли
mathematica
Копировать код
Interpreter Pattern
Expression: 5 + 2 - 3
Result: 4

Memento Pattern
Current text: Hello, World!
After undo: Hello, 
After second undo: 

Observer Pattern
Channel 1 received headline: Breaking News: Observer Pattern in Action!
Channel 2 received headline: Breaking News: Observer Pattern 
