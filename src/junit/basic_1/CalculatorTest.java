package junit.basic_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void addTest(){
        Calculator calculator= new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void divideTestPositive(){
        Calculator calculator= new Calculator();
        assertNotEquals(2, calculator.divide(10, 5));
    }

    @Test
    void divideTestNegative(){
        Calculator calculator= new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}

class Calculator{
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int divide(int n1, int n2){
        if(n2==0)
            throw new ArithmeticException();
        return n1/n2;
    }
}
