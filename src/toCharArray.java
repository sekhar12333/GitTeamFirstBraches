public class toCharArray {
    public static void main(String[] args) {
        String s = "Hello";
        char[] ch= s.toCharArray();
        int length = ch.length;
        for(int i=length-1;i>=0;i--){
            System.out.println(ch[i]);
        }

           }
}
