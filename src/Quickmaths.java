import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths{

    public static double gennemsnit(int a, int b){
        return (a+b)/2;
    }

    public static long sum(int a, int b){
        return a+b;
    }

    public static void start(){
        Scanner input=new Scanner(System.in);
        int stage=0;
        int a=0,b=0;

        System.out.print("Indtast A: ");

        while(input.hasNext()){
            String cmd=input.next();
            if(cmd.equals("exit")||cmd.equals("Exit")||cmd.equals("EXIT")){
                break;
            }
            if(stage==0){
                System.out.print("Indtast B: ");
                a=Integer.parseInt(cmd);
                stage++;
            }else{
                b=Integer.parseInt(cmd);
                System.out.println("Sum: "+sum(a,b));
                System.out.println("Gennemsnit: "+gennemsnit(a,b));
                System.out.println("--------------");
                System.out.print("Indtast A: ");
            }
        }
    }

    public static void main(String[] args){
        System.out.println("**** Quickmaths ****");
        Quickmaths.start();
    }
}