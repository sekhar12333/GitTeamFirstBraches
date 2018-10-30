package Bike;

import java.util.Scanner;



public class MOdelsBike {
    public static void main(String [] args){
        String YAMAHA="YAMAHA";
        String SUZUKI="SUZUKI";
        String TVS="TVS";

        Scanner sacn=new Scanner(System.in);
        System.out.println("we have brands " +"\n"+
                "YAMAHA" +"\n"+
                "SUZUKI" +"\n"+
                "TVS");
        String brand=sacn.nextLine();

        if(brand .equals(YAMAHA)){
            System.out.println("we have " +"\n"+
                    "150CC " +"\n"+
                    "250cc " +"\n"+
                    "350cc " +"\n"+
                    "choose your cc");

            int model=sacn.nextInt();


            if(model==150){
                System.out.println("YAMAHA R15");

            }
            else if(model==250){
                System.out.println("YAMAHA R6");

            }
            else if(model==350){
                System.out.println("YAMAHA FZ");

            }

        }
        else {
            System.out.println("type in captle letters");
        }
        if(brand .equals(SUZUKI)){
            System.out.println("we have " +"\n"+
                    "150CC " +"\n"+
                    "250cc " +"\n"+
                    "350cc " +"\n"+
                    "choose your cc");

            int model=sacn.nextInt();


            if(model==150){
                System.out.println("suzuki 150");

            }
            else if(model==250){
                System.out.println("suzuki 250");

            }
            else if(model==350){
                System.out.println("SUZUKI 350");

            }

        }
        if(brand .equals(TVS)){
            System.out.println("we have " +"\n"+
                    "150CC " +"\n"+
                    "250cc " +"\n"+
                    "350cc " +"\n"+
                    "choose your cc");

            int model=sacn.nextInt();


            if(model==150){
                System.out.println("TVS 150");

            }
            else if(model==250){
                System.out.println("TVS 250");

            }
           else  if(model==350){
                System.out.println("TVS 350");

            }

        }




    }
}
