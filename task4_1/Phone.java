package src.ru.mirea.task4_1;

class Phone {
    private String number;
    private String model;
    private float weight;
    Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }
    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone() {
        number = null;
        model = null;
        weight = 0;
    }
    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }
    public void receiveCall(String name, String callerNumb) {
        System.out.printf("Звонит %s, с номером %s\n", name, callerNumb);
    }
    public String getNumber() {
        return number;
    }
    public void sendMessage(String... numbers){
        System.out.println("Номера на которые отправиться сообщение:");
        for(String str: numbers)
            System.out.printf("%s%n", str);
    }
}
