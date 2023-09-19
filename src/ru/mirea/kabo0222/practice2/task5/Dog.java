package ru.mirea.kabo0222.practice2.task5;
import java.util.*;
import java.lang.*;
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void getAgeInHum(int age)
    {
        if (age == 1)
            System.out.println("Собаке "+15+" лет по человеческим меркам");
        else if (age == 2)
            System.out.println("Собаке "+24+" лет по человеческим меркам");
        else
            System.out.println("Собаке "+(24+(age-2)*4)+" лет по человеческим меркам");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
