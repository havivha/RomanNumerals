
public class RomanNumerals 
{
	public String toRoman(int number) 
	{
		String RomanValue = "";
		while (number > 0)
		{
			RomanValue = RomanValue + "I";
			number = number - 1;
		}
		
	}
}
