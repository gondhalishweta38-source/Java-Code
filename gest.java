public class gest{
 public static void main(String[] args){
  int t=2;
   int e[]={7,0,5,1,3};
   int x[]={1,2,1,3,4};
   int Cgest=0;
   
   int Mgest=0;

  for(int i=0;i<t;i++){

   
        Cgest=Cgest+e[i]-x[i];
     
  if(Cgest>Mgest){
   Mgest=Cgest;
  
}
}
 System.out.println(Mgest);
}
}
   