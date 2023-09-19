package ru.mirea.kabo0222.practice2.task7;
import java.util.*;
import java.lang.*;
public class BookShelve {
    private Book[] books;
    private int num_books;
    private int[] books_years;

    public BookShelve(Book[] books, int num_books) {
        this.books = books;
        this.num_books = num_books;
        this.books_years = new int[num_books];
        for (int i = 0;i < num_books;++i)
        {
            books_years[i] = books[i].getYear();
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getNum_books() {
        return num_books;
    }

    public void setNum_books(int num_books) {
        this.num_books = num_books;
    }

    public void max_year()
    {
        Arrays.sort(books_years);
        for (int i = 0;i < num_books;++i)
        {
            if (this.books[i].getYear() == books_years[num_books-1])
            {
                System.out.println("Книга с максимальным годом издания: "+this.books[i].getName());
                break;
            }
        }
    }
    public void min_year()
    {
        Arrays.sort(books_years);
        for (int i = 0;i < num_books;++i)
        {
            if (this.books[i].getYear() == books_years[0])
            {
                System.out.println("Книга с минимальным годом издания: "+this.books[i].getName());
                break;
            }
        }
    }

    public void sorting_books(Book[] books)
    {
        for (int i = 0; i < num_books;++i)
        {
            for (int j = 1; j < num_books;++j)
            {
                if (books[j].getYear()<books[j-1].getYear())
                {
                    Book temp = books[j-1];
                    books[j-1] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BookShelve{books=" + Arrays.toString(books) + '}';
    }
}
