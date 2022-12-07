package src.ru.mirea.task6.CompShop;

import java.util.Scanner;

class Monitor implements Inputable {
    int diagonal;
    String manufacturer;

    public Monitor() {
    }

    public Monitor(int diagonal, String manufacturer) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }
    public void input() {
        System.out.println("монитор:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Диагональ:");
        this.diagonal = scan.nextInt();
        scan.nextLine();
        System.out.println("Производитель:");
        this.manufacturer = scan.nextLine();
    }
    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                "}\n";
    }
}
