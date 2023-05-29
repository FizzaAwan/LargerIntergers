import java.util.Scanner;

/** 
   This program reads three integer values
   and prints out the smallest of the three.
   If the values are equal, print out only one of them.
*/
public class Lab5_2
{
   public static void main(String[] args)
   {
      // Print prompt to enter three integer values
      System.out.print("Please enter three integer values: ");

      // Read in the three integer values
      Scanner in = new Scanner(System.in);
      int value1 = in.nextInt();
      int value2 = in.nextInt();
      int value3 = in.nextInt();

      // Determine and print out the smallest value
      if(value1 <= value2 && value1 <= value3){
        System.out.print("This is the smallest value "+ value1);
}else if(value2 <= value1 && value2<= value3){System.out.println("This is the smallest value " + value2);
}else if(value3 <= value1 && value3<= value2){System.out.println("This is the smallest value " + value3);
    }else{System.out.print("The values are equal " + value1);
    }
}
}