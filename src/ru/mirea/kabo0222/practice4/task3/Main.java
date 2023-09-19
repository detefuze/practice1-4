package ru.mirea.kabo0222.practice4.task3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        ArrayList<String> basket = new ArrayList<>(1);
        String login, password, catalog, answer;
        System.out.println("Введите логин:");
        login = source.nextLine();
        System.out.println("Введите пароль:");
        password = source.nextLine();
        if (Account.authorization(login,password))
        {
            System.out.println("Каталог товаров: ");
            for (int i = 0; i < Catalog.values().length; ++i)
                System.out.println(Catalog.values()[i]);
            catalog = source.nextLine();
            if (catalog.equals("Clothes"))
            {
                for (int i = 0; i < Clothes.values().length; ++i)
                    System.out.println(Clothes.values()[i]);
                String message = "";
                message = source.nextLine();
                while(!message.equals("stop"))
                {
                    assert false;
                    basket.add(message);
                    message = source.nextLine();
                }
                if (!basket.get(0).equals("stop"))
                {
                    System.out.println("Корзина:");
                    for (int i = 0; i < basket.size(); ++i)
                    {
                        System.out.println(basket.get(i));
                    }
                    System.out.println("Купить? Y/N");
                    answer = source.nextLine();
                    if (answer.equals("Y"))
                        System.out.println("Покупка совершена");
                    else if (answer.equals("N"))
                        System.out.println("Покупка не совершена");
                }
                else
                    System.out.println("Корзина пуста");

            }
            else if (catalog.equals("Food"))
            {
                for (int i = 0; i < Food.values().length; ++i)
                    System.out.println(Food.values()[i]);
                String message = "";
                message = source.nextLine();
                while(!message.equals("stop"))
                {
                    assert false;
                    basket.add(message);
                    message = source.nextLine();
                }
                if (!basket.get(0).equals("stop"))
                {
                    System.out.println("Корзина:");
                    for (int i = 0; i < basket.size(); ++i)
                    {
                        System.out.println(basket.get(i));
                    }
                    System.out.println("Купить? Y/N");
                    answer = source.nextLine();
                    if (answer.equals("Y"))
                        System.out.println("Покупка совершена");
                    else if (answer.equals("N"))
                        System.out.println("Покупка не совершена");
                }
                else
                    System.out.println("Корзина пуста");

            }

        }
        else
            System.out.println("Неудачная аутентификация");
    }
}
