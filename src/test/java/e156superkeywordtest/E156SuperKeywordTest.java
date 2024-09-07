package e156superkeywordtest;

import org.example.e156.E156SuperKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E156SuperKeywordTest {

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
    public void testDisplayMethodOutput() {
        // Execute the main method from E156SuperKeyword class to generate output
        E156SuperKeyword.main(new String[]{});

        // The expected output sequence, showing the sound's value from both class Dog and class Animal
        String expectedOutput = "Bark" + System.lineSeparator() +
                "Some generic animal sound";

        // Asserts that the captured output matches the expected output sequence
        assertEquals("The output from the display method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
