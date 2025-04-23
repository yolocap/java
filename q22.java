import java.util.Scanner;
public class q22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scan.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i <= size-1; i++) {
            num[i] = scan.nextInt();
        }
        int middle = size / 2;
        System.out.println("Middle element is: " + num[middle]);
        


    }
}
