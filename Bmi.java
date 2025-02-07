
import java.util.Scanner;
class Bmi
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