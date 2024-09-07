package e139accessmodifierstest;

import org.example.e139.E139AccessModifiers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class E139AccessModifiersTest {

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
    public void testReplaceSpacesWithUnderscoresUsingReflection() throws Exception {
        // Test case for the replaceSpaces method using reflection
        E139AccessModifiers instance = new E139AccessModifiers();
        Method replaceSpacesMethod = E139AccessModifiers.class.getDeclaredMethod("replaceSpaces", String.class);

        // Make the method accessible even if it's private, protected, or default
        replaceSpacesMethod.setAccessible(true);

        // Test input and expected output
        String input1 = "hello world";
        String input2 = "java is fun";
        String input3 = "i love coding";

        assertEquals("hello_world", replaceSpacesMethod.invoke(instance, input1));
        assertEquals("java_is_fun", replaceSpacesMethod.invoke(instance, input2));
        assertEquals("i_love_coding", replaceSpacesMethod.invoke(instance, input3));
    }


}
