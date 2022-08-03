package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;

public class TestTreeSet {

    String[] BP = {"Jennie", "rose", "lalisa", "jisoo"};
    TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(BP));

    @Test
    public void testFirst(){
        String expected = "Jennie";
        String actual =treeSet.first();

        Assert.assertEquals(expected,actual);

    }


    @Test
    public void testFloor(){
        String expected = "Jennie";
        String actual =treeSet.floor("ia");
        System.out.println(expected +" "+ actual);

        Assert.assertEquals(expected,actual);

    }
}
