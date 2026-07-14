public class Clock {
    public static void main(String[] args) {
        String str = "2:25:50 PM";

       
        int hour = Integer.parseInt(str.split(":")[0]); 
       
        if (str.contains("P") && hour != 12) {
            hour += 12;
        } else if (str.contains("A") && hour == 12) {
            hour = 0;
        }

      
        String str1 = str.substring(str.indexOf(":"));

        
        System.out.printf("24-hour format: %02d%s%n", hour, str1);
    }
}
