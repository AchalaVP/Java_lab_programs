import java.util.*;
class p3
{
   public static void main(String args[])
   {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      int a[] = new int[n];
      
      System.out.println("Enter array values");

      for(int i=0;i<n;i++)
      {  
         a[i]=sc.nextInt();
      }
      
      System.out.println("Enter an array index ");
      int in = sc.nextInt();
      try
      {
         System.out.println(a[in]);
      }
      catch(Exception x)
      {
         System.out.println("ArrayIndexOutofBounds");
      }
      
   }
}