import java.util.*;
class StarPattern5
{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       
       for(int i=1; i<=n; i++)
       {
           for(int j=1; j<=i; j++)
           {
               System.out.print("*");
           }
           System.out.println();

           for(int j=n; j>=1; j--)
           {
               System.out.print("*");
           }
           System.out.println();
       } 
       s.close();
    }
}