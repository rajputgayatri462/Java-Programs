//w .a.p that displays tha area and perimeter of rectangle width
//of 4.5 and height of 7.9 using the formula :
//area = l * w perimeter = 2 *(l+w)

class  Rectangle3
{
	public static void main(String[] args) 
	{
		//Area:l*w
		float l = 4.5f;
		float w = 7.9f;
		float area = l * w;
		System.out.println("Area Of Rectangle " + area + "cm^2");

		//Perimeter:2(l+w))
	
		float peri = 2 * (l+w);
		System.out.println("Perimeter Of Rectangle " + peri + "cm^2");
	}
}
