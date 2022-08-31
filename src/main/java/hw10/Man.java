package hw10;

import java.util.Map;

final public class Man extends Human {

    public Man(String name, String surname, String bd) {
        super(name, surname, bd);
    }

    public Man(String name, String surname, String bd, byte iq, Map<DayOfWeek, String> schedule, Family fam, Pet pet) {
        super(name, surname, bd, iq, schedule,fam, pet);
    }

    public Man() {
        super();
    }

    @Override
    public void greetPet() {
        System.out.printf("Hi buddy :  %s\n", this.pet);
    }

    void football() {
        System.out.println("My favourite team is Real Madrid");
    }
}
