package e167interfacetest;

import org.example.e167.E167MultipleInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E167MultipleInterfaceTest {

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
    public void testMultipleInterfaceInheritance() {
        // Execute the main method from E167MultipleInterface class to generate output
        E167MultipleInterface.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "Basic Functionality: Device is turning on" + System.lineSeparator() +
                "Advanced Functionality: Device is adjusting settings";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
