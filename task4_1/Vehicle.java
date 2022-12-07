package src.ru.mirea.task4_1;

public abstract class Vehicle {
    double passangerTime;
    double passangerPrice;
    int passengerWeigth;

    double cargoTime;
    double cargoPrice;
    double cargoWeight;

    public abstract double getCargoTime();
    public abstract double getCargoPrice();
    public abstract double getCargoWeight();

    public abstract double getPassangerTime();
    public abstract double getPassangerPrice();
    public abstract int getPassengerWeigth();

    public abstract void setCargoTime(double time);
    public abstract void setCargoPrice(double price);
    public abstract void setCargoWeight(double weight);

    public abstract void setPassangerTime(double time);
    public abstract void setPassangerPrice(double price);
    public abstract void setPassengerWeight(int weight);
}

class Car extends Vehicle {
    public double getCargoTime()
    {
        return cargoTime;
    }
    public double getCargoPrice()
    {
        return cargoPrice;
    }
    public double getCargoWeight()
    {
        return cargoWeight;
    }

    public double getPassangerTime()
    {
        return passangerTime;
    }
    public double getPassangerPrice()
    {
        return passangerPrice;
    }
    public int getPassengerWeigth()
    {
        return passengerWeigth;
    }

    public void setCargoTime(double time)
    {
        this.cargoTime = time;
    }
    public void setCargoPrice(double price)
    {
        this.cargoPrice = price;
    }
    public void setCargoWeight(double weight)
    {
        this.cargoWeight = weight;
    }

    public void setPassangerTime(double time)
    {
        this.passangerTime = time;
    }
    public void setPassangerPrice(double price)
    {
        this.passangerPrice = price;
    }
    public void setPassengerWeight(int weight)
    {
        this.passengerWeigth = weight;
    }
}
class Plane extends Vehicle {
    public double getCargoTime()
    {
        return cargoTime;
    }
    public double getCargoPrice()
    {
        return cargoPrice;
    }
    public double getCargoWeight()
    {
        return cargoWeight;
    }

    public double getPassangerTime()
    {
        return passangerTime;
    }
    public double getPassangerPrice()
    {
        return passangerPrice;
    }
    public int getPassengerWeigth()
    {
        return passengerWeigth;
    }

    public void setCargoTime(double time)
    {
        this.cargoTime = time;
    }
    public void setCargoPrice(double price)
    {
        this.cargoPrice = price;
    }
    public void setCargoWeight(double weight)
    {
        this.cargoWeight = weight;
    }

    public void setPassangerTime(double time)
    {
        this.passangerTime = time;
    }
    public void setPassangerPrice(double price)
    {
        this.passangerPrice = price;
    }
    public void setPassengerWeight(int weight)
    {
        this.passengerWeigth = weight;
    }
}
class Train extends Vehicle {
    public double getCargoTime()
    {
        return cargoTime;
    }
    public double getCargoPrice()
    {
        return cargoPrice;
    }
    public double getCargoWeight()
    {
        return cargoWeight;
    }

    public double getPassangerTime()
    {
        return passangerTime;
    }
    public double getPassangerPrice()
    {
        return passangerPrice;
    }
    public int getPassengerWeigth()
    {
        return passengerWeigth;
    }

    public void setCargoTime(double time)
    {
        this.cargoTime = time;
    }
    public void setCargoPrice(double price)
    {
        this.cargoPrice = price;
    }
    public void setCargoWeight(double weight)
    {
        this.cargoWeight = weight;
    }

    public void setPassangerTime(double time)
    {
        this.passangerTime = time;
    }
    public void setPassangerPrice(double price)
    {
        this.passangerPrice = price;
    }
    public void setPassengerWeight(int weight)
    {
        this.passengerWeigth = weight;
    }
}
class Ship extends Vehicle {
    public double getCargoTime()
    {
        return cargoTime;
    }
    public double getCargoPrice()
    {
        return cargoPrice;
    }
    public double getCargoWeight()
    {
        return cargoWeight;
    }

    public double getPassangerTime()
    {
        return passangerTime;
    }
    public double getPassangerPrice()
    {
        return passangerPrice;
    }
    public int getPassengerWeigth()
    {
        return passengerWeigth;
    }

    public void setCargoTime(double time)
    {
        this.cargoTime = time;
    }
    public void setCargoPrice(double price)
    {
        this.cargoPrice = price;
    }
    public void setCargoWeight(double weight)
    {
        this.cargoWeight = weight;
    }

    public void setPassangerTime(double time)
    {
        this.passangerTime = time;
    }
    public void setPassangerPrice(double price)
    {
        this.passangerPrice = price;
    }
    public void setPassengerWeight(int weight)
    {
        this.passengerWeigth = weight;
    }
}
