
public class RomanNumerals 
{
	public String toRoman(int number) 
	{
		if ( (number > 3999) || (number < 1) )
		{
			return "N/A";
		}
		
		String RomanValue = "";
		
		while (number > 999)
		{
			RomanValue = RomanValue + "M";	// Concatenate the letters to the right side
			number = number - 1000;	// Reduce the amount left in number
		}
		
		if (number > 899)
		{
			RomanValue = RomanValue + "CM";	// Concatenate letters to the right side
			number = number - 900;
		}

		if (number > 499)
		{
			RomanValue = RomanValue + "D";
			number = number - 500;
		}
		
		if (number > 399)
		{
			RomanValue = RomanValue + "CD";
			number = number - 400;
		}

		while (number > 99)
		{
			RomanValue = RomanValue + "C";
			number = number - 100;
		}

		if (number > 89) 
		{
			RomanValue = RomanValue + "XC";
			number = number - 90;
		}
		
		if (number > 49)
		{
			RomanValue = RomanValue + "L";
			number = number - 50;
		}

		if (number > 39)
		{
			RomanValue = RomanValue + "XL";
			number = number - 40;
		}
		
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
