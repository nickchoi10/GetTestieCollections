package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    Vector<String> vector = new Vector<>();

    @Test
    public void testCapacity(){
        Integer actual = vector.capacity();
        Integer expected =10;

        Assert.assertEquals(expected,actual);

    }

}
