package e161methodoverridingtest;

import org.example.e161.E161MethodOverriding;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E161MethodOverridingTest {

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
    public void testMethodOverriding() {
        // Execute the main method from E161MethodOverriding class to generate output
        E161MethodOverriding.main(new String[]{});

        // Construct the expected output string
        String expectedOutput = 
                "method in Manager class" + System.lineSeparator() +
                "method in Developer class" + System.lineSeparator() +
                "method in Intern class" + System.lineSeparator() +
                "I am a Developer working" + System.lineSeparator() +
                "I am a Developer taking a break" + System.lineSeparator() +
                "I am a Developer attending a meeting";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
