package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class TestLinkedList {
    LinkedList<Integer> linky = new LinkedList<>();
    Integer[] arr = {1,2,3,4,5,6,7,10,3,1,10};

    @Test
    public void testAddAll(){

        linky.addAll(Arrays.asList(arr));
        Integer expected=11;
        Integer actual = linky.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetFirst(){

        linky.addAll(Arrays.asList(arr));
        Integer expected=1;
        Integer actual = linky.getFirst();
        System.out.println(expected + "\n" +actual);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetLast(){

        linky.addAll(Arrays.asList(arr));
        Integer expected=10;
        Integer actual = linky.getLast();
        System.out.println(expected + "\n" +actual);

        Assert.assertEquals(expected,actual);
    }

}
