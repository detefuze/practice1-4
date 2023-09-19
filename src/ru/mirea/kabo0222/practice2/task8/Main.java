package ru.mirea.kabo0222.practice2.task8;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D"};
        for (int i = 0; i < str.length/2;++i)
        {
            String temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
        }
        for (String s : str) System.out.println(s);
    }
}
