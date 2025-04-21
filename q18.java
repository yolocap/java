import java.util.Scanner;
public class q18 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i<=4; i++) {
            System.out.print("Enter number " +(i+1)+ ":" );
            num[i] = scan.nextInt();
        }
      for (int i = 0; i<=4; i++) {
            System.out.println(num[i]);
    }
    
}
}