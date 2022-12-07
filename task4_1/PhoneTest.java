package src.ru.mirea.task4_1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone samsung = new Phone("89252253445", "A50", 166);
        Phone iphone = new Phone("84995659876","4s");
        Phone nokia = new Phone();
        samsung.receiveCall("Zorg");
        iphone.receiveCall("Korneplod", "88005553535");
        nokia.receiveCall("Zelya");
        System.out.println(samsung.getNumber());
        System.out.println(iphone.getNumber());
        System.out.println(nokia.getNumber());
        nokia.sendMessage("89325556732", "89755856790", "89882281337");
    }
}
