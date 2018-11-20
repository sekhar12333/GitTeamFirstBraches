public class Weekdays {

    public static void main(String[] args) {
        String days = args[0];
        for (String s : args) {
            System.out.println("Now the day is:"+days);
            int i = Integer.valueOf(s);

            switch (i) {
                case 1:

                    System.out.println("Monday");
                    break;

                case 2:

                    System.out.println("Tuesday");
                    break;

                case 3:

                    System.out.println("Wednesday");
                    break;

                case 4:

                    System.out.println("Thursday");
                    break;

                case 5:

                    System.out.println("Friday");
                    break;

                case 6:

                    System.out.println("Saturday");
                    break;

                case 7:

                    System.out.println("Sunday");
                    break;

            }

        }
    }
}
