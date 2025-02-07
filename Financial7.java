import java.util.Scanner;
class Financial7
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your subtotal :");
	float bill = sc.nextFloat();
	System.out.println("Enter your tip rate :");
	float tipRate= sc.nextFloat();

	float tip = (bill*tipRate)/100 ;
	float totalBill = bill + tip;
	System.out.println("Total bill is :" + totalBill);
	}
}