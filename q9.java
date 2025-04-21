import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        System.out.println("What is the score?");
        Scanner scan=new Scanner(System.in);
        int score = scan.nextInt();
        if (score < 50) {
            System.out.println("You need to Improve");       }
            else if (score>=50 && score <70) {
                System.out.println(" Good Job");}
                else if (score>70)
            {
                System.out.println("Excellent Performance");
            }           

    }
    
}
