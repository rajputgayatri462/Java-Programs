
import java.util.Scanner;
class BodyMass15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the weight in pounds: ");
		float pound = sc.nextFloat();
		float kilo = pound * 0.45359237f;

		System.out.println("Enter your height in inches :");
		float inches = sc.nextFloat();
		float meters = inches * 0.0254f;

		//System.out.println("pounds into kilogram: " + kilo);
		//System.out.println("pounds into kilogram: " + meters);

		float bmi = kilo / (meters * meters);
		System.out.println("BMI is : " + bmi);

	
	} 
}