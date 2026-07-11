import java.util.Scanner;
 
public class Rank{
  public static void main(String[] arg){

   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();

   int a[]=new int[n];
   int temp[]=new int[n];
   

    for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
          temp[i]=a[i];
         }

       for(int i=0;i<n-1;i++){
         for(int j=0;j<n-i-1;j++){
         
              if(temp[j]>temp[j+1]){
                 int t=temp[j];
                 temp[j]=temp[j+1];
                 temp[j+1]=t;                      
                     }                
                   }
                 }



      int rank[]=new int[n];
      for(int i=0;i<n;i++){
       int r=1;
        for(int j=0;j<n;j++){
           if(temp[j]==a[i]){
              rank[i]=r;
               break;
          }
      if(temp[j] !=temp[j+1 <n ?j+1 :j]){
        r++;
     }
   }
}
  for(int i=0;i<n;i++){
    System.out.print(rank[i] +" ");
  }
}
}

