package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    @Test

    public void testAdd() {
        PriorityQueue<String> blackPink = new PriorityQueue<>();
        blackPink.add("Lalisa");
        blackPink.add("rose");
        blackPink.add("jennie");
        blackPink.add("jisoo");
        Integer expected = 4;
        Integer actual = blackPink.size();

        Assert.assertEquals(expected,actual);

    }

    @Test

    public void testPeek() {
        PriorityQueue<String> blackPink = new PriorityQueue<>();
        blackPink.add("Lalisa");
        blackPink.add("rose");
        blackPink.add("jennie");
        blackPink.add("jisoo");
        String expected = "Lalisa";
        String actual = blackPink.peek();
        Assert.assertEquals(expected,actual);

    }


}
