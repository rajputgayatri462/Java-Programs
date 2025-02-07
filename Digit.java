import java.util.Scanner;
public class Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char :");
        char ch = sc.next().charAt(0);
        System.out.println((ch>='0' && ch <='9') ? (ch + "is a digit") : ("is not a digit"));

  
 
        sc.close();


    }
}