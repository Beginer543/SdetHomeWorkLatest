package e172encapsulationtest;

import org.example.e172.E172Encapsulation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E172EncapsulationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the output for testing
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out to its original state after the test
        System.setOut(originalOut);
    }

    @Test
    public void testAccountOutput() {
        // Execute the main method from E172Encapsulation class
        String[] args = {}; 
        E172Encapsulation.main(args);

        // Expected output (including line breaks between details)
        String expectedOutput = "Account Number: 1234567890" + System.lineSeparator() +
                                "Full Name: Sarah Connor" + System.lineSeparator() +
                                "Email: sarah.connor@example.com" + System.lineSeparator() +
                                "Account Balance: 15000.0";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}