package src.ru.mirea.task6.CompShop;

import java.util.Scanner;

class Processor implements Inputable {
    int clockSpeed;
    int coresCount;
    String manufacturer;

    public Processor() {
    }

    public Processor(int clockSpeed, int coresCount, String manufacturer) {
        this.clockSpeed = clockSpeed;
        this.coresCount = coresCount;
        this.manufacturer = manufacturer;
    }
    public void input() {
        System.out.println("процессор:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Тактовая частота:");
        this.clockSpeed = scan.nextInt();
        System.out.println("Количество ядер:");
        this.coresCount = scan.nextInt();
        scan.nextLine();
        System.out.println("Производитель:");
        this.manufacturer = scan.nextLine();
    }
    @Override
    public String toString() {
        return "Процессор{" +
                "clockSpeed=" + clockSpeed +
                ", coresCount=" + coresCount +
                ", manufacturer='" + manufacturer + '\'' +
                "}\n";
    }
}
