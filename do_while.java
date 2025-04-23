import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num=0;
        do{
            System.out.println("Enter a number greater than 15:" );
            num = scan.nextInt();
        }while(num<15);
    }
        
    
}
