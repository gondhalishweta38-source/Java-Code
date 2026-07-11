import java.util.Scanner;

public class Input{
 public static void main(String[] arg){
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter Num of n : ");
     int n=sc.nextInt();
 
    int a[]=new int[n];
      System.out.println(" Enter values of Array : ");
         for(int i=0;i<n;i++){
               a[i]=sc.nextInt();
          }

       System.out.println("Array Element are : ");
      for(int i=0;i<n;i++){
          System.out.print(+a[i] +" ");
         }
      }
   }
 