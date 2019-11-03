package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    Deque<String> stack = new ArrayDeque<>();

    @Test
    public void whenPush_addsAtFirst(){
        //given
        String last = "first";
        String second = "second";
        String expected = "third";

        //when

        stack.push(last);
        stack.push(second);
        stack.push(expected);

        //then --> last push will be the first in the Deque
        Assert.assertEquals(expected, stack.getFirst());
        //first push will be the last in the Deque
        Assert.assertEquals(last, stack.getLast());
    }

    @Test
    public void whenPop_removesLast(){
        //given
        String first_push = "first";
        String second_push = "second";
        String last_push = "third";

        //when
        stack.push(first_push);
        stack.push(second_push);
        stack.push(last_push);

        //then --> last push will be pop()
        Assert.assertEquals(last_push, stack.pop());

    }
}
