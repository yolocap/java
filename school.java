import java.util.Scanner;
public class school {
    String passorfail() {
        return "Pass";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = scan.nextInt();
        school obj = new school();
        String result = obj.passorfail();
        if (marks >= 35) {
            System.out.println(result);
        } else {
            System.out.println("fail");
        }
        
    }

}
