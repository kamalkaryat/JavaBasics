package junit.assertions_3;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testAssertions() {
        // Equality checks
        assertEquals(4, 2 + 2);
        assertNotEquals(3, 1 + 1);

        // Boolean conditions
        assertTrue(5 > 3);
        assertFalse(5 < 3);

        // Null checks
        String str = null;
        assertNull(str);
        assertNotNull("Hello");

        // Array equality
        assertArrayEquals(new int[]{1, 2}, new int[]{1, 2});

        // Exceptions
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> { int x = 10 / 0; }
        );

        // Timeouts
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
        });

        // Combined assertions
        assertAll(
                () -> assertEquals(4, 2 + 2),
                () -> assertTrue(5 > 3),
                () -> assertNull(null)
        );
    }
}

