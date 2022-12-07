package src.ru.mirea.task6;

import java.util.ArrayList;

class Shop implements Printable {
    ArrayList<Book> booksArr;
    Shop(ArrayList<Book> booksArr) {
        this.booksArr = new ArrayList<Book>(booksArr);
    }
    public void print() {
        for(Book aBook: booksArr) {
            System.out.println("Книга " + (booksArr.indexOf(aBook) +1));
            aBook.print();
        }
    }
}
