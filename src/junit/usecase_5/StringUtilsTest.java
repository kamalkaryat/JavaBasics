package junit.usecase_5;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    @DisplayName("isPalindrome should return true for palindromes")
    void testIsPalindrome() {
        assertAll(
                () -> assertTrue(StringUtils.isPalindrome("madam")),
                () -> assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama")),
                () -> assertFalse(StringUtils.isPalindrome("hello")),
                () -> assertFalse(StringUtils.isPalindrome(null))
        );
    }

    @ParameterizedTest
    @CsvSource({
            "'Hello World', 5, 'Hello...'",
            "'Short', 10, 'Short'",
            "'', 3, ''",
            "NULL, 5, NULL",
    })
    void testTruncate(String input, int maxLength, String expected) {
        assertEquals(expected, StringUtils.truncate(input, maxLength));
    }

    @Test
    void testTruncateWithNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.truncate("test", -1);
        });
    }
}
