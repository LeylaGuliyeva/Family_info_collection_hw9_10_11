package hw9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class FamilyTest {
    @Test
    public void addChildTest(){
        List<Human> x = new ArrayList<>();
        Human Dion=new Human("Dion","Bellamy",1994);
        Human Esperanza=new Human("Esperanza","Bellamy",1996);
        Human Aurora=new Human("Aurora","Bellamy",2020);
        Human Esmeralda=new Human("Esmeralda","Bellamy",2019);
        Human Omar=new Human("Omar","Bellamy",2017);
        x.add(Aurora);
        x.add(Esperanza);
        x.add(Omar);
        Family bestFamily=new Family(Esperanza,Dion);
        Human Amal=new Human("Amal","Bellamy",2022);
        bestFamily.setChildren(x);
        List<Human> x1 = new ArrayList<>(x);
        bestFamily.addChild(Amal);
        x1.add(Amal);
        assertTrue(x1.equals(bestFamily.getChildren()));
    }
    @Test
    public void toStringTest(){
        Human Dion=new Human("Dion","Bellamy",1994);
        Human Esperanza=new Human("Esperanza","Bellamy",1996);
        Human Aurora=new Human("Aurora","Bellamy",2020);
        Family bestFamily=new Family(Esperanza,Dion);
        bestFamily.addChild(Aurora);
        assertTrue(bestFamily.toString().equals("Family{mother=Human{name='Esperanza', surname='Bellamy', year=1996, iq=null, schedule=null}, father=Human{name='Dion', surname='Bellamy', year=1994, iq=null, schedule=null}, children=[Human{name='Aurora', surname='Bellamy', year=2020, iq=null, schedule=null}], pet=null}"));
    }}
