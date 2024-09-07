package e175listtest;

import org.example.e175.E175List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E175ListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testArrayListPrinting() {
        // Call the main method to produce the output
        E175List.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "111" + System.lineSeparator() +
                "111" + System.lineSeparator() +
                "111" + System.lineSeparator() +
                "999" + System.lineSeparator() +
                "999" + System.lineSeparator() +
                "999" + System.lineSeparator();
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}