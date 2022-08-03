package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {
    ArrayList<String> arr = new ArrayList<>();

    @Test
    public void addTest() {
        arr.add("jennie");
        arr.add("jisoo");
        arr.add("lalisa");
        arr.add("rose");
        Integer expected = 4;
        Integer actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        arr.add("jennie");
        arr.add("jisoo");
        arr.add("lalisa");
        arr.add("rose");
        arr.remove("lalisa");
        Integer expected = 3;
        Integer actual = arr.size();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getTest() {
        arr.add("jennie");
        arr.add("jisoo");
        arr.add("lalisa");
        arr.add("rose");

        String expected = "lalisa";
        String actual = arr.get(2);
        System.out.println(expected+"\n"+actual);

        Assert.assertEquals(expected, actual);
    }
}
