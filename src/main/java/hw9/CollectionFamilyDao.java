package hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao {
    List<Family> allFam;

    public CollectionFamilyDao() {
        Human Samin = new Human("Samin", "Alakbarov", 1982);
        Human Lala = new Human("Lala", "Alakbarova", 2003);
        Human Mukhtar = new Human("Mukhtar", "Asgerli", 1984);
        Human Loya = new Human("Loya", "Asgerli", 1990);
        Human Ali = new Human("Ali", "Suleymanzada", 1988);
        Human Ayda = new Human("Ayda", "Suleymanzada", 1992);

        Human Eren = new Human("Eren", "Alakbarov", 2012);
        Human Erem = new Human("Erem", "Asgerli", 2010);
        Human Mikasa = new Human("Mikasa", "Alakbarova", 2004);
        Human Aurora = new Human("Aurora", "Suleymanzada", 2013);
        DomesticCat kitten = new DomesticCat("Shine");

        Family family1 = new Family(Lala, Samin);
        family1.addChild(Mikasa);
        family1.addChild(Eren);
        Family family2 = new Family(Loya, Mukhtar);
        family2.addPet(kitten);
        family2.addChild(Erem);
        Family family3 = new Family(Ayda, Ali);
        family3.addChild(Aurora);
        this.allFam = new ArrayList<>();
        allFam.add(family1);
        allFam.add(family2);
        allFam.add(family3);
    }
    @Override
    public List<Family> getAllFamilies(){
        List<Family> allFamilies=allFam;
        return allFamilies;}
    @Override
    public Family getFamilyByIndex(int x) {
        if (x >= 0 && x < allFam.size()) {
            return allFam.get(x);
        } else {
            return null;
        }
    }
    @Override
    public boolean deleteFamily(int x){
        if (x >=0 && x < allFam.size()) {
            allFam.remove(x);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean deleteFamily(Family f){
        boolean flag=false;
        for(int i=0;i<allFam.size();i++){
            if(f.equals(allFam.get(i))){
                flag=true;
                break;
        }}
        if(flag){
            allFam.remove(f);
        }
        return flag;}
    @Override
    public void saveFamily(Family f){
        int x = allFam.indexOf(f);
        if(x >= 0 && x < allFam.size()) {
            allFam.set(x,f);}
        else{
            allFam.add(f);
        }}}






