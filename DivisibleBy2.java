import java.util.Scanner;
public class DivisibleBy2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char :");
        int ch = sc.nextInt();
        String op = ((ch %2==0 && ch%5 ==0) ? ("is HiTwoFive") : ((ch %2==0) ? ("is HiTwo") : ((ch %5==0) ? ("is HiFive") : ( " "))));
        System.out.println(op);
        sc.close();


    }
}