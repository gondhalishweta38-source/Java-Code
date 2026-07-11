import java.util.Scanner;

 public class Locker{
 public static void main(String[] args){
  int pin[]=new int[4];
   int even=0;
   int sum=0;
   int repeat=0;

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 4 Digit pin : ");
   
 
 
   for(int i=0;i<4;i++){
     pin[i]=sc.nextInt();
       if(pin[i]%2==0){
        even++;
         }
        }

   for(int i=0;i<4;i++){
      for(int j=0;j<i+1;j++){
           sum=sum+pin[i];
        if(pin[i]==pin[j]){
        repeat=1;
        }
       }
     }
   


    if(even==2 && sum%3==0 && repeat==0){
       System.out.println("Locker will be open : ");
      } else{
          System.out.println("Locker will not open : ");
          }
      }
 } 
   

   