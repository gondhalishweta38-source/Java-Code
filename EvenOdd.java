import java.util.Scanner;
 public class EvenOdd{
 public static void main(String[] args){
 int even=0;
 int odd=0;
  Scanner sc=new Scanner(System.in);
 
  System.out.println("Enter the Num : ");
  int n=sc.nextInt();
 
 int a[]=new int[n];
 System.out.println("Enter the the  elements : ");

 for(int i=0;i<n;i++){
  a[i]=sc.nextInt();
  }

       for(int i=0;i<n;i++){
         if(a[i] % 2==0){
             even++;
             }
             else{
               odd++;
                }
            }

System.out.println("even num is : ");
System.out.println(even);

System.out.println("Odd Num is : ");
System.out.println(odd);

}
}