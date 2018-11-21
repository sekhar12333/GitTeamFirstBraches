public class hel {
    public enum day{   MONDAY(1,"MO"), FRIDAY(2,"FR"),SUNDAY(3,"SUN"),SATURDAY(4,"SAT"),WENDAY(5,"WEN");
        int i;
        String j;

        day(int i,String j) {
            this.i = i;
            this.j = j;
        }

            public static void main(String[] args) {
                day n = day.valueOf(args[0]);

                switch (n) {
                    case MONDAY:
                        System.out.println(day.MONDAY.i);
                        System.out.println(day.MONDAY.j);
                        break;
                    case FRIDAY:
                        System.out.println(day.FRIDAY.i);
                        System.out.println(day.FRIDAY.j);
                        break;
                    case SUNDAY:
                        System.out.println(day.SUNDAY.i);
                        System.out.println(day.SUNDAY.j);
                        break;
                    case SATURDAY:
                        System.out.println(day.SATURDAY.i);
                        System.out.println(day.SATURDAY.j);
                        break;
                    case WENDAY:
                        System.out.println(day.WENDAY.i);
                        System.out.println(day.WENDAY.j);
                        break;



                }

            }}}

