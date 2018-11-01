import java.util.Scanner;

public class Practise  {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Pounds value here : ");

        int pounds=scanner.nextInt();
        double kg=pounds*0.454;
        System.out.println(pounds+" pounds convereted into: " + kg+ " kilograms");


    }

}
