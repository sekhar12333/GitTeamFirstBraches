public class switccmline {
    public static void main(String[] args) {

        switch(args[0])

        {
            case "1":
                System.out.println("SUNDAY");
                break;
            case "2":
                System.out.println("MONDAY");
                break;
            case "3":
                System.out.println("TUESEDAY");
                break;
            case "4":
                System.out.println("WEDNESDAY");
                break;
            case "5":
                System.out.println("THURSDAY");
                break;
            case "6":
                System.out.println("FRIDAY");
                break;
            case "7":
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println(":) Input is not their :)");
        }
    }
}
