import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String result = (num1 > num2) ? num1 + "is greater than" + num2 : num2 +" is greater than " + num1;
        System.out.println(result);
        

    }  
}