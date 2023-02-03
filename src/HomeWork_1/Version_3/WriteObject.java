package HomeWork_1.Version_3;

import HomeWork_1.Version_4.Human;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class WriteObject {
    /*
    Класс для возврата FileInputStream [Считываем файл]
     */
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("Human.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            HomeWork_1.Version_4.Human FF = (HomeWork_1.Version_4.Human) ois.readObject(); //возвращает родителя класса object
            HomeWork_1.Version_4.Human F1 = (Human) ois.readObject();
            System.out.println(FF);
            System.out.println(F1);
            ois.close();
        } catch (FileNotFoundException e) { //обрабатываем объекты
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e); //добавляем исключения без класса Human
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
