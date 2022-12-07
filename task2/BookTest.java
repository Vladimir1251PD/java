package src.ru.mirea.task2;

public class BookTest {
    public static void main(String[] args) {
        Book myBook = new Book("Образец книги", 256, "Известный автор", "мой жанр");
        myBook.ReadTheBook();
        myBook.OpenTheBook();
        myBook.ReadTheBook();
        myBook.ReadTheBook();
        myBook.ReadTheBook();
        myBook.CloseTheBook();
    }
}
