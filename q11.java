import java.util.Scanner;
class q11 {
    public static void main(String args[] ) {
        System.out.println("What is the color of the traffic light? (Red, Yellow, Green): ");
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
        if (color.equalsIgnoreCase("Red")) {
             System.out.println("Stop");
        } else if (color.equalsIgnoreCase("Yellow")) {
                System.out.println("Get Ready ");
                } else if (color.equalsIgnoreCase("Green")) {
                                 System.out.println("Go");
                } else {
                    System.out.println("Invalid color. Please enter Red, Yellow, or Green.");
                }

    }
    
}
