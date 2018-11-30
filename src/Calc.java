public class Calc {
    public static void main(String[] args) {
        String s = args[0];
        int num1 = Integer.valueOf(s);

        String t = args[1];
        int num2 = Integer.valueOf(t);

        String calc = args[2];

        switch (calc){
            case "A":
                int sum = num1+num2;
                System.out.println("addition of this 2 numbers is = "+sum);
                break;
            case "S":
                int subtraction = num1 - num2;
                System.out.println("subtraction of this 2 numbers is = " +subtraction);
                break;
            case "M" :
                int multiplication = num1 * num2;
                System.out.println("multiplication of this 2 numbers is = "+multiplication);
                break;
            case"D":
                int division = num1/num2;
                System.out.println("division of this 2 numbers = "+division);
                break;
            case "R":
                int remainder = num1%num2;
                System.out.println("remainder of this 2 numbers is = "+remainder);
                break;

        }


    }
}
