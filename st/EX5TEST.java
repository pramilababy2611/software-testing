import static org.junit.Assert.*;
import org.junit.Test;

public class EX5TEST {

    @Test
    public void testIsPalindrome() {
        assertTrue(EX5.isPalindrome("racecar"));
        assertTrue(EX5.isPalindrome("Able was I ere I saw Elba"));
        assertFalse(EX5.isPalindrome("Madam In Eden, I'm Adam"));
        assertFalse(EX5.isPalindrome("hello"));
        assertFalse(EX5.isPalindrome("world"));
        assertTrue(EX5.isPalindrome("12321"));
    }
}