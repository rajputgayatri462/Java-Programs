import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

System.out.println();
System.out.println("		CURRENCY CONVERTER");
System.out.println();
System.out.println("Enter the amount (in INR) : " );
float inr = sc.nextFloat();
System.out.println();

System.out.println("LIST OF CURRENCY ");
System.out.println("1. USD");
System.out.println("2. EUR");
System.out.println("3. GBP");
System.out.println("4. PKR");
System.out.println("5. YEN");
System.out.println("6. WON");
System.out.println();
System.out.println("Enter the currency : ");
String curr = sc.next().toUpperCase();

float conCurr = 0;

if (curr.equals("USD")){
conCurr = inr/86.56f;
System.out.println(inr + "INR :" + conCurr + " USD");
}

else if (curr.equals("EUR")){
conCurr = inr/90.25f;
System.out.println(inr + "INR :" + conCurr + " EUR");
}

else if (curr.equals("GBP")){
conCurr = inr/107.66f;
System.out.println(inr + "INR :" + conCurr + " GBP");
}

else if (curr.equals("PKR")){
conCurr = inr/0.310f;
System.out.println(inr + "INR :" + conCurr + " PKR");
}

else if (curr.equals("YEN")){
conCurr = inr/0.56f;
System.out.println(inr + "INR :" + conCurr + " YEN");
}

else if (curr.equals("WON")){
conCurr = inr/0.0598446f;
System.out.println(inr + "INR :" + conCurr + " WON");
}

else{

System.out.println("INVALID OUTPUT");
}

	
	} 
}