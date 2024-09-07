package e170encapsulationtest;


import org.example.e170.E170Encapsulation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E170EncapsulationTest {

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
    public void testCustomerEncapsulation() {
        // Execute the main method from StoreManagement class to generate output
        E170Encapsulation.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "Customer Name: Mario" + System.lineSeparator() +
                "Customer Age: 32";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
