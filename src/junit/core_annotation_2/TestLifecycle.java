package junit.core_annotation_2;

import org.junit.jupiter.api.*;

class TestLifecycle {

    @BeforeAll
    static void setupAll() {
        System.out.println("Runs once before all tests");
    }

    @BeforeEach
    void setup() {
        System.out.println("Runs before each test");
    }

    @Test
    @DisplayName("Custom test name")
    void testOne() {
        System.out.println("Test 1");
    }

    @Test
    void testTwo() {
        System.out.println("Test 2");
    }

    @Test
    @Disabled("Reason for disabling")
    void testThree() {
        System.out.println("Test 3");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Runs after each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Runs once after all tests");
    }
}
