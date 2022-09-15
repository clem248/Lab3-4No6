import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Clarity {

    public void clarity(Integer cl){


            if (cl > 6) {
                System.out.println("Clarity is perfect!"+ '\n');
            } else {
                System.out.println("Clarity is not perfect but it's okay!" + '\n');
            }

    }
    public void sorting(int sorting[]){
        Arrays.sort(sorting);
      }


      public void clearityMaking(){


          String newline = System.getProperty("line.separator");
          Scanner scan = new Scanner(System.in);



          //clarity check
          try {
              Clarity clarity = new Clarity();
              System.out.println("Write the clarity of the stones");
              System.out.println("First One");
              int cl = scan.nextInt();
              clarity.clarity(cl);
              System.out.println("Second One");
              int cl1 = scan.nextInt();
              clarity.clarity(cl1);
              System.out.println("Third One");
              int cl2 = scan.nextInt();
              clarity.clarity(cl2);
              System.out.println("Fourth One");
              int cl3 = scan.nextInt();
              clarity.clarity(cl3);

              int[] array1 = {cl,cl1,cl2,cl3};
              clarity.sorting(array1);
              System.out.println(Arrays.toString(array1));

          }catch(InputMismatchException ex){
              System.out.println("Write correctly, only numbers!");
          }

      }

}
