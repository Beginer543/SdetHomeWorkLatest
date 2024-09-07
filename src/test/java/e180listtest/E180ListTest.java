package e180listtest;

import org.example.e180.E180List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E180ListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the output for testing
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testEmployeeAgesOutput() {
        // Execute the main method from E188EmployeeAges
        E180List.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Remaining ages: [30, 35, 40, 45, 50, 55, 60]" + System.lineSeparator() +
                "Average age: 45.0";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}
