package src.ru.mirea.task2;

class Book {
    private String title;
    private int pagesCount = 0;
    private int pagesRead = 0;
    private String author;
    private String genre;
    private boolean isOpened = false;
    Book(){}
    Book(String title, int pagesCount, String author, String genre)
    {
        this.title = title;
        this.pagesCount = pagesCount;
        this.author = author;
        this.genre = genre;
    }
    void SetTitle(String title) {
        this.title = title;
    }
    void SetPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }
    void SetAuthor(String author) {
        this.author = author;
    }
    void SetGenre(String genre) {
        this.genre = genre;
    }
    void OpenTheBook() {
        isOpened = true;
        System.out.println("Вы открыли книгу");
    }
    void ReadTheBook() {

        if (isOpened) {
            pagesRead++;
            System.out.printf("Вы читаете книгу на %d странице под названием %s, которую написал %s\n", pagesRead, title, author);
        }
        else
            System.out.println("Книга закрыта");
    }
    void CloseTheBook() {
        isOpened = false;
        System.out.println("Вы закрыли книгу");
    }
}
