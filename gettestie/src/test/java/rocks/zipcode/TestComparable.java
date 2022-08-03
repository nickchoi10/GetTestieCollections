package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable {


    @Test
    public void testCompareToGreater(){
        Integer a=1;
        Integer b=10;

        Integer expected = 1; //1 means its greater than
        Integer actual = b.compareTo(1);

        System.out.println(actual);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCompareToLesser(){
        Integer a=1;
        Integer b=10;

        Integer expected = -1; //-1 means it is less than
        Integer actual = a.compareTo(b); // a is less than b, so itll return -1

        System.out.println(actual);

        Assert.assertEquals(expected,actual);
    }
}
