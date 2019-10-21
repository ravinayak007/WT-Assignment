import java.util.Scanner;
import java.io.*;
public class ReverseNumber{

        static void ReverseCalculate(int n){


                         int rev=0,rem;
                         
                         while(n!=0){
                              rem=n%10;
                               rev=rev*10+rem;
                               n=n/10;
                          }
                           
                     System.out.print("Reverse the Number : "+rev);

                      }

public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number : ");
            int n=sc.nextInt();
            ReverseCalculate(n);


}

}