package e164abstractclasstest;

import org.example.e164.E164AbstractClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E164AbstractClassTest {

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
    public void testAbstractAndOverloadedMethods() {
        // Execute the main method from E164AbstractClass class to generate output
        E164AbstractClass.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "Car engine started" + System.lineSeparator() +
                "Car engine started with a smart key" + System.lineSeparator() +
                "Vehicle engine stopped";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
