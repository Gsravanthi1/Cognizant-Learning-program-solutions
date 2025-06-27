import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        // Setup method runs before each test
        System.out.println("Setup: Creating Calculator instance");
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        // Teardown method runs after each test
        System.out.println("Teardown: Cleaning up Calculator instance");
        calc = null;
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        // Arrange
        int a = 4;
        int b = 5;

        // Act
        int result = calc.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }
}
