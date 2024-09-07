package e155superkeywordtest;

import org.example.e155.E155SuperKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E155SuperKeywordTest {

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
    public void testClassConstructorOutputs() {
        // Execute the main method from E155SuperKeyword class to generate output
        E155SuperKeyword.main(new String[]{});

        // The expected output sequence based on the Company-Department-Employee constructor calls
        String expectedOutput =
                "Company Established" + System.lineSeparator() +
                        "Department Created" + System.lineSeparator() +
                        "Employee Hired";

        // Asserts that the captured output matches the expected output sequence
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
