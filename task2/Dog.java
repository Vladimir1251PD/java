package src.ru.mirea.task2;

class Dog {
    private String name;
    private short age;
    Dog(String name, short age) {
        this.age = age;
        this.name = name;
    }
    void SetName(String newName) {
        name = newName;
    }
    void SetAge(short newAge) {
        age = newAge;
    }
    String GetName() {
        return name;
    }
    short GetAge() {
        return age;
    }
    static short DogAgeToHumanAge(short age) {
        return (short)(7*age);
    }
    @Override
    public String toString() {
        return ("Это собака по кличке " + name + ". Ей "+ age + " лет");
    }
}
