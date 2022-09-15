import java.util.Arrays;

public class WeightandPrice  extends Clarity{

    public void weight(int weight){

        int pricee = 32;

        if (weight>0) {


            int weight1 = weight * pricee;
            System.out.println("The price of your stone:   " + weight1 + "$");

        }
        else{
            System.out.println("Written wrong, go start the app again!!!");
        }
    }

    public void sort(int sort[] ){
        Arrays.sort(sort);
        int n=32;

        System.out.println("\nASCENDING VALUES ");
        for(int i=0; i<sort.length; i++) {
            System.out.println("|||" + sort[i]*n + "|||");


        }

    }



}
