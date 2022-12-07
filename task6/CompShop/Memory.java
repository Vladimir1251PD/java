package src.ru.mirea.task6.CompShop;

import java.util.Scanner;

class Memory implements Inputable {
    int memoryAmount;
    int memorySpeed;
    String manufacturer;

    public Memory() {
    }

    public Memory(int memoryAmount, int memorySpeed, String manufacturer) {
        this.memoryAmount = memoryAmount;
        this.memorySpeed = memorySpeed;
        this.manufacturer = manufacturer;
    }
    public void input() {
        System.out.println("память:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Объём памяти:");
        this.memoryAmount = scan.nextInt();
        System.out.println("Скорость чтения:");
        this.memorySpeed = scan.nextInt();
        System.out.println("Производитель:");
        scan.nextLine();
        this.manufacturer = scan.nextLine();
    }
    @Override
    public String toString() {
        return "Memory{" +
                "memoryAmount=" + memoryAmount +
                ", memorySpeed=" + memorySpeed +
                ", manufacturer='" + manufacturer + '\'' +
                "}\n";
    }
}
