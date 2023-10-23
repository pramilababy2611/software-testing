import static org.junit.Assert.*;
import org.junit.Test;

public class EX4TEST {

    @Test
    public void testCalculateSimpleInterest() {
        double principal = 1000;
        double rate = 5;
        double time = 2;

        double expectedInterest = 100.0; // Expected simple interest is 100

        double calculatedInterest = EX4.calculateSimpleInterest(principal, rate, time);

        // Using JUnit's assertEquals for double comparison
        assertEquals(expectedInterest, calculatedInterest, 0.001); // 0.001 is the delta for precision
    }
}