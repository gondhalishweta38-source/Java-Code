public class Sign{
 public static void main(String[] args){
  String str="###***";
  int count1=0;
  int count2=0;

for(int i=0;i<str.length();i++){
 char ch =str.charAt(i);
  
    if(ch== '#'){
    count1++;
     }
    else if (ch == '*') {
     count2++;
      }
  }

  if(count1>count2){
   System.out.println("Positive");
}
else if(count2>count1){
  System.out.println("Negative");
 }

if(count1==count2){
 System.out.println("0");
}
}
}
   