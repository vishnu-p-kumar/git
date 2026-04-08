package calc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, c.add(5,5));
    }

    @Test
    void testSubtract() {
        assertEquals(4, c.subtract(9,5));
    }

    @Test
    void testMultiply() {
        assertEquals(20, c.multiply(4,5));
    }

    @Test
    void testDivide() {
        assertEquals(5, c.divide(10,2));
    }

}