package src.ru.mirea.task6.CompShop;

import java.util.Scanner;

class Computer implements Inputable {
    int ID;
    Processor itProcessor;
    Memory itMemory;
    Monitor itMonitor;
    ComputerMark itMark;
    public Computer() {
        this.itProcessor = new Processor();
        this.itMemory = new Memory();
        this.itMonitor = new Monitor();
    }
    public Computer(int ID, Processor itProcessor, Memory itMemory, Monitor itMonitor, ComputerMark itMark) {
        this.itProcessor = itProcessor;
        this.itMemory = itMemory;
        this.itMonitor = itMonitor;
        this.itMark = itMark;
    }

    @Override
    public String toString() {
        String res = "ID: " + ID + '\n' + "Характеристики:\n" + itProcessor.toString() + itMemory.toString() + itMonitor.toString() + "Марка: " + itMark.Translate() + "\n";
        return res;
    }
    public void input() {
        System.out.println("Введите характеристики компьютера:");
        Scanner scan = new Scanner(System.in);
        System.out.print("ID: ");
        this.ID = scan.nextInt();
        itProcessor.input();
        itMemory.input();
        itMonitor.input();
        System.out.print("Марка: ");
        String mark;
        scan.nextLine();
        mark = scan.nextLine();
        switch(mark) {
            case "Игровой":
                itMark = ComputerMark.Gaming;
                break;
            case "Офисный":
                itMark = ComputerMark.Office;
                break;
            case "Мощный":
                itMark = ComputerMark.HighPerfomance;
                break;
            case "Широкий монитор":
                itMark = ComputerMark.HighResolution;
                break;
        }
}

}

enum ComputerMark {
    Gaming, Office, HighPerfomance, HighResolution;
    public String Translate() {
        switch(this.ordinal()) {
            case 0:
                return "Игровой";
            case 1:
                return "Офисный";
            case 2:
                return "Мощный";
            case 3:
                return "Широкий монитор";
            default:
                return "Null";
        }
    }
}
