package e168interfacetest;

import org.example.e167.E167MultipleInterface;
import org.example.e168.E168MultipleInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E168MultipleInterfaceTest {

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
    public void testMultipleInterfaceInheritanceInBankAccount() {
        // Execute the main method from E167MultipleInterface class to generate output
        E168MultipleInterface.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "Transaction successful: Deposited 100.0" + System.lineSeparator() +
                "Transaction successful: Withdrew 50.0" + System.lineSeparator() +
                "Current Balance: 50.0" + System.lineSeparator() +
                "Transaction failed: Insufficient funds";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
