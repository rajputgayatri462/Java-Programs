import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
System.out.println("Enter num 1 :");
float num1 = sc.nextFloat();

System.out.println("Enter num 2 :");
float num2 = sc.nextFloat();	
	
 System.out.println("Enter the operator :");
char oper = sc.next().charAt(0);

float opt = 0;  //initial value

opt = (oper=='+')?num1+num2:
	(oper=='-')?num1-num2:
	(oper=='*')?num1*num2:
	(oper=='/')?num1/num2:
	(oper=='%')?num1%num2:0.000001f;

String output = num1 + " "+oper+" "+num2+" = " +opt;

if(!(opt ==0.000001f)){
	System.out.println(output);
}
} 
}