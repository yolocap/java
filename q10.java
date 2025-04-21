import java.util.Scanner;
class q10 {
    public static void main(String[] args) {
        System.out.println("Enter the Marks of 5 subjects: ");
        System.out.println("Tamil, English, Maths, Science, Social: ");
        
        Scanner scan = new Scanner(System.in);
        int Tamil = scan.nextInt();
        int English = scan.nextInt();
        int Maths = scan.nextInt();
        int Science = scan.nextInt();
        int Social = scan.nextInt();
        int total = Tamil + English + Maths + Science + Social;
        int average = total / 5;
    if (average < 35) {
        System.out.println(" Additional Classes Required");
        
    } else {
        System.out.println("you are good to go");
        
    }

}
}
