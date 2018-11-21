public class switccmline {
    public static void main(String[] args) {

        Day d = Day.valueOf(args[0]);
//        String s=args[0];
        switch(d)

        {
            case MONDAY:
                System.out.println(Day.MONDAY.geti());
                System.out.println(Day.MONDAY.getj());
                break;
            case TUESDAY:
                System.out.println(Day.TUESDAY.geti());
                System.out.println(Day.TUESDAY.getj());
                break;
            case WEDNESDAY:
                System.out.println(Day.WEDNESDAY.geti());
                System.out.println(Day.WEDNESDAY.getj());
                break;
            case THURSDAY:
                System.out.println(Day.THURSDAY.geti());
                System.out.println(Day.THURSDAY.getj());
                break;
            case FRIDAY:
                System.out.println(Day.FRIDAY.geti());
                System.out.println(Day.FRIDAY.getj());
                break;
            case SATURDAY:
                System.out.println(Day.SATURDAY.geti());
                System.out.println(Day.SATURDAY.getj());
                break;
            case SUNDAY:
                System.out.println(Day.SUNDAY.geti());
                System.out.println(Day.SUNDAY.getj());
                break;
            default:
                System.out.println(":) Input is not their :)");
        }
    }
}
