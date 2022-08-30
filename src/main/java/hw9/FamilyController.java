package hw9;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FamilyController {
    FamilyService famSer=new FamilyService();
    public List<Family> getAllFamilies() {
        return famSer.getAllFamilies();
    }
    public void displayAllFamilies(List<Family> af) {
        famSer.displayAllFamilies(af);
    }
    public List<Family> getFamiliesBiggerThan(int x) {
        return famSer.getFamiliesBiggerThan(x);
    }
    public List<Family> getFamiliesLessThan(int x) {
        return famSer.getFamiliesLessThan(x);
    }
    public int countFamiliesWithMemberNumber(int x) {
        return famSer.countFamiliesWithMemberNumber(x);
    }
    public void createNewFamily(Human mother,Human father){
        famSer.createNewFamily(mother,father);
    }
    public void deleteFamilyByIndex(int x){
        famSer.deleteFamilyByIndex(x);
    }
    public Family bornChild(Family fam,GenderOfPerson gen){
        return famSer.bornChild(fam,gen);
    }
    public void deleteAllChildrenOlderThen(int x){
        famSer.deleteAllChildrenOlderThen(x);
    }
    public int count(){
        return famSer.count();
    }
    public Family getFamilyById(int x){
        return famSer.getFamilyById(x);
    }
    public List<Pet> getPets(int x){
        return famSer.getPets(x);
    }
    public void addPet(int x,Pet pet){
        famSer.addPet(x,pet);
    }
}
