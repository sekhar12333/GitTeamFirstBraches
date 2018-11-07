public class Nestedif {
    public static void main(String[] args) {
        int age = 17;
        int weight = 50;

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible to dontae blood");
            }else {
                System.out.println("You are not eligible to donate");
            }
        }else {
            System.out.println("You are not greater than 18");
        }
    }
}
