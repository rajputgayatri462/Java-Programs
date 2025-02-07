import java.util.Scanner;
class RemEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        
        while (num > 0) {
            int rem = num % 10; // Get last digit
            
            if (rem % 2 == 0) { // Check if even
                sum += rem;
            }
            
            num /= 10; // Remove last digit
        }
        
        System.out.println("Sum of even digits: " + sum);
        sc.close();
    }
}
