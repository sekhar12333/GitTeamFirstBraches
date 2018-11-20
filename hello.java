public class hello {
    public static void main(String[] args) {

        char[] b = args[0].toCharArray();

        for (int i =b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);

            String name = "nani chanti";
            char[] m = name.toCharArray();
            int n = m.length - 1;
            while (n >= 0) {
                System.out.print(m[n]);
                n--;

            }
        }
    }}
