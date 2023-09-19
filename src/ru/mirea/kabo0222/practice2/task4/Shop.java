package ru.mirea.kabo0222.practice2.task4;
import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class Shop {
    private int comp_num;
    private String[] computers = new String[comp_num];

    public Shop(int comp_num, String[] computers) {
        this.comp_num = comp_num;
        this.computers = computers;
    }

    public int getComp_num() {
        return comp_num;
    }

    public String[] getComputers() {
        return computers;
    }

    public void setComp_num(int comp_num) {
        this.comp_num = comp_num;
    }

    public void setComputers(String[] computers) {
        this.computers = computers;
    }

    public void addComputer(String c)
    {
        ++comp_num;
        computers[comp_num-2] = c;
    }

    public void deleteComputer(String c)
    {
        String[] arr = new String[comp_num];
        for (int i = 0; i < computers.length;++i) {
            if (!computers[i].equals(c))
                arr[i] = computers[i];
        }
        --comp_num;
        computers = arr;
    }

    public void findComputer(String c)
    {
        int i = 0;
        for (String computer : computers) {
            if (computer.equals(c))
            {
                System.out.println("Есть в наличии");
                i = 1;
            }
        }
        if (i == 0)
            System.out.println("Нет в наличии");
    }

    @Override
    public String toString() {
        return "Shop{" +
                "comp_num=" + comp_num +
                ", computers=" + Arrays.toString(computers) +
                '}';
    }
}
