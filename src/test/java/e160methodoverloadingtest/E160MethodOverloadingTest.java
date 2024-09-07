package e160methodoverloadingtest;

import org.example.e160.E160MethodOverloading;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E160MethodOverloadingTest {

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
    public void testMainMethodOutput() {
        // Execute the main method from E160MethodOverloading class to generate output
        E160MethodOverloading.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "private displayInfo method" + System.lineSeparator() +
                "private displayInfo method with balance: 5000" + System.lineSeparator() +
                "static method without parameter" + System.lineSeparator() +
                "static method with int parameter: 20";

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
