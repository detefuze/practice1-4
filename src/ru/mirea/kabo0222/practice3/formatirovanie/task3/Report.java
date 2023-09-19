package ru.mirea.kabo0222.practice3.formatirovanie.task3;
import java.text.DecimalFormat;
import java.util.*;
public class Report {
    static void generate_report(Employee[] people)
    {
        DecimalFormat formatter = new DecimalFormat("#### dollars");
        for (int i = 0; i < people.length; ++i)
            System.out.println(people[i].getFullname()+" - "+(String.format("%13s", formatter.format(people[i].getSalary()))));
    }
}
