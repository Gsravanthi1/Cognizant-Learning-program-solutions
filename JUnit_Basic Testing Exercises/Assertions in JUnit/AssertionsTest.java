import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    DemoAssertions demo = new DemoAssertions();

    @Test
    public void testAssertions() {

        // Assert equals
        assertEquals(5, demo.add(2, 3));

        // Assert true
        assertTrue(demo.isGreater(5, 3));

        // Assert false
        assertFalse(demo.isLess(5, 3));

        // Assert null
        assertNull(demo.getNullObject());

        // Assert not null
        assertNotNull(demo.getNonNullObject());
    }
}
