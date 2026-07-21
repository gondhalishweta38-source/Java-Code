public class QW{
  public static void main(String[] args){
   int a[]={7,4,8,2,9};

   int max=a[0];
   int count=0;

  for(int i=0;i<a.length;i++){
     if(a[i]>=max){
      count++;
    }
  }
 System.out.println(+count);
 }
}