import java.util.Scanner;

public class programs {
    public static void main(String args[]){
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two string");
        s1=sc.nextLine();
        s2=sc.nextLine();
        //concatenation of two strings
        String s3=s1+s2;
        System.out.println("Result on concatenation is:"+s3);
        //convert first string into uppercase
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        System.out.println("1st string in upparcase:"+s1+""+s2);
        //lenth of both the string
        int l1=s1.length();
        int l2=s2.length();
        System.out.println("string  length is:"+l1);
        System.out.println("string  length is:"+l2);

    }
}
