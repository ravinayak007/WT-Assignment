import java.util.Scanner;
import java.io.*;
public class Armstrong{
	static void ArmCalculate(int n){
                         
                               int t1,length=0 ;
                                t1=n;
                               while(t1!=0)
                                    {
                                     t1=t1/10;
                                     length=length+1;
                                    }
                        
                         int t2=n,arm=0,rem=0;
                         while(t2!=0)
                         {
                          int mul=1;
                          rem=t2%10;
                          for(int i=1;i<=length;i++)
                          {
                            mul=mul*rem;
                          }
                            arm=arm+mul;
                          t2=t2/10;

                         } 

                                         
                      
             if(arm==n){
               System.out.println("armstrong"+ n +" " + arm);
             }
             else{
              System.out.println("not armstrong"+ n +" " + arm);
            }
 

    }
     public static void main (String args[]){
     	              Scanner in= new Scanner(System.in);
                      System.out.println("Enter the number of times");
                      int n=in.nextInt();
               
               ArmCalculate(n);
            

     }
 }