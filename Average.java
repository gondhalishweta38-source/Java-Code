import java.util.Scanner;

public class Average{
 public static void main(String[] args){
 int sum=0;
 double avg=0.0;

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Num of n : ");
  int n=sc.nextInt();

int a[]=new int[n];
System.out.println("Element of Array : ");

  for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
   sum=sum+a[i];
      }

   avg=sum / n;
   System.out.println("Average of Array is : ");
  System.out.println(+avg);
 
}
}
   


   