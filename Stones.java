import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Stones {


    public static void main (String ... args){


        String newline = System.getProperty("line.separator");
        Scanner scan = new Scanner(System.in);

        //choosing the stones
        System.out.println("Add the stones");

        System.out.println("First One");
        String st = scan.nextLine();

        System.out.println("Second One");
        String st1 = scan.nextLine();

        System.out.println("Third One");
        String st2 = scan.nextLine();

        System.out.println("Fourth One");
        String st3 = scan.nextLine();
        String text = "You chose these stones:" + newline + "1)" + st + newline + "2)" + st1 + newline + "3)" + st2 + newline + "4)" + st3;
        System.out.println(text);


        Clarity clear = new Clarity();

        clear.clearityMaking();



        WightandPricaMaker wight = new WightandPricaMaker();

        wight.weighter();









    }




}
