import java.util.Scanner;
class UpperCaseNot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

System.out.println("Enter the Character :");
char ch = sc.next().charAt(0);

String op = ((ch>='A' && ch <= 'Z') ||(ch>='a' && ch <= 122) ? ((ch>='a' && ch <='z') ? (ch + "is a lowercase alphabet ") : (ch + "is a uppercase alphabet ")) :((ch>='0' && ch <= '9') ? ( ch+ "is a digit") : ( ch + "is a special character")));


System.out.println(op);
	
	} 
}