package ru.mirea.kabo0222.practice3.task4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner source = new Scanner(System.in);
        boolean isTrue = true;
        int n = 0;
        System.out.println("Введите размер массива: ");
        n = source.nextInt();
        if (n < 0)
        {
            while(isTrue)
            {
                System.out.println("Введите размер массива: ");
                n = source.nextInt();
                if (n > 0)
                    isTrue = false;
            }
        }
        int k = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; ++i)
        {
            arr[i] = rand.nextInt(n);
            if (arr[i] % 2 == 0)
                ++k;
            System.out.println(arr[i]);
        }
        System.out.println("\n");
        int[] arr_chet = new int[k];
        for (int i = 0, j = 0; i < arr.length; ++i)
        {
            if (arr[i] % 2 == 0){
                arr_chet[j] = arr[i];
                System.out.println(arr_chet[j]);
                ++j;
            }

        }
    }
}
