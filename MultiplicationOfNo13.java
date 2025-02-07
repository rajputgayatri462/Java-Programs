 
class MultiplicationOfNo13
{
public static void main(String args[])
{
int num = 2222;
int sum = 1;
//int rem = 1;

int rem = num %10;
sum = sum * rem;
num = num/10;

rem = num % 10;
sum = sum * rem;
num = num/10;

rem = num % 10 ;
sum = sum * rem ;
num = num/10;

rem = num % 10 ;
sum = sum * rem;
  
System.out.println(sum);
	} 
}