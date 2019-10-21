import java.util.Scanner;
import java.io.*;
public class PalidromeString{

        static void PalidromeCalculate(String str){
                                  
                  String rev="";
                int length = str.length();
               for(int i=length -1 ; i>=0 ; i--)
          	         rev=rev+ str.charAt(i);
         
            
              if(str.equals(rev))
                  System.out.print(str + " is palindrome string ");
             else
              System.out.print(str + " is not palindrome string ");
            

                      }

public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the String : ");
            String str=sc.nextLine();
            PalidromeCalculate(str);


}

}