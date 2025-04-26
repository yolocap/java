public class garden {
    int apple_price = 20;
    int apple_count = 5;
    void total_money() {
        System.out.println(" The Total Amount is:" + apple_count*apple_price);
    } 
    public static void main(String[] args) {
        garden obj = new garden();
        obj.total_money();
}
}
