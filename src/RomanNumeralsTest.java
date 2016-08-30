import static org.junit.Assert.*;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void test() {
		RomanNumerals rm = new RomanNumerals();
		assertEquals("I", rm.convertArabicToRoman(1));
	}

}
