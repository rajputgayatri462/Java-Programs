
import java.util.Scanner;
public class Fibonacci {
 public static void main(String[] args) {
    fibonacci();
 }   
 public static void fibonacci() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms: ");
    int c = sc.nextInt();
    int n = 0;
    int a = 0;
    int b= 1;
    while(n<c){
        System.out.print(a + " ");
        int temp = a;
        a = b;
        b = temp + a;
        n++;
    }
    // System.out.println(n);
 }
}
