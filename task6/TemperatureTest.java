package src.ru.mirea.task6;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        System.out.println("введите кол-во градусов по Цельсию:");
        Scanner scan = new Scanner(System.in);
        float temperature = scan.nextFloat();
        Temperature t = new Temperature(temperature);
        System.out.println("Температура по Фаренгейту: " + t.convert("fahrenheit"));
        System.out.println("Температура по Кельвину: " + t.convert("kelvin"));
    }
}
class Temperature implements Convertible{
    float celsius;
    Temperature() {
        celsius = 0;
    }
    Temperature(float celsius) {
        this.celsius = celsius;
    }
    public float convert(String measurement) {
        switch(measurement) {
            case "fahrenheit":
                return celsius*1.8f +32;
            case "kelvin":
                return celsius +273;
            default:
                System.out.println("Wrong measurement");
                return -1;
        }
    }
}
