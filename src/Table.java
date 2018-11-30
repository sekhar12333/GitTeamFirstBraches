public class Table {
    public static void main(String[] args) {

        String x = args[0];
        int num = Integer.valueOf(x);

        for (int i=1;i<=10;i++){
            System.out.println(num+"*"+i+" = "+(num*i));
        }
    }
}
