package ru.mirea.kabo0222.practice2.task4;
import java.util.*;
public class ShopTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] computers = {"Razer", "Tog", "Dell","Philips", "Yama"};
        boolean signal = false;
        int number = 0;
        String choice;
        Shop DNS = new Shop(5, computers);
        System.out.println("Вы вошли в компьютерный магазин!");
        System.out.println("Ищете конкретный компьютер? Нажмите 1\n" +
                "Показать данные о каталоге? Нажмите 2\n" +
                "Удалить компьютер из ваших предпочтений? Нажмите 3\n" +
                "Добавить компьютер? Нажмите 4\n" +
                "Хотите выйти из магазина? Нажмите 0\n");
        number = sc.nextInt();
        if (number != 0) {
            while (!signal) {
                if (number == 0)
                    signal = true;
                else if (number == 1) {
                    System.out.println("Компьютер:");
                    choice = sc.next();
                    DNS.findComputer(choice);
                } else if (number == 2)
                    System.out.println(DNS.toString());
                else if (number == 3) {
                    System.out.println("Компьютер:");
                    choice = sc.next();
                    DNS.deleteComputer(choice);
                } else if (number == 4) {
                    System.out.println("Компьютер:");
                    choice = sc.next();
                    DNS.addComputer(choice);
                }
                System.out.println("Ваше дальнейшее действие?");
                number = sc.nextInt();
            }
        }
        System.out.println("Вы вышли из магазина!");
    }
}
