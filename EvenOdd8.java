import java.util.Scanner;
class EvenOdd8
{
	public static void main(String [] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the num :");
	  int num = sc.nextInt();
		
		//Method 1
	  System.out.println(num/2==num/2.0);

   		System.out.println("Enter the num :");
		 int num1 = sc.nextInt();
		
		//Method 2
		System.out.println((num1/2)*2 == num1);


		System.out.println("Enter the num :");
		 int num2 = sc.nextInt();
		
		//Method 3
		System.out.println(num2%2==0);
	}
}

//inshort summary
//1. num%2==0
//2. (num/2)==(num/2.0)
//3. (num/2)*2==num