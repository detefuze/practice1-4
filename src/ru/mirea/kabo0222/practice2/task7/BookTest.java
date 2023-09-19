package ru.mirea.kabo0222.practice2.task7;
import java.util.*;
import java.lang.*;
public class BookTest {
    public static void main(String[] args) {
        Book James = new Book("James Told", "Rate", 2004);
        System.out.println(James.toString());
        Book Carl = new Book("Carl Left", "Beautiful", 2006);
        Book Peter = new Book("Peter Right", "Call", 2018);
        Book[] many_books = {Carl, James, Peter};
        BookShelve first = new BookShelve(many_books,3);
        System.out.println(first.toString());
        first.max_year();
        first.min_year();
        first.sorting_books(many_books);
        System.out.println(first.toString());
    }

}
