package e157methodoverloadingtest;

import org.example.e157.E157MethodOverloading;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E157MethodOverloadingTest {

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
        // Execute the main method to generate output
        E157MethodOverloading.main(new String[]{});
        // The expected output sequence
        String expectedOutput = "40" + System.lineSeparator() +
                "30" + System.lineSeparator() +
                "20";

        // Asserts that the captured output matches the expected output sequence
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}

