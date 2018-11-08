public class Elseif {

    public static void main(String[] args) {
        int age = 25;

        if (age >= 50) {

            System.out.println("You Completed half of your life");
        } else if (age < 50 && age >= 30) {
            System.out.println("You are well setteled in your life");
        } else {
            System.out.println("You are about to achieve something in your Life");
        }
    }
}