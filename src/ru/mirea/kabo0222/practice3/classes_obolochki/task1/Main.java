package ru.mirea.kabo0222.practice3.classes_obolochki.task1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 1
        Double a = Double.valueOf("123");
        Double b = Double.valueOf("333");

        // 2
        String num = "123";
        System.out.println(Double.parseDouble(num));

        // 3
        Double double_value = 455.0;
        System.out.println(double_value.intValue());
        System.out.println(double_value.byteValue());
        System.out.println(double_value.floatValue());
        System.out.println(double_value.longValue());
        System.out.println(double_value.shortValue());

        // 4
        System.out.println(a);

        // 5
        String d = Double.toString(3.14);
    }
}
