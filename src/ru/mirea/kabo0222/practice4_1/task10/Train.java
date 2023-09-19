package ru.mirea.kabo0222.practice4_1.task10;

import java.util.Formatter;

public class Train extends Vehicle {
    public Train(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }

    protected void move(int distance)
    {
        Formatter formatter = new Formatter();
        double time;
        time = (double)distance/(double)speed;
        System.out.println(formatter.format("Время в пути на поезде: %.2f hours\n" +
                "Цена поездки на поезде: %.2f $", time, price*distance));
    }
}
