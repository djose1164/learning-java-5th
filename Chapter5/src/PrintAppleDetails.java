public class PrintAppleDetails {
    public static void main(String[] args) {
        var a1 = new Apple();
        System.out.println("Apple a1: ");
        a1.printDetails();

        // fill in some information on a1
        a1.mass = 10;
        a1.x = 20;
        a1.y = 42;
        System.out.println("Updated a1:");
        a1.printDetails();
    }
}
