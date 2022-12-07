package src.ru.mirea.task4_1;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();
        Train train = new Train();
        Ship ship = new Ship();

        car.setPassangerTime(60);
        car.setPassangerPrice(250);
        car.setPassengerWeight(4);

        car.setCargoTime(105.5);
        car.setCargoPrice(440);
        car.setCargoWeight(5000);

        plane.setPassangerTime(30.1);
        plane.setPassangerPrice(2500);
        plane.setPassengerWeight(800);

        plane.setCargoTime(50.5);
        plane.setCargoPrice(4000);
        plane.setCargoWeight(25000);

        train.setPassangerTime(45.5);
        train.setPassangerPrice(270);
        train.setPassengerWeight(500);

        train.setCargoTime(70);
        train.setCargoPrice(3750);
        train.setCargoWeight(100000);

        ship.setPassangerTime(115);
        ship.setPassangerPrice(210);
        ship.setPassengerWeight(500);

        ship.setCargoTime(200);
        ship.setCargoPrice(1760);
        ship.setCargoWeight(50000);


        System.out.println("Car: ");
        System.out.println("Время доставки пассажира: " + car.getPassangerTime());
        System.out.println("Стоимость перевозки пассажира: " + car.getPassangerPrice());
        System.out.println("Количество пассажиров: " + car.getPassengerWeigth());

        System.out.println("Время доставки груза: " + car.getCargoTime());
        System.out.println("Стоимость перевозки груза: " + car.getCargoPrice());
        System.out.println("Грузоподъёмность: " + car.getCargoWeight());

        System.out.println();
        System.out.println("Самолёт: ");
        System.out.println("Время доставки пассажира: " + plane.getPassangerTime());
        System.out.println("Стоимость перевозки пассажира: " + plane.getPassangerPrice());
        System.out.println("Количество пассажиров: " + plane.getPassengerWeigth());

        System.out.println("Время доставки груза: " + plane.getCargoTime());
        System.out.println("Стоимость перевозки груза: " + plane.getCargoPrice());
        System.out.println("Грузоподъёмность: " + plane.getCargoWeight());

        System.out.println();
        System.out.println("Поезд: ");
        System.out.println("Время доставки пассажира: " + train.getPassangerTime());
        System.out.println("Стоимость перевозки пассажира: " + train.getPassangerPrice());
        System.out.println("Количество пассажиров: " + train.getPassengerWeigth());

        System.out.println("Время доставки груза: " + train.getCargoTime());
        System.out.println("Стоимость перевозки груза: " + train.getCargoPrice());
        System.out.println("Грузоподъёмность: " + train.getCargoWeight());

        System.out.println();
        System.out.println("Корабль: ");
        System.out.println("Время доставки пассажира: " + ship.getPassangerTime());
        System.out.println("Стоимость перевозки пассажира: " + ship.getPassangerPrice());
        System.out.println("Количество пассажиров: " + ship.getPassengerWeigth());

        System.out.println("Время доставки груза: " + ship.getCargoTime());
        System.out.println("Стоимость перевозки груза: " + ship.getCargoPrice());
        System.out.println("Грузоподъёмность: " + ship.getCargoWeight());
    }
}
