public class Switch {
    public static void main(String[] args) {
        String s=args[0];
        int i=Integer.valueOf(s);
        switch (i)
        {
            case 1:
            System.out.println("Mondays are pathetic");
            break;
            case 2:
                System.out.println("tuesdays are bit reasonable");
                break;
            case 3:
                System.out.println("wednesday are work days");
                break;
            case 4:
                System.out.println("thursdays are baba days");
                break;
            case 5:
                System.out.println("Fridays are fun days");
                break;
            case 6:
                System.out.println("saturdays are party nights");
                break;
            case 7:
                System.out.println("Sundays and lazy days");
                break;
                default:
                    System.out.println("Don't enter more than 7");


        }


    }
}
