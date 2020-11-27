package currencyToText;

import java.util.*;
import java.io.*;
public class currencyToText
{
	private static final String EMPTY = "";
	
	private static final String[] X ={ EMPTY, "One", "Two", "Three", "Four", "Five", "Six",
	"Seven ", "Eight ", "Nine", "Ten", "Eleven","Twelve",
	"Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ",
	"Seventeen", "Eighteen ", "Nineteen "};

	
	private static final String[] Y = {EMPTY, EMPTY, "Twenty ", "Thirty ", "Forty ", "Fifty ",
	"Sixty ", "Seventy ", "Eighty ", "Ninety " };

	private static String numberToDigit(int a, String suffix)
	{
		if (a == 0)
			return EMPTY;

		if (a > 19)
			return Y[a / 10] + X[a % 10] + suffix;

		else
			return X[a] + suffix;
	}

	public static String convert(int a, int fractional)
	{
		if(a == 0 & fractional == 0 ) 
			return("Rs. Zero Only");

		else if( a < 0 ) 
			return("Negative Numbers not allowed");

		

		else if ( a > 999999.99 )
			return(" Reached Max Value");


		StringBuilder res = new StringBuilder();
		res.append(numberToDigit(((a / 100000) % 100), " Lakh, "));
		res.append(numberToDigit(((a / 1000) % 100), " Thousand "));
		res.append(numberToDigit(((a / 100) % 10), " Hundred "));

		if ((a > 100) && (a % 100 != 0))
		{
			res.append("and ");
		}

		res.append(numberToDigit((a % 100), ""));
		String word = res.toString();

		String temp;
			if (fractional == 0)
				
				temp = (" Rs.  " + word + " Only" ) ;

			else
				temp = (" Rs." + word  + " " + fractional + "/100" + " only");

			return temp;
	}

		public static void main(String[] args)
		{
			Double doubleValue; 
			int a; 
			System.out.println("\nEnter a number : ");
			Scanner sc = new Scanner(System.in);
			doubleValue = sc.nextDouble();

			

			String numberStr = Double.toString(doubleValue);
			String fractionalStr = numberStr.substring(numberStr.indexOf('.')+1);
			int fractional = Integer.valueOf(fractionalStr);
			a = (int)Math.round(doubleValue);

			

			if (fractional <= 9)
				fractional = fractional * 10;

			if (fractional >= 50)
				a = a - 1;

			String temp = convert(a,fractional);
			System.out.println(temp);

		}
}


