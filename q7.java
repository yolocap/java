import java.util.Scanner;
class q7 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int div = scan.nextInt();
        if (div%3==0 && div%5==0) {
            System.out.println("Divisible by 3 and 5");
        } else {
            System.out.println("Not Divisible by 3 and 5");
        }
    }
    
}
