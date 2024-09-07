package e154superkeywordtest;

import org.example.e154.E154SuperKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E154SuperKeywordTest {

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
    public void testConstructorOutputs() {
        // Execute the main method from E154SuperKeyword class to generate output
        E154SuperKeyword.main(new String[]{});

        // Construct the expected output sequence based on the exercise scenario
        String expectedOutput =
                "Appliance Constructor without argument" + System.lineSeparator() +
                        "WashingMachine Constructor without argument" + System.lineSeparator() +
                        "Wattage: 500" + System.lineSeparator() +
                        "Capacity: 7";

        // Assert that the captured output matches the expected output sequence
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
