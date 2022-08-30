package hw9;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Human {
    protected String name;
    protected String surname;
    protected int year;
    protected int iq;
    protected Map<DayOfWeek, String> schedule;;
    protected Family family;
    protected Pet pet;

    public void greetPet(){System.out.println("Hi, dear "+this.pet.getNickname()+"!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return this.schedule.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }


    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString(){
        return "Human{name='" + this.name + "', surname='" + this.surname + "', year=" + this.year + ", iq=" + (this.iq!=0?this.iq:"null") + ", schedule="+this.schedule+"}";
    }


    protected Human() {

    }
    protected Human(String nm, String snm, int yr){
        this.name = nm;
        this.surname = snm;
        this.year = yr;
    }

    protected Human(String nm, String snm, int yr, byte iq, Map<DayOfWeek, String> sdle, Family fam, Pet pet) {
        this.name = nm;
        this.surname = snm;
        this.year = yr;
        this.iq=iq;
        this.schedule=sdle;
        this.family=fam;
        this.pet=pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getYear() == human.getYear() && getIq() == human.getIq() && getName().equals(human.getName()) && getSurname().equals(human.getSurname()) && getFamily().equals(human.getFamily());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getYear(), getFamily());
    }
    @Override
    protected void finalize(){
        System.out.println("Human class element will be deleted!");
    }
}