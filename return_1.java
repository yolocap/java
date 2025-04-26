public class return_1 {
    String getname() {
        return " Dhanesh ";
    }

    int getphone() {
        return 1234567890;
    }
    String getaddress() {
        return "Address: 85,Anadham Nagar,Arumbathapuram, Puducherry-605010";
    }

    public static void main(String[] args) {
        return_1 obj = new return_1();
        String name = obj.getname();
        int phone = obj.getphone();
        String address = obj.getaddress();
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}