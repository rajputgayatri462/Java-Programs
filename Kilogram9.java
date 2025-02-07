//w.a.p that converts pounds into kilograms. the program prompts the user to enter a no in pounds
// converts it to kilogram and displays the result one pound is 0.454 kilogram


import java.util.Scanner;
class Kilogram9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pounds: ");
		float pound = sc.nextFloat();
		float kilo = pound * 0.454f;
		System.out.println("pounds into kilogram: " + kilo);

	
	} 
}