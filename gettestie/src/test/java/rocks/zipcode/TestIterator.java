package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {



    @Test
    public void testNext(){
        List<String> blackPink = new ArrayList<>();
        blackPink.add("Lalisa");
        blackPink.add("rose");
        blackPink.add("jennie");
        blackPink.add("jisoo");

        Iterator<String>iterator =blackPink.iterator();
        System.out.println(iterator);

        Assert.assertEquals("Lalisa", iterator.next());
    }

    @Test
    public void testHasNext(){
        List<String> blackPink = new ArrayList<>();
        blackPink.add("Lalisa");
        blackPink.add("rose");
        blackPink.add("jennie");
        blackPink.add("jisoo");

        Boolean expected = blackPink.contains("Lalisa");
        Iterator<String>iterator =blackPink.iterator();
        System.out.println(iterator);

        Assert.assertEquals(expected, iterator.hasNext());
    }

}
