//	the Indian Census Bureau Project based on following assumptions:
//	One birth every 7 seconds , one death every 13 seconds ,
//	one immagrants every 45 seonds
//	W.a.p. to display the population for each of the next fives year.
//	assume the current population 312032486 and one year and 365 days.


class Population4
{
	public static void main(String [] args)
	{
		long currPop = 312032486;
		long seconds = (365*24*60*60)*5;
		long birth = seconds / 7 ;
		long death = seconds / 13 ;
		long imm = seconds / 45 ;
		long newPop = currPop + birth - death + imm;
		System.out.println("the current populaton was:"+ currPop);
		System.out.println("the new populaton was:"+ newPop);
	}
}