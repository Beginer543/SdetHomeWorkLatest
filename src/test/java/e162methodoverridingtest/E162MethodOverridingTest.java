package e162methodoverridingtest;

import org.example.e162.E162MethodOverriding;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E162MethodOverridingTest {

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
    public void testMethodOverriding() {
        // Execute the main method from E162MethodOverriding class to generate output
        E162MethodOverriding.main(new String[]{});

        // Construct the expected output string
        String expectedOutput =
                "Cat eats" + System.lineSeparator() +
                "Cat sleeps a lot" + System.lineSeparator() +
                "kitten1 eats milk" + System.lineSeparator() +
                "kitten1 sleeps a lot" + System.lineSeparator() +
                "kitten2 eats snacks" + System.lineSeparator() +
                "kitten2 sleeps a lot" + System.lineSeparator() +
                "kitten3 eats everything" + System.lineSeparator() +
                "kitten3 sleeps a lot" + System.lineSeparator() +
                "Cat makes a sound";

        // Assert that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
