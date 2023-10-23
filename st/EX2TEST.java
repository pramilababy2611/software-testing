import org.junit.Test;
import static org.junit.Assert.*;

public class EX2test {

    @Test
    public void testCompareStringsEqual() {
        StringUtil util = new StringUtil();
        String str1 = "Hello";
        String str2 = "Hello";
        boolean result = util.compareStrings(str1, str2);
        assertTrue(result);
    }

    @Test
    public void testCompareStringsNotEqual() {
        StringUtil util = new StringUtil();
        String str1 = "Hello";
        String str2 = "World";
        boolean result = util.compareStrings(str1, str2);
        assertFalse(result);
    }

    @Test
    public void testCompareStringsNullInput() {
        StringUtil util = new StringUtil();
        String str1 = null;
        String str2 = "World";
        boolean result = util.compareStrings(str1, str2);
        assertFalse(result);
    }
}
