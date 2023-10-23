import static org.junit.Assert.*;
import org.junit.Test;

public class EX8TEST {

    @Test
    public void testCalculateFactorial() {
        EX8 calculator = new EX8();

        assertEquals(1, calculator.calculateFactorial(0)); // 0! = 1
        assertEquals(1, calculator.calculateFactorial(1)); // 1! = 1
        assertEquals(2, calculator.calculateFactorial(2)); // 2! = 2
        assertEquals(6, calculator.calculateFactorial(3)); // 3! = 6
        assertEquals(24, calculator.calculateFactorial(4)); // 4! = 24
        assertEquals(120, calculator.calculateFactorial(5)); // 5! = 120
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorialNegativeInput() {
        EX8 calculator = new EX8();
        calculator.calculateFactorial(-1);
    }
}