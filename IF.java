import javax.swing.*;
import java.util.Scanner;



class main{
    void main(){
      Scanner strm=new Scanner(System.in);
        String streams="java";
        String streams1="android";
        String streams2="digital marketing";
//        String[] javaemp={"samantha"+"kajal"+"rakul"};



        System.out.println("welcome  IDIOT and select your stream ");
        System.out.println("select your stream " + "\n"+
                "java " +"\n"+
                "android " +"\n"+
                "digital marketing");

         String emp=strm.nextLine();
        if(emp.equals(streams)) {
            String java= "samantha";
            String java1 = "kajal";
            String java2 = "rakul";
            System.out.println("samantha " + "\n" +
                    "kajal " + "\n" +
                    "rakul");
            String javemp = strm.nextLine();
            if (javemp.equals(java)) {
                System.out.println("suuces");

                for(int i=0;i<10;i++){
                    if (i==5){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }

            else if (javemp.equals(java1)) {
                System.out.println("suuces1");
                for(int i=0;i<10;i++){
                    if (i==2){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }


            else if (javemp.equals(java2)) {
                System.out.println("suuces2");
                for(int i=0;i<10;i++){
                    if (i==3){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }



        }else if(emp.equals(streams1)){
            System.out.println("samanthaandroid " +"\n"+
                    "kajal android" +"\n"+
                    "rakulandroid");

            String android= "samanthaandroid";
            String android1 = "kajal android";
            String android2 = "rakulandroid";

            String emp1 = strm.nextLine();
            if (emp1.equals(android)) {
                System.out.println("androidsuuces");

                for(int i=0;i<10;i++){
                    if (i==5){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }

            else if (emp1.equals(android1)) {
                System.out.println("androidsuuces1");
                for(int i=0;i<10;i++){
                    if (i==2){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }


            else if (emp1.equals(android)) {
                System.out.println("androidsuuces2");
                for(int i=0;i<10;i++){
                    if (i==3){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }







        }else if(emp.equals(streams2)){
            System.out.println("samanth adigital " +"\n"+
                    "kajal digital " +"\n"+
                    "rakul digital");
            String adigital= "samantha digital";
            String adigital1 = "kajal digital";
            String adigital2 = "rakul digital";

            String emp2 = strm.nextLine();

            if (emp2.equals(adigital)) {
                System.out.println("digitalsuuces");

                for(int i=0;i<10;i++){
                    if (i==5){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }

            else if (emp2.equals(adigital1)) {
                System.out.println("digitalsuuces1");
                for(int i=0;i<10;i++){
                    if (i==2){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }


            else if (emp2.equals(adigital2)) {
                System.out.println("digitalsuuces2");
                for(int i=0;i<10;i++){
                    if (i==3){
                        System.out.println("absnt"+i);
                    }else if(i==8){
                        System.out.println("abstnt"+i);
                    }
                    System.out.println("presnt"+i);
                }

            }

        }

}}

public class IF extends main{

    public static void main(String[] args) {

          main log=new main();


        String employename="buchi";
        String employename2="vattepollu";


        Scanner check=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        String login=check.nextLine();

        if (login.equals(employename)){
            log.main();

        }else if(login.equals(employename2)){
            log.main();

            System.out.println("yo don't have acces to login");
        }



    }

}
