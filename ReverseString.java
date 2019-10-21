import java.util.Scanner;
import java.io.*;
public class ReverseString{

        static void ReverseCalculate(String str){
                                  
                  String rev="";
                int length = str.length();
               for(int i=length -1 ; i>=0 ; i--)
          	         rev=rev+ str.charAt(i);
         
             	System.out.print(" Reverse string : " + rev);
            

                      }

public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the String : ");
            String str=sc.nextLine();
            ReverseCalculate(str);


}

}