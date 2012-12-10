
public class RomanNumerals 
{
	public String toRoman(int number) 
	{
		String RomanValue = "";
		while (number > 9)
		{
			RomanValue = RomanValue + "X";
			number = number - 10;
		}

		if (number > 8)
		{
			RomanValue = RomanValue + "IX";
			number = number - 9;
		}

		if (number > 4)
		{
			RomanValue = RomanValue + "V";
			number = number - 5;
		}

		if (number > 3) 
		{
			RomanValue = RomanValue + "IV";
			number = number - 4;
		}
		
		while (number > 0)
		{
			RomanValue = RomanValue + "I";
			number = number - 1;
		}
		return RomanValue;
	}
}
