import java.util.Scanner;

public class table {
    public static void main(String[] args) {
 //Scanner scan=new Scanner(System.in);
   //     System.out.println("which tabel u want enter");
        //int x=scan.nextInt();
        String x= args[0];
        int j = Integer.valueOf(x);
        for(int i=1;i<=10;i++){
//
            System.out.println(j+"*"+ i+ "=" +(j*i));
        }


    }}
