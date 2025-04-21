import java.util.Scanner;
class task5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println("number 1 and number2 are equal");
        } else {
            System.out.println("number 1 and number2 are not equal");
        }
    }
}
