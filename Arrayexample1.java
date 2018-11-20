public class Arrayexample1 {
    public static void main(String[] args) {

        String s = args[0];
        char[] c = s.toCharArray();
        for (int i=c.length-1;i>=0;i--){
            System.out.println(c[i]);
        }

        }


    }


