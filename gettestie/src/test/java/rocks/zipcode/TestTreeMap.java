package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    TreeMap<Integer, Integer> tree = new TreeMap<>();
    Integer[] keys = {1,10,23,11,13};

    @Test

    public void testCeilingEntry(){
        for(Integer key : keys){
            tree.put(key,key*key);
        }
        String actual = tree.ceilingEntry(15).toString(); //returns the next key thats greater than or equal to the given key
        String expected = "23=529";

        System.out.println(actual + " "+expected);

        Assert.assertEquals(expected,actual);
    }

    @Test

    public void testCeilingKey(){
        for(Integer key : keys){
            tree.put(key,key*key);
        }
        String actual = tree.ceilingKey(2).toString(); //returns the next key greater than or equal too the given key
        String expected = "10";

        System.out.println(actual + " "+expected);

        Assert.assertEquals(expected,actual);
    }
}
