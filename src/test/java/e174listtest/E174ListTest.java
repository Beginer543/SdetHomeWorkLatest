package e174listtest;

import org.example.e174.E174List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E174ListTest {

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
    public void testArrayListElements() {
        // Call the main method to produce the output
        E174List.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "1011" + System.lineSeparator() +
                "1033" + System.lineSeparator() +
                "1055" + System.lineSeparator();
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}