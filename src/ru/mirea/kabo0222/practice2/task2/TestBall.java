package ru.mirea.kabo0222.practice2.task2;
import java.util.*;
public class TestBall
{
    public static void main(String[] args) {
        Ball object = new Ball(1.0, -3.0);
        object.setX(-5.0);
        System.out.println(object.toString());
        object.move(7.0, 2.0);
        System.out.println(object.toString());
    }
}
