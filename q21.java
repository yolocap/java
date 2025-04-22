import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =scan.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println(i + "x" + num + "=" + (i*num));
        }

    }
}
