package src.ru.mirea.task6;

import java.util.ArrayList;

public class ShopTest {
    public static void main(String[] args) {
        ArrayList<Book> bookArr = new ArrayList<Book>();
        bookArr.add(new Book("Vasya", "Fantasy", "Vasya Kurolesov"));
        bookArr.add(new Book("Vasya", "Fantasy", "Test"));
        bookArr.add(new Book("Vasya", "Fantasy", "Test2"));
        bookArr.add(new Book("Vasya", "Fantasy", "3Test"));
        Shop myShop = new Shop(bookArr);
        myShop.print();
    }
}
