import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EX4TEST {
    @Test
    public void testCalculateSimpleInterestForRegularCustomer() {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        double principal = 1000;
        String customerType = "regular";
        double time = 2;
        double expectedInterest = 200.0;
        double actualInterest = calculator.calculateSimpleInterest(principal, customerType, time);
        assertEquals(expectedInterest, actualInterest, 0.001);
    }

    @Test
    public void testCalculateSimpleInterestForSeniorCitizen() {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        double principal = 1000;
        String customerType = "senior_citizen";
        double time = 2;
        double expectedInterest = 240.0;
        double actualInterest = calculator.calculateSimpleInterest(principal, customerType, time);
        assertEquals(expectedInterest, actualInterest, 0.001);
    }
}
