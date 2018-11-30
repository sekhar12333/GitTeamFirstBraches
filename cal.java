public class cal {
    public static void main(String[] args) {
        String a=args[0];
        int c=Integer.valueOf(a);

        String b=args[1];
        int d=Integer.valueOf(b);
        switch(args[2]){
            case "a":
               // int result=c+d;
                System.out.println("addition result is"+(c+d));
                break;
            case "s":
               // int result=c-d;
                System.out.println("addition result is"+(c-d));
                break;

            case "m":
               // int result=c*d;
                System.out.println("addition result is"+(c*d));
                break;
            case "d":
                int result=c/d;
                System.out.println("addition result is"+(c/d));
                break;

        }
    }
}
