import org.junit.Test;
import static org.junit.Assert.*;

public class EX9TEST {

    @Test
    public void testLeapYear() {
        assertTrue(EX9.isLeapYear(2020));  // 2020 is a leap year
        assertTrue(EX9.isLeapYear(2000));  // 2000 is a leap year
        assertFalse(EX9.isLeapYear(1900)); // 1900 is not a leap year
        assertFalse(EX9.isLeapYear(2021)); // 2021 is not a leap year
    }
}