package VIVI;

import Homework_6.Designer_Human;
import Print.*;

import java.util.List;

public class ViewNewTest {
    public static void main(String[] args)  {
        //> 2. Принцип открытости закрытости ()
    /*
    Допустим я хочу вызвать метод печати древа с принципами открытости/закрытости
    Мои действия. Я создаю итератор и реализую его в отдельном классе (тем самым использую полиморфизм)
    Если мне требуется перегрузить этот метод как то. То я создаю еще один класс и перезагружаю его.

    А если мне потребуется что бы мой принт принимал какой-то лист то я делаю еще одн итератор и также
    реализую его в отдельном классе.

    Но при вызове мне приходится создавать экземпляр класса пример ниже

     */
        //тоесть я вызываю экземпляр класса первоначального листа
        Designer_Human designer_human = new Designer_Human();
        //Вызываю экземпляр класса через интерфейс и в случае необходимости от задачи меняю new класс
        //Это и есть принцип инверсии зависимости.
        IPrintList print = new PrintList();
        print.printList((List<Designer_Human>) designer_human);

        //то-бишь для каждого экземпляра класса будет свой printList
        IPrintList print2 = new PrintListAll();
        print2.printList((List<Designer_Human>) designer_human);

        //то-бишь для каждого экземпляра класса будет свой printList
        IPrintList print3 = new PrintListInFor();
        print3.printList((List<Designer_Human>) designer_human);

        //то-бишь для каждого экземпляра класса будет свой printList
        IPrint print4 = new PrintTree();
        print4.printTree();

        //Если все верно то мне кажется это путаница образуется и нагромождение.


    }
}
