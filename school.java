public class school{
 public static void main(String[] args){
 
  int a[][]={
       {60,70,80},
       {40,50,60},
        {30,40,50}
         };

   
   
   int count=0;

  for(int i=0;i<a.length;i++){
      int sum=0;
  for(int j=0;j<a[i].length;j++){
      sum=sum+a[i][j];
       }

   double avg=sum/ a[i].length;
 
    if(avg>=50){
    count++;
  }
 }


 System.out.println(count);
}
}
  
   

