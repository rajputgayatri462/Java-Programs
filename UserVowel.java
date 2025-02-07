
import java.util.Scanner;
class UserVowel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

System.out.println("Enter the UseerName :");
String un = sc.next();

for(int i = 1 ; i < un.length() ; i++){
	char ch = un.charAt(i);
	if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
		System.out.println(ch);
		//to print index og vowel
		System.out.println(ch + " : " + i);

}
} 



	
	} 
}