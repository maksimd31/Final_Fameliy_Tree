package HomeWork_1.Version_2;

import HomeWork_1.Version_3.Human;

import java.util.Objects;
import java.util.Scanner;

public class metod {
    public static void getname1(HomeWork_1.Version_3.Human[] Baza) { // фильтр имени
        System.out.println("Введите имя");
        while (true) {
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "Иван")) {
                System.out.print(Human.getNAME(Baza, "Иван"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }


}
