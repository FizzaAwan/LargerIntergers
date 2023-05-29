import java.util.Scanner;

/** 
   A program reads two integer values
   and prints out the larger of the two.
   If the values are equal, only one of the value is printed.
*/
public class Lab5_1
{
   public static void main(String[] args)
   {
      // Print prompt to enter two integer values
      System.out.print("Please enter two integer values: ");

      // Read in both integer values
      Scanner in = new Scanner(System.in);
      int value1 = in.nextInt();
      int value2 = in.nextInt();

      // Determine which value is larger and print it out
      if(value1> value2){
        System.out.print("The larger value " + value1);
        }else if(value2> value1){System.out.println("The larger value " + value2);
        }else{System.out.print("The values are equal " + value1);
        }

      // Your work here

   }
}

