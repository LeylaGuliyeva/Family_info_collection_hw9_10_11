package hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao {
    List<Family> allFam=new ArrayList<>();

    public CollectionFamilyDao(){
        Human Samin=new Human("Samin","Alakbarov",1982);
        Human Lala=new Human("Lala","Alakbarova",2003) ;
        Human Mukhtar=new Human("Mukhtar","Asgerli",1984);
        Human Loya=new Human("Loya","Asgerli",1990);
        Human Ali=new Human("Ali","Suleymanzada",1988);
        Human Ayda=new Human("Ayda","Suleymanzada",1992);

        Human Eren=new Human("Eren","Alakbarov",2029);
        Human Erem=new Human("Erem","Asgerli",2028);
        Human Milan=new Human("Milan","Muradov",2014);
        Human Mikasa=new Human("Mikasa","Alakbarova",2004);
        Human Aurora=new Human("Aurora","Suleymanzada",2013);

        DomesticCat cat=new DomesticCat("Kandela",2,99, Arrays.stream(new String[]{"Eating","Sleeping","Creating a mess"}).collect(Collectors.toSet()));
        cat.eat();
        cat.respond();
        cat.foul();
        Dog maxie = new Dog("Max");
        maxie.eat();
        maxie.foul();
        maxie.respond();
        System.out.println(maxie);

        String sl[][]={{DayOfWeek.MONDAY.name(),DayOfWeek.TUESDAY.name(),DayOfWeek.WEDNESDAY.name(),DayOfWeek.THURSDAY.name(),DayOfWeek.FRIDAY.name(),DayOfWeek.SATURDAY.name(),DayOfWeek.SUNDAY.name()},{"Playing piano","Doing math","Yoga","Reading book","Watching AOT"}};
        byte iq=100;

        Family family1=new Family(Lala,Samin);
        family1.addChild(Mikasa);
        family1.addChild(Eren);
        Family family2=new Family(Loya,Mukhtar);
        family2.addChild(Erem);
        Family family3=new Family(Ayda,Ali);
        family1.addChild(Aurora);
        List<Family> a=Arrays.asList(family1,family2,family3);}


    @Override
    public List<Family> getAllFamilies(){
        List<Family> allFamilies=allFam;
        return allFamilies;}
    @Override
    public Family getFamilyByIndex(int x) {
        if (x > 0 && x < allFam.size()) {
            return allFam.get(x);
        } else {
            return null;
        }
    }
    @Override
    public boolean deleteFamily(int x){
        if (x > 0 && x < allFam.size()) {
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
        if(x > 0 && x < allFam.size()) {
            allFam.set(x,f);}
        else{
            allFam.add(f);
        }}}






