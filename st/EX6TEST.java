import static org.junit.Assert.*;
import org.junit.Test;

public class EX6TEST{

    @Test
    public void testConvertToBinary() {
         EX6 converter = new EX6();

        assertEquals("101", converter.convertToBinary(5));
        assertEquals("1101", converter.convertToBinary(13));
        assertEquals("10110110", converter.convertToBinary(182));
    }

    @Test
    public void testConvertToOctal() {
	EX6 converter = new EX6();

        
        assertEquals("5", converter.convertToOctal(5));
        assertEquals("15", converter.convertToOctal(13));
        assertEquals("266", converter.convertToOctal(182));
    }
}