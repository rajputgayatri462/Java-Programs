//w .a.p that displays the area and perimeter of circle that hass
//radius of 5.5 using the formula
//area = pi*r^2 perimeter=2*pi*r

import java.util.Scanner;
class Area2
{
	public static void main(String[] args)
	{

		//Area of Circle 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius (cm): ");
		float r = sc.nextFloat();
		final float pi = 22/7 ;
		
		float area = pi * (r*r);
		System.out.println("Area of circle is :" + area + "cm^2");

	//Perimeter of circle
	//peri = 2 * pi *r
	float perimeter = 2 * pi * r;
	System.out.println("Perimeter of circle is :" + perimeter + "cm^2");

	}
}