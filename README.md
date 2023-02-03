# В корневой папке есть свой файл readme.md
# в директории HomeWork_1_2_redone -> Находится переделанное с нуля домашнее задание 

# Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

> В этой ветке хранится решение домашнего задания №1 и №2

### Домашнее задание №1

Реализовать, с учетом ооп подхода, приложение
Для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
модель человека и модель семейного дерева для хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
У дерева обязательно реализовать метод добавления нового человека в семейное дерево, поиск человека по имени и вывод всех людей из дерева.
У человека можно реализовать методы вывода всех сестер или всех детей.
Проект сдать либо в виде репозитория либо в виде PullRequest к проекту: https://github.com/Liberate520/homeWork
Если делаете PR, то в качестве ответа укажите ссылку на конкретный PR
Инструкция на то как сделать PR https://youtu.be/veMDnBt30pk
По вопросам домашки писать @Liberate520
Обязательно пробуем свои силы, в дальнейшем будем этот проект развивать

> Получил оценку хорошо, И решил все переделать. Хотелось бы получить отлично!
> По возможности пересмотрел все лекции ООП с Каменецким и поняли что он недостаточно объясняет хорошо для моего понимания.
> Пересмотрел все семинары стало понятнее.
> В общем посмотрел что-то на ютубчике + книга head fist "Изучаем Java" помогла разъяснить что да как и
> переделал первое Д/З с пояснениями действий и с описанием что для чего.

### Домашнее задание №2
Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
В проекте с гениалогическим древом подумайте и используйте интерфейсы.
Дополнить проект методами записи в файл и чтения из файла. Для этого создать отдельный класс и реализовать в нем
нужные методы. Для данного класса сделайте интерфейс, который и используйте в своей программе. Например, в классе дерева в качестве аргумента метода save передавайте не конкретный класс, а объект интерфейса, с помощью которого и будет происходить запись. Пример работы с интерфейсом Serialazable можно найти в материалах к уроку.

> Получил оценку удовлетворительно, и решил все переделать. Хотелось бы получить отлично!
> Продолжил пересматривать материал по ООП, сделал выводы и все переделал, с пояснением в комментарий.
> Переделал методы добавления людей в древо.
> Переделал интерфейсы включая интерфейс Serialazable. 

### Домашнее задание №3
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
В проекте с деревом реализовать интерфейс Iterable для дерева.
Создать методы сортировки списка людей перед выводом, например по имени или по дате рождения

> Продолжил пересматривать материал по ООП, сделал выводы и все переделал, с пояснением в комментарий.
> Добавил Iterable + различные виды сортировок. 

### Домашнее задание №4
Урок 4. ООП: Обобщения. ч1
Продолжаем грейдить наш проект с гениологическим древом. Изменить древо, сделать класс параметизированным. Продумать класс общения с пользователем, сделать набор команд, для операций над деревом

> Создал отдельный класс кэширования с использованием дженериков.(что бы не ломать готовые классы)
> реализовал его чтение через main в 18 строке.
>
> Создаю отдельный класс для общения пользователем CommunicationWithUsers (не успел доделать но план реализации написал)
> Сделал описание каждой функции и старые пометил @как устаревшая функция
> Переделал и добавил новые варианты сортировки в Service
> Добавил новые улучшение методы, лямда выражения и указатели к ним
> Старался использовать верблюжий стиль программирования.
>
>
> убрал все лишнее из main и раскидал по файлам.
> Начал делать сразу 2 варианта вывода класса общения с пользователем, не закончил не один)
> Прописал try/catch в виде обработки ошибки, для замены else для switch
>
> Старался все по максимуму упорядочить, навести порядок, сделал код ревью))
> 
>



