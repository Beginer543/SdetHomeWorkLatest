package e140accessmodifierstest;

import org.example.e140.E140AccessModifiers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class E140AccessModifiersTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirects System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restores System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testMaxLengthMethodUsingReflection() throws Exception {
        // Create an instance of E140AccessModifiers
        E140AccessModifiers instance = new E140AccessModifiers();

        // Use reflection to access the package-private method 'maxLength'
        Method maxLengthMethod = E140AccessModifiers.class.getDeclaredMethod("maxLength", String[].class);

        // Make the method accessible even if it's package-private
        maxLengthMethod.setAccessible(true);

        // Test case 1: Multiple words with the same maximum length
        String[] words1 = {"this", "is", "a", "long", "word"};
        String expectedOutput1 = "this"; // The first word with the longest length
        String actualOutput1 = (String) maxLengthMethod.invoke(instance, (Object) words1);
        assertEquals("The output from the maxLength method does not match the expected output", expectedOutput1, actualOutput1);

        // Test case 2: Different lengths with a clear longest word
        String[] words2 = {"java", "programming", "is", "fun"};
        String expectedOutput2 = "programming";
        String actualOutput2 = (String) maxLengthMethod.invoke(instance, (Object) words2);
        assertEquals("The output from the maxLength method does not match the expected output", expectedOutput2, actualOutput2);
    }


}
