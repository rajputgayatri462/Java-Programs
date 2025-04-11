// import java.util.Scanner;

public class Factorail {
 public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number");
    // int n = sc.nextInt();
    factorial(4);
    // sc.close();
 }  
 public static void factorial(int n) {
     int fact = 1;
     for(int i = 1; i<=n ; i++){
         fact = fact * i ;
        }
        System.out.println("Factorial : " + fact);
    }

}
