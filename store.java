public class store {
    void kitkat(int money) {
        System.out.println(money);
        System.out.println("Kitkat chocolate purshased");
    }
    void dairy_products(int money) {
        System.out.println(money);
        System.out.println("Dairy products purshased");
    }
    void chips(int money) {
        System.out.println(money);
        System.out.println("Chips purshased");
    }
    public static void main(String[] args) {
        store obj = new store();
        obj.kitkat(20);
        obj.dairy_products(44);
        obj.chips(10);
    }
}
