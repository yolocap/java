import java.util.Scanner;
class q6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        if (income >= 7000) {
            System.out.print("Scholarship is Available");
            
        } else {
            System.out.print("Scholarship is not Available");
            
        }
    }
    
}
