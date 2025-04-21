/*Question 3:
 * get values from the user and print the sum of two numbers
 */
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner Dhanesh = new Scanner (System.in);
        System.out.println("Enter the first number:");
        int a = Dhanesh.nextInt();
        System.out.println("Enter the second number:");
        int b = Dhanesh.nextInt();
        int sum = a + b;
        System.out.println("sum of two numbers:" + sum);
}
}