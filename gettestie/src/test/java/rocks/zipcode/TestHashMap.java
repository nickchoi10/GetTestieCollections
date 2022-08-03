package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestHashMap {

    Map<String, Integer> hash = new HashMap<>();
    @Test
    public void testPut(){
    hash.put("jett", 100);
    hash.put("sage", 90);
    hash.put("omen", 60);

    Integer expected=20;
    hash.put("astra", expected);
    Integer actual = hash.get("astra");

    Assert.assertEquals(expected,actual);

    }

    @Test
    public void testContains(){
        hash.put("jett", 100);
        hash.put("sage", 90);
        hash.put("omen", 60);

        Assert.assertTrue(hash.containsKey("sage"));

    }

}
