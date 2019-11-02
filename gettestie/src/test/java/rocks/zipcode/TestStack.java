package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2(){
        //Given
        Stack<Person> people = new Stack<>();
        Person kendra = new Person("Kendra", 1992);

        //When
        people.push(new Person("Chung", 1989));
        people.push(kendra);


        //Then
        Assert.assertEquals(kendra, people.peek());
    }



    // Make a bigger test exercising more Stack methods.....
}
