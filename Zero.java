public class Zero{
 public static void main(String[] args){
   int a[]={1,2,0,4,0,6,0};
   int n=a.length;
   int j=0;

  for(int i=0;i<n;i++){
  if(a[i] !=0){
   int temp =a[i];
    a[i]=a[j];
    a[j]=temp;
    j++;
   }
  }

   for(int i=0;i<n;i++){
  System.out.print(a[i] +" ");
  }
}
}
