public class StringChar {
    public static void main(String[] args) {

        String st = args[0];
        char[] s = st.toCharArray();

        for (int i = s.length-1;i>=0;i--){

            System.out.println(s[i]);

        }
    }
}
