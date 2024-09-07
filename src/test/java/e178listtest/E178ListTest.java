package e186grocerylisttest;

import org.example.e178.E178List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E178ListTest {

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
    public void testUniqueGroceryItemsOutput() {
        // Simulate user input for the grocery list
        String simulatedInput = "milk\nbread\neggs\nmilk\ncheese\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Execute the main method from E186GroceryList
        E178List.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Enter 5 grocery items:" + System.lineSeparator() +
                "Unique grocery items:" + System.lineSeparator() +
                "milk bread eggs cheese ";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}
