package e177listtest;

import org.example.e177.E177List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E177ListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the output for testing
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out and System.in after the test
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testChatMessagesAfterRemovals() {
        // Simulate user input for the Scanner
        String simulatedInput = "Hi\nHow are you?\nGreat to see you!\nThanks!\nGoodbye!\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Execute the main method from E177List to simulate the program's behavior
        E177List.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Remaining messages:" + System.lineSeparator() +
                "How are you? Thanks! ";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}
