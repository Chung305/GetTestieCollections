package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void ArrayListAddTest1(){
        //given
        ArrayList<Person> people = new ArrayList<>();


        //when
        people.add(new Person("Chung", 1989));
        int expected = 1;

        //then
        Assert.assertEquals(expected, people.size());

    }
}
