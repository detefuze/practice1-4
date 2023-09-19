package ru.mirea.kabo0222.practice3.task1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] mas = new double[10];
        // С помощью класса Random
        for (int i = 0; i < mas.length/2; ++i)
        {
            mas[i] = rand.nextDouble();
        }
        // С помощью класса Math и его метода random
        for (int i = mas.length/2; i < mas.length; ++i)
        {
            mas[i] = Math.random();
        }
        // Вывод элементов массива до сортировки
        for (double el : mas) {
            System.out.println(el);
        }
        System.out.println("\n");
        // Сортировка
        for (int i = 0; i < mas.length-1;++i)
        {
            for (int j = i+1; j < mas.length;++j)
            {
                if (mas[i] > mas[j])
                {
                    double temp = mas[j];
                    mas[j] = mas[i];
                    mas[i] = temp;
                }
            }
        }
        // Вывод элементов массива после сортировки
        for (double el : mas) {
            System.out.println(el);
        }
    }
}
