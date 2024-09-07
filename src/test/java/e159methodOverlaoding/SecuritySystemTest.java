package e159methodOverlaoding;


import org.example.e159.SecuritySystem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class SecuritySystemTest {

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
    public void testPrivateAuthenticateMethodWithoutParameters() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // Create an instance of the SecuritySystem class
        SecuritySystem securitySystem = new SecuritySystem();

        // Use reflection to access the private method authenticate()
        Method authenticateMethod = SecuritySystem.class.getDeclaredMethod("authenticate");
        authenticateMethod.setAccessible(true); // Allow access to the private method

        // Invoke the private method
        authenticateMethod.invoke(securitySystem);

        // Assert that the output matches the expected result
        String expectedOutput = "Authenticating with password";
        assertEquals("The output from the authenticate method (without parameters) does not match the expected output.",
                expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testPrivateAuthenticateMethodWithParameters() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // Create an instance of the SecuritySystem class
        SecuritySystem securitySystem = new SecuritySystem();

        // Use reflection to access the private method authenticate(int otp)
        Method authenticateMethodWithInt = SecuritySystem.class.getDeclaredMethod("authenticate", int.class);
        authenticateMethodWithInt.setAccessible(true); // Allow access to the private method

        // Invoke the private method with an OTP value
        authenticateMethodWithInt.invoke(securitySystem, 123456);

        // Assert that the output matches the expected result
        String expectedOutput = "Authenticating with OTP: 123456";
        assertEquals("The output from the authenticate method (with int parameter) does not match the expected output.",
                expectedOutput, outContent.toString().trim());
    }
}
