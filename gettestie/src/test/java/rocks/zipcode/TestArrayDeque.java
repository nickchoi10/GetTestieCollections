package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {

    @Test
    public void peekTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String expected = "jennie";

        // When
        arrayDeque.add("jennie"); //head
        arrayDeque.add("lalisa");
        arrayDeque.add("rose");
        arrayDeque.add("jisoo");
        String actual = arrayDeque.peek(); // opposite of stack, returns head
        System.out.println(actual + "\n" +expected);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pollTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String expectedString = "jennie";
        Integer expectedSize = 3;

        // When
        arrayDeque.add("jennie"); //head
        arrayDeque.add("lalisa");
        arrayDeque.add("rose");
        arrayDeque.add("jisoo");
        String actualString = arrayDeque.poll(); // opposite of stack, returns head
        Integer actualSize = arrayDeque.size();

        System.out.println(expectedSize +" "+ actualSize);
        System.out.println(expectedString +" "+ actualString);

        // Then
        Assert.assertEquals(expectedString, actualString);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void popTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String expected = "lalisa";

        // When
        arrayDeque.add("jennie"); //head
        arrayDeque.add("lalisa");
        arrayDeque.add("rose");
        arrayDeque.add("jisoo");
        arrayDeque.pop(); //pops off the head
        String actual = arrayDeque.peek(); //peeks at the head

        System.out.println(expected + actual);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
