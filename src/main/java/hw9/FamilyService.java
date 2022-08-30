package hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class FamilyService {
    FamilyDao famDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return famDao.getAllFamilies();
    }
    public void displayAllFamilies(List<Family> af) {
        System.out.println(famDao.getAllFamilies().toString());
    }
    public List<Family> getFamiliesBiggerThan(int x) {
        List<Family> famBiggerThan = new ArrayList<>();
        famDao.getAllFamilies().forEach(z -> {
            if (z.countFamily() > x) {
                famBiggerThan.add(z);
            }
        });
        System.out.println(famBiggerThan.toString());
        return famBiggerThan;
    }
    public List<Family> getFamiliesLessThan(int x) {
        List<Family> famLessThan = new ArrayList<>();
        famDao.getAllFamilies().forEach(z -> {
            if (z.countFamily() < x) {
                famLessThan.add(z);
            }
        });
        System.out.println(famLessThan.toString());
        return famLessThan;
    }
    public int countFamiliesWithMemberNumber(int x) {
        List<Family> famWithMemberNumber= new ArrayList<>();
        famDao.getAllFamilies().forEach(z -> {
            if (z.countFamily()==x) {
                famWithMemberNumber.add(z);
            }
        });
        return famWithMemberNumber.size();
    }
    public void createNewFamily(Human mother,Human father){
        famDao.saveFamily(new Family(mother,father));
    }
    public void deleteFamilyByIndex(int x){
        famDao.deleteFamily(x);
    }
    public Family bornChild(Family fam,GenderOfPerson gen){
        Human baby=new Human(gen==GenderOfPerson.FEMININE?"Ada":"Aidan",fam.getSurname(), Calendar.getInstance().get(Calendar.YEAR));
        fam.addChild(baby);
        famDao.saveFamily(fam);
        return fam;}
    public Family adoptChild(Family fam,Human h){
        fam.addChild(h);
        famDao.saveFamily(fam);
        return fam;
    }
    public void deleteAllChildrenOlderThen(int x){
        famDao.getAllFamilies().forEach(z -> z.getChildren().forEach(a->{
            if(Calendar.getInstance().get(Calendar.YEAR)-a.getYear()>x){
                z.deleteChild(a);
                famDao.saveFamily(z);
            }}));
    }
    public int count(){
        return famDao.getAllFamilies().size();
    }
    public Family getFamilyById(int x){
        return famDao.getFamilyByIndex(x);
    }
    public List<Pet> getPets(int x){
        List<Pet> pets=new ArrayList<>(famDao.getFamilyByIndex(x).getPet());
        return pets;
    }
    public void addPet(int x,Pet pet){
        famDao.getFamilyByIndex(x).addPet(pet);
        famDao.saveFamily(famDao.getFamilyByIndex(x));

    }
}




