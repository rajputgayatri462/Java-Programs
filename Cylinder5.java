//W . a. p. that reads in the radius and length of cylinder and 
//computes the area & volume using the following formulas : 
//area = 3.14 * radius *radius , volume =area * height 

import java.util.Scanner;
class Cylinder5
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius :");
		float r = sc.nextFloat();
		final float pi = 22/7 ;

		System.out.println("Enter the height :");
		float hgt = sc.nextFloat();

		float area = pi * (r * r);
		System.out.println("Area of cylinder is :" + area + "cm^2");

		float volume = area * hgt ;
		System.out.println("Volume of cylinder is :" + volume + "cm^2");
	}
}