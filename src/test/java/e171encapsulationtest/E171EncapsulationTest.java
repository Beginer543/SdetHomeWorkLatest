package e171encapsulationtest;

import org.example.e171.E171Encapsulation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E171EncapsulationTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the console output
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testMainMethodOutput() {
        // Execute the main method
        E171Encapsulation.main(new String[]{});

        // Construct the expected output using System.lineSeparator()
        String expectedOutput = "Employee Name: John" + System.lineSeparator() +
                                "Employee Age: 30";

        // Check the output by comparing the expected and actual results
        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}