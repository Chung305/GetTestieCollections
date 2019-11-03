package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    Vector v = new Vector();

    @Test
    public void addingToVector(){
        //given
        Integer first = 1;
        Person second = new Person("chung", 1989);
        Address third = new Address("610 w 11th st", "New Castle, DE", "19720", "US");

        //when
        v.add(0, first);
        v.add(1,second);
        v.add(2,third);


        //then
        Assert.assertEquals(third, v.get(2));
    }
    @Test
    public void checkCapacity_Contains(){
        //given
        v.add(0, 1);
        v.add(1, new Person("chung", 1989));
        v.add(2, new Address("610 w 11th st", "New Castle, DE", "19720", "US"));
        int expected = 23;
        int expected2 = 3;

        //when
        v.ensureCapacity(expected);

        //then
        Assert.assertEquals(expected, v.capacity());
        Assert.assertEquals(expected2, v.size());

    }
}
