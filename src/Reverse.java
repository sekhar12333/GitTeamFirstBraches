public class Reverse {
    public static void main(String[] args) {
        char[] ch = args[0].toCharArray();

        for (int i =ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
