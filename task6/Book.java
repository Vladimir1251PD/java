package src.ru.mirea.task6;

class Book implements Printable {
    private String author;
    private String type;
    private String name;
    Book(String author, String type, String name)
    {
        this.author = author;
        this.name = name;
        this.type = type;
    }
    public void print() {
        System.out.printf("Автор: %s%n", author);
        System.out.printf("Жанр: %s%n", type);
        System.out.printf("Название: %s%n", name);
    }
}
