import java.util.Scanner;
public class oveteridifelaseStatment {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System .out.println("enter your age");
        int age=sc.nextInt();
        if(age>18){
            System.out.print("ur eligible to get voter card please enter ur details");
            Scanner s= new Scanner(System.in);
            System.out.println("Please enter the your name");
            String name=s.next();
            System.out.println("Please enter the your father name");
            String fathername=s.next();
            System.out.println("Please enter the your Date Of Birth");
            int DOB=s.nextInt();
            System.out.println("Please enter the your village  name");
            String villagename=s.next();
            System.out.println("Please enter the your 10 DIGIT MOBAIL NUMBER");
            long mobile=s.nextLong();

            System.out.println(" your name ="+name);
            System.out.println(" your fathername ="+fathername);
            System.out.println(" your DOB= "+DOB);
            System.out.println("your VILLAGENAME= "+villagename);
            System.out.println("your mobile number= "+mobile);




    }
     else if(age>18) {
            System.out.println("u need to pay fine");

            }
            else{
            System.out.println("hello welcome to voter app");
        }
        }
    }