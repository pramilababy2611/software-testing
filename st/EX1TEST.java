import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EX1Test{

    @Test
    public void testReverseString() {
        String reversedStr = EX1.reverseString("Hello");
        assertEquals("olleH", reversedStr);
    }
}