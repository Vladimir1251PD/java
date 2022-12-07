package src.ru.mirea.task2;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author newAuthor;
        System.out.print("Введите имя автора: ");
        Scanner in = new Scanner(System.in);
        String name, email;
        char gender;
        name = in.nextLine();
        System.out.print("Введите адресс эл. почты: ");
        email = in.nextLine();
        System.out.print("Введите пол: ");
        gender = in.next().charAt(0);
        newAuthor = new Author(name, email, gender);
        System.out.println(newAuthor.toString());
    }
}
