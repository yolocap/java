public class arithmetic {
    void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }
    void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
    void divide(int a, int b) {
        System.out.println("Quotient: " + (a / b));
    }
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        obj.sum(145, 775);
        obj.subtract(997, 357);
        obj.multiply(23, 45);
        obj.divide(100, 5);
    }
}
