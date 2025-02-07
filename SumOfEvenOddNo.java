class SumOfEvenOddNo
{
	public static void main(String args[])
	{

int num = 123;
int evenSum = 0;
int oddSum = 0;
int temp = 0;

int rem = num%10 ; //123%10===>3(rem)
temp = (rem%2==0)?(evenSum = evenSum + rem) :(oddSum =oddSum + rem);

num = num/10; //123/10===>12(num)
rem = num%10 ; //123%10===>3(rem)
temp = (rem%2==0)?(evenSum = evenSum + rem) :(oddSum =oddSum + rem);


num = num/10; //123/10===>12(num)
rem = num%10 ; //123%10===>3(rem)
temp = (rem%2==0)?(evenSum = evenSum + rem) :(oddSum =oddSum + rem);


num = num/10; //123/10===>12(num)
rem = num%10 ; //123%10===>3(rem)
temp = (rem%2==0)?(evenSum = evenSum + rem) :(oddSum =oddSum + rem);


System.out.println("Evensum :" + evenSum);
System.out.println("Oddsum :" + oddSum);
	} 
}
