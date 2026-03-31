package junit.parameterized_tests_4;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTestDemo {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    void testIsOdd(int number) {
        assertTrue(number % 2 != 0);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "0, 0, 0",
            "-1, 1, 0"
    })
    void testAdd(int a, int b, int expected) {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.add(a, b));
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithMethodSource(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana");
    }
}
class Calculator{
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int divide(int n1, int n2){
        return n1/n2;
    }
}
