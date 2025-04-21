import java.util.Scanner;
public class example_q_array {
public static void main(String args[]) {
    int[] numbers = new int[5];
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 5 numbers:");
    numbers[0] = scan.nextInt();
    numbers[1] = scan.nextInt();
    numbers[2] = scan.nextInt();
    numbers[3] = scan.nextInt();
    numbers[4] = scan.nextInt();
    System.out.print( "total=" +(numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]));


}
}