package src.ru.mirea.task6.CompShop;

import java.util.ArrayList;

class Shop {
    ArrayList<Computer> computerList = new ArrayList<Computer>();
    void setComputerList(int n) {
        for(int i = 0; i < n; i++)
        {
            Computer e = new Computer();
            e.input();
            computerList.add(e);
        }

    }
    void deleteComputer(int id) {
        int index = -1;
        for(Computer obj: computerList)
        {
            if (obj.ID == id)
                index = computerList.indexOf(obj);
        }
        if (index != -1)
            computerList.remove(index);
    }
    void findComputer(ComputerMark mark)  {
        int index = 0;
        System.out.println("\nПоиск компьютера заданной марки:\n");
        for(Computer obj: computerList)
        {
            if (obj.itMark == mark) {
                index++;
                System.out.println("1) " + obj.toString());
            }
        }
        if (index == 0)
            System.out.println("компьютер не найден!");
    }

    public void output() {
        System.out.println("\tSHOP");
        for(Computer obj: computerList)
        {
            System.out.print(obj.toString());
        }
    }
}
