package ru.mirea.kabo0222.practice1.tasks;
import java.util.*;
public class Main {
    // Задача 1
    /*
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int k = 0, sum = 0;
        while (k < arr.length){
            if (sc.hasNextInt()){
                arr[k] = sc.nextInt();
            } else {
                System.out.println("Был введен неверный тип данных!");
            }
            ++k;
        }
        k = 0;

        int sr_arif = 0;
        for (int i = 0; i < arr.length;++i) {
            sum += arr[i];
        }
        System.out.println("Среднее арифметическое: "+sum/arr.length);
        System.out.println("\nСумма: "+sum);
    }
     */
    // Задача 2
    /*
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int k = 0, sum = 0;
        while (k < arr.length){
            if (sc.hasNextInt()){
                arr[k] = sc.nextInt();
            } else {
                System.out.println("Был введен неверный тип данных!");
            }
            ++k;
        }
        k = 0;
        int max = arr[0], min = 10000;

        do{
            sum += arr[k];
            if (min > arr[k]){
                min = arr[k];
            }
            if (k > 0){
                if (max < arr[k]){
                    max = arr[k];
                }
            }
            ++k;
        } while (k < arr.length);

        while (k < arr.length){
            sum += arr[k];
            if (min > arr[k]){
                min = arr[k];
            }
            if (k > 0){
                if (max < arr[k]){
                    max = arr[k];
                }
            }
            ++k;
        }

        System.out.println("Сумма: "+sum);
        System.out.println("Минимум: "+min+"\nМаксимум: "+max);
    }
        */
    // Задание 4
    /*
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int k = 0, sum = 0;
        while (k < arr.length){
            if (sc.hasNextInt()){
                arr[k] = sc.nextInt();
            } else {
                System.out.println("Был введен неверный тип данных!");
            }
            ++k;
        }
        k = 0;
        double n = 10;
        double row = 0;
        while (n > 0)
        {
            row += 1/n;
            --n;
        }
        System.out.println(row);
    }
    */
    // Задание 5
    /*
    public static void main(String[] args)
    {
        factorial(4);
    }
    public static void factorial(int a)
    {
        int result = 1;
        int num = 2;
        while (num <= a){
            result *= num;
            ++num;
        }
        System.out.println(result);
    }
    */
}
