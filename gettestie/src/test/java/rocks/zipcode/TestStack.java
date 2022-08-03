package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void pushTest() {
        // Given
        Stack<Person> stack = new Stack<>();
        Person person = new Person("Lalisa", 1997);
        Integer expected = 1;

        // When
        stack.push(person);
        Integer actual = stack.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peekCheckValueTest() {
        // Given
        Stack<String> stack = new Stack<>();
        String orange = "orange";
        String cherry = "cherry";

        // When
        stack.push(orange);
        stack.push(cherry); //this is the top of the stack...
        String actual = stack.peek();

        // Then
        Assert.assertEquals(cherry, actual);
    }

    @Test
    public void peekCheckSizeTest() {
        // Given
        Stack<String> stack = new Stack<>();
        String orange = "orange";
        String cherry = "cherry";
        Integer expected = 2;

        // When
        stack.push(orange);
        stack.push(cherry);
        stack.peek();
        Integer actual = stack.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void popCheckValueTest() {
        // Given
        Stack<String> stack = new Stack<>();
        String apple = "apple";
        String orange = "orange";
        String cherry = "cherry";

        // When
        stack.push(orange);
        stack.push(cherry);
        stack.push(apple);
        String actual = stack.pop(); //pop removes it

        // Then
        Assert.assertEquals(apple, actual);
    }

    @Test
    public void popCheckSizeTest() {
        // Given
        Stack<String> stack = new Stack<>();
        String apple = "apple";
        String orange = "orange";
        String cherry = "cherry";
        Integer expected = 1;

        // When
        stack.push(orange);
        stack.push(cherry);
        stack.push(apple);
        stack.pop();
        stack.pop();
        Integer actual = stack.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrueTest() {
        // Given
        Stack<Integer> stack = new Stack<>();
        Boolean expected = true;

        // When
        Boolean actual = stack.empty();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyFalseTest() {
        // Given
        Stack<Integer> stack = new Stack<>();
        Integer one = 1;
        Integer ten = 10;
        Boolean expected = false;

        // When
        stack.push(one);
        stack.push(ten);
        Boolean actual = stack.empty();

        // Then
        Assert.assertEquals(expected, actual);
    }











}
