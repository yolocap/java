public class eg_while {
    public static void main (String[]args) {
        int i = 1;
        while (i <= 3) {
            i++;
            int j = 1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
}
