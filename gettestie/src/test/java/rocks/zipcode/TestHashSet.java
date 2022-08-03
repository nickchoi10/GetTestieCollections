package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TestHashSet {
    HashSet hashSet= new HashSet();

    @Test
    public void testAdd(){
        hashSet.add(1);
        hashSet.add(10);

        Integer expected=2;
        Integer actual =hashSet.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDuplicates(){
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);

        Integer expected=1;
        Integer actual =hashSet.size();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testClone() {
        // Given
        Integer[] number = {1,2,3,4,5,1,2,3,5,3,6,7,2,12,53};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(number));

        // When
        HashSet<Integer> numClone = (HashSet<Integer>) hashSet.clone();
        String expected = hashSet.toString();
        String actual = numClone.toString();
        System.out.println(expected + "\n" + actual); // order will differ due to hash

        // Then
        Assert.assertNotEquals(expected, actual);
    }


}
