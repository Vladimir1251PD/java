package src.ru.mirea.task4;

public class SeasonsTest {
    public static void main(String[] args) {
        Seasons myFavouriteSeason = Seasons.summer;
        System.out.print("Моё любимое время года - ");
        switch (myFavouriteSeason) {
            case summer:
                System.out.print("лето\n");
                myFavouriteSeason.getDescription();
                System.out.println("Средняя температура: " + myFavouriteSeason.getAverageTemp() + " C" + (char)186 + "\n");
                break;
            case autumn:
                System.out.print("осень\n");
                myFavouriteSeason.getDescription();
                System.out.println("Средняя температура: " + myFavouriteSeason.getAverageTemp() + " C" + (char)186 + "\n");
                break;
            case winter:
                System.out.print("зима\n");
                myFavouriteSeason.getDescription();
                System.out.println("Средняя температура: " + myFavouriteSeason.getAverageTemp() + " C" + (char)186 + "\n");
                break;
            case spring:
                System.out.print("весна\n");
                myFavouriteSeason.getDescription();
                System.out.println("Средняя температура: " + myFavouriteSeason.getAverageTemp() + " C" + (char)186 + "\n");
                break;
        }
        for(Seasons example: Seasons.values()) {
            System.out.println(example.toString());
            example.getDescription();
            System.out.println("Средняя температура: " + example.getAverageTemp() + " C" + (char)186 + "\n");
        }
    }
}

enum Seasons {
    winter(-15.5f){
        public void getDescription() {
            System.out.println("Холодное время года");
        }
        @Override
        public String toString(){
            return "зима";
        }
    }, spring(8){
        public void getDescription() {
            System.out.println("Цветущее время года");
        }
        @Override
        public String toString(){
            return "весна";
        }
    }, summer(20){
        public void getDescription() {
            System.out.println("Жаркое время года");
        }
        @Override
        public String toString(){
            return "лето";
        }
    }, autumn(9.5f){
        public void getDescription() {
            System.out.println("Дождливое время года");
        }
        @Override
        public String toString(){
            return "осень";
        }
    };
    private float averageTemp;
    private Seasons(float temp)
    {
        averageTemp = temp;
    }
    public float getAverageTemp() {
        return averageTemp;
    }
    public abstract void getDescription();
}
