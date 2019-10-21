import java.util.Scanner;
public class FibonacciSeries{

  static void fibonacciCalculate(int num){


                  int a=0,b=0,c=1;
          
                      System.out.println("Fibonacci series of the number-");
                      for(int i=0;i<=num;i++)

                      {
                          
                            a=b;
                            b=c;
                            c=a+b;
                           System.out.print(a + " ");


                      }

                        // System.out.println("Sum = "+c);


           }
 public static void main (String args[]){
                     int num;
                     Scanner in= new Scanner(System.in);
                      System.out.println("Enter the number of times");
                      num=in.nextInt();

                      fibonacciCalculate(num);
                    }


}