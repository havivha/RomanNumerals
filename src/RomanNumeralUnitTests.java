import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests 
{
	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() 
	{
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		
		assertEquals("IV", number.toRoman(4));
		assertEquals("VIII", number.toRoman(8));
		
		assertEquals("XXX", number.toRoman(30));
		assertEquals("XLIX", number.toRoman(49));
		
		assertEquals("LX", number.toRoman(60));
		assertEquals("LXXXVII", number.toRoman(87));
	}
}
