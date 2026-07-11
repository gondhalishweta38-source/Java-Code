import java.util.Scanner;
public class Largest2{
   public static void main(String[] args){
          
           Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Value of n : ");
            int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements of Array : ");
     
       for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
          }
         
        int largest=Integer.MIN_VALUE;
        int largest2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
        if(a[i]>largest){
           largest=a[i];
            }

        else if(a[i]>largest2 && largest2 != largest){
            largest2=a[i];
         }
        }

        
       System.out.println("Largest Num is : ");
         System.out.println(+largest);

      System.out.println("2 Largest Num is : ");
       System.out.println(+largest2);
      
   }
}

      
     
          
