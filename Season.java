import java.util.Scanner;
public class Season {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the months :");
        String month = sc.next().toUpperCase();

        String op = (month.equals("OCT")) ||(month.equals("NOV")) ||(month.equals("DEC")) ||(month.equals("JAN")) ? month + " is winter"  :
        (month.equals("FEB")) ||(month.equals("MAR")) ||(month.equals("APR")) ||(month.equals("MAY")) ? month + " is summer"  :
        (month.equals("JUN")) ||(month.equals("JUL")) ||(month.equals("AUG")) ||(month.equals("SEP")) ? month + " is monsoon"  : "INVALID MONTH" ;
 
        System.out.println(op);
        sc.close();


    }
}