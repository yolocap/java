import java.util.Scanner;
public class find {
    void evenorodd(int num) {
        if (num %2==0) 
        {
            System.out.println(num + " Number is Even: ");
        
            
        } else {
            System.out.println(num + " Number is Odd: ");
            
        }

    }
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        find obj = new find();
        obj.evenorodd(num);
}
}
