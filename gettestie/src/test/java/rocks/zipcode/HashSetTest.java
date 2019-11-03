package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    Set<Person> peopleSet;

    @Test
    public void HashSetAddTest(){

        //given
        ArrayList<Person> peopleList =  new ArrayList<>();
        peopleList.add(new Person("Chung", 1989));
        peopleList.add(new Person("Kendra", 1992));

        //when
        peopleSet = new HashSet<>(peopleList);
        int expected = 2;

        //then
        Assert.assertEquals(expected ,peopleSet.size());
     }

     @Test
    public void HashSetContainsTest(){
         //given
         ArrayList<Person> peopleList =  new ArrayList<>();
         Person expected = new Person("Chung", 1989);
         peopleList.add(expected);
         peopleList.add(new Person("Kendra", 1992));

         //when
         peopleSet = new HashSet<>(peopleList);

         //then
         Assert.assertTrue(peopleSet.contains(expected));

     }

}
