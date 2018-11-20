public class Reverse {
    public static void main(String[] args) {
        String s=args[0];
        char[]ar =s.toCharArray();
        for (int i=ar.length-1;i>=0;i--)
        {
            System.out.print(ar[i]);
        }


    }
}
