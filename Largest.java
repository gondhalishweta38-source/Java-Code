import java.util.Scanner;
public class Largest{
   public static void main(String[] args){
          
           Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Value of n : ");
            int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements of Array : ");
     
       for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
          }
         
        int largest=a[0];
        for(int i=0;i<n;i++){
            
        if(a[i]>largest){
           largest=a[i];
            }
         }
       System.out.println("Largest Num is : ");
       System.out.println(+largest);
      
   }
}

      
     
          
