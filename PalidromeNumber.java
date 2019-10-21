import java.util.Scanner;
import java.io.*;
public class PalidromeNumber{

        static void PalidromeCalculate(int n){


                         int rev=0,rem,temp;
                         temp=n;
                         
                         while(temp!=0){
                              rem=temp%10;
                               rev=rev*10+rem;
                               temp=temp/10;
                          }
                           if(rev==n)
                     System.out.print(rev+ " is Palidrome Number  ");
                   else
                    System.out.print(rev + " is not Palidrome Number ");

                      }

public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number : ");
            int n=sc.nextInt();
            PalidromeCalculate(n);


}

}