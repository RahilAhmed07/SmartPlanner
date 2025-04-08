import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using operators and if-else conditional
        if (num % 2 == 0) { // % operator checks remainder
            System.out.println(num + " is Even number!");
        } else {
            System.out.println(num + " is Odd number!");
        }

        sc.close();
    }
}
