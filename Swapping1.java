class Swapping1
{
public static void main(String[] args)
	{
	int a = 2;
	int b = 3;
	
	System.out.println("Before swapping");
	System.out.println("a :" +a);
	System.out.println("b :" +b);
	
	// using third variable 
	int temp = a;
	a=b;
	b = temp;
	
	System.out.println("After swapping");
	System.out.println("a :" +a);
	System.out.println("b :" +b);


	// w/o third variable
	int c = 2;
	int d = 3;
	System.out.println("Before swapping");
	System.out.println("c :" +c);
	System.out.println("d :" +d);

	c = c + d;
	d = c - d;
	c = c - d;


System.out.println("After swapping");
	System.out.println("c :" +c);
	System.out.println("d :" +d);

	}

}