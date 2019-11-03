package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    LinkedList<Person> peopleLinked = new LinkedList<>();

    @Test
    public void addTest(){
        //given
        Person chung = new Person("Chung", 1989);
        Person kendra = new Person("Kendra", 1992);
        Person expected = chung;
        Integer expected2 = 2;

        //when
        peopleLinked.add(chung);
        peopleLinked.add(kendra);

        //then
        Assert.assertTrue(peopleLinked.contains(expected));
        Assert.assertEquals((int)(expected2), peopleLinked.size());

    }

    @Test
    public void getFirstAndLastTest(){
        //given
        Person last = new Person("Chung", 1989);
        Person first = new Person("Kendra", 1992);


        //when
        peopleLinked.add(first);
        peopleLinked.add(last);

        //then
        Assert.assertEquals(first, peopleLinked.getFirst());
        Assert.assertEquals(last, peopleLinked.getLast());
    }
}
