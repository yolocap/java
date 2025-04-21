import java.lang.System;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        scan.nextLine();
        String Address = scan.nextLine();
        System.out.println("My name is:" + Name);
        System.out.println("My age is:" + Age);
        System.out.println("My address is:" + Address);
    }
    
}
