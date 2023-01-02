import java.util.*;
import java.lang.*;
class p2
{     
     int sum(int a, int b)
     {
         return a+b;
     }
     
     int dif(int a, int b)
     {
         return a+b;
     }
     
     int mul(int a,int b)
     {
         return a*b;
     }
     
     int div(int a,int b)
     {
         return a/b;
     }

     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         p2 o2=new p2();
            
         System.out.println("1.Add");
         System.out.println("2.Sub");
         System.out.println("3.Multiply");
         System.out.println("4.Division");
         System.out.println("Enter choice 1/2/3/4");
         int ch = sc.nextInt();
         
         System.out.println("Enter a");
         int a= sc.nextInt();
         System.out.println("Enter a");
         int b= sc.nextInt();
         switch(ch)
         {
            case 1:
                  try{
                         int c=o2.sum(a,b);
                     }
                   catch(ArithmeticException x)
                   {
                          System.out.println("ERRUR :(");
                   }
                   break;
                   
                   
                   
            case 2:
                  try{
                         int c=o2.dif(a,b);
                     }
                   catch(ArithmeticException x)
                   {
                          System.out.println("ERRUR :(");
                   }
                   break;
            
            case 3:
                  try{
                         int c=o2.mul(a,b);
                     }
                   catch(ArithmeticException x)
                   {
                          System.out.println("ERRUR :(");
                   }
                   break;
            
            case 4:
                  try{
                         int c=o2.div(a,b);
                     }
                   catch(ArithmeticException x)
                   {
                          System.out.println("ERRUR :(");
                   }
                   break;
            
            default :
                  System.out.println("Invalid choice");

         }
            
         
     }
}