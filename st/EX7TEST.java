import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EX7TEST {

    @Test
    public void testConvertDays() {
        // Test Case 1: 400 days
        assertEquals("400 days is approximately 1 years, 1 months, and 5 days.", EX7.convertDays(400));

        // Test Case 2: 730 days
        assertEquals("730 days is approximately 2 years, 0 months, and 0 days.", EX7.convertDays(730));

        // Test Case 3: 100 days
        assertEquals("100 days is approximately 0 years, 3 months, and 10 days.", EX7.convertDays(100));
    }
}