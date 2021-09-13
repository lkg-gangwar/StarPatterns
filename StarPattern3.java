import java.util.*;
class StarPattern2
{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       
       for(int i=0; i<n; i++)
       {
           for(int j=5; j>0; j--)
           {
               System.out.print("* ");
           } 
           System.out.println();
       } 
       s.close();
    }
}