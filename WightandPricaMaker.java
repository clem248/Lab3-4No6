import com.sun.tools.javac.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WightandPricaMaker extends Stones {


    public void weighter (){

        String newline = System.getProperty("line.separator");
        Scanner scan = new Scanner(System.in);

        //weight and price
        try {


            WeightandPrice weight = new WeightandPrice();
            System.out.println("Please, write the weight for each of your stones in carats");

            System.out.println("First one:");
            int we = scan.nextInt();
            weight.weight(we);

            System.out.println("Second one:");
            int we1 = scan.nextInt();
            weight.weight(we1);


            System.out.println("Third one:");
            int we2 = scan.nextInt();
            weight.weight(we2);

            System.out.println("Fourth one:");
            int we3 = scan.nextInt();
            weight.weight(we3);

            int[] array = {we,we1,we2,we3};
            weight.sort(array);

        }catch (InputMismatchException ex){
            System.out.println("This is - " + ex + "\n Write correctly, or you will start the app again and again!");
        }


    }
}
