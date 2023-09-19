package ru.mirea.kabo0222.practice3.task3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int[] arr_sorted = new int[4];
        for (int i = 0; i < arr.length; ++i)
        {
            arr[i] = (int)(Math.random()*(100-10)+10);
            arr_sorted[i] = arr[i];
            System.out.println(arr[i]);
        }
        Arrays.sort(arr_sorted);
        if (Arrays.equals(arr, arr_sorted))
        {
            System.out.println("Массив является строко возрастающей последовательностью");
        }
    }
}
