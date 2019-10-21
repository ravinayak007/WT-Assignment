import java.util.Scanner;

 

public class SwapNumber {

 
   static void SwapCalculate(int x,int y){
   
       int temp;
        temp = x;

        x = y;

        y = temp;

        System.out.println("After Swapping\nx=" + x+"\ny=" + y);

         

    }

 public static void main(String[] args) {

        // TODO Auto-generated method stub

        int x, y;

        System.out.println("Enter x and y");

        Scanner in = new Scanner(System.in);

        x = in.nextInt();

        y = in.nextInt();

        System.out.println("Before Swapping\nx=" + x+"\ny=" +y);
       SwapCalculate( x , y);


}
}
