public class Copy{
 public static void main(String[] args){
  int a[]={1,2,3,4};
  int n=a.length;
  int b[]=new int[n];


  for(int i=0;i<a.length;i++){
   b[i]=a[i];
   }
 for(int i=0;i<a.length;i++){
 System.out.print(+b[i] +" ");
  }
 }
}