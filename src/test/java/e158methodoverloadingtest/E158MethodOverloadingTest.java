package e158methodoverloadingtest;

import org.example.e158.E158MethodOverloading;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E158MethodOverloadingTest {

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
        // Execute the main method from E157SuperKeyword class to generate output
        E158MethodOverloading.main(new String[]{});

        // The expected output sequence based on loan payment calculations
        String expectedOutput =
                "875.00" + System.lineSeparator() +
                        "437.50" + System.lineSeparator() +
                        "350.00";

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
