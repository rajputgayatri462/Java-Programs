import java.util.Scanner;
public class UserNameThread {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String un = sc.next().toUpperCase();
        int len = un.length();
        for (int i = 0; i<len ; i++){
            System.out.println(un.charAt(i));
            Thread.sleep(1000);
        }

  
 
        sc.close();


    }
}