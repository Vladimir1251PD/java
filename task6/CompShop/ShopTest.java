package src.ru.mirea.task6.CompShop;

public class ShopTest {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        myShop.setComputerList(1);
        myShop.output();
        myShop.findComputer(ComputerMark.Office);
    }
}
