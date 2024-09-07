package e163finalkeywordtest;


import org.example.e163.E163FinalKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E163FinalKeywordDemoTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testFinalMethodsOutput() {
        // Execute the main method from E163FinalKeywordDemo class to generate output
        E163FinalKeyword.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "olleh" + System.lineSeparator() +
                "4.8";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
