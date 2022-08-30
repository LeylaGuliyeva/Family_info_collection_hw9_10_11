package hw9;

import java.util.Map;

final public class Woman extends Human {
    public Woman() {
        super();
    }
    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, byte iq, Map<DayOfWeek, String> schedule, Family fam, Pet pet) {
        super(name, surname, year, iq, schedule,fam, pet);
    }


    @Override
    public void greetPet() {
        System.out.printf("Hi my dear friend :  %s\n", this.pet);
    }

    void morning() {
        System.out.println("Good morning my dear family!!!");
    }
}

