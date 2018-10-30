package Bike;

import java.util.Scanner;



class MOdelsBe {
    public static void main(String [] args){
        int YAMAHA=1;
        int SUZUKI=2;
        int TVS=3;

        Scanner sacn=new Scanner(System.in);
        System.out.print("we have brands " +"\n"+
                "press 1 for yamaha" +"\n"+
                "press 2 for SUZUKI" +"\n"+
                "press 3 for TVS :");

        int brand=sacn.nextInt();



        if(YAMAHA==brand){
            System.out.println("we have only 150cc,250cc,350cc choose which u want");


        }
        if(SUZUKI==brand){
            System.out.println("choose your model2");

        }
        if(TVS==brand){
            System.out.println("choose your model3");

        }
    }
}
