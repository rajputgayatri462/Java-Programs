//w . a .p that reads a celsius degree in the double value from the console ,
//the converts it into fahrenheit and display the result the formula for
//conversion is: 
//fahrenheit (9-5) * celsius + 32
//hint : in java 9/5 is 1 but 9.0/5 is 1.8 


import java.util.Scanner;
class Temperature6
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the celsius :" );
		//float con = 9/5 ;
		float con = 9.0f/5;

		float cel =  sc.nextFloat();

		float fah = con * cel + 32;
		System.out.println("The conversion of celsius into fahrenheit is " + fah);
		


	}
}