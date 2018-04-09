package Exercises;

public class TimeFormatter {
    public static int[] time = {50, 2500, 4500};
    public static String[] sth = {"sec", "mins", "hours"};

    public static void main(String[] args) {
        count(time,sth);
    }
    private static void count(int[]time, String[] sth){
        for (int i = 0; i < time.length; i++) {
            StringBuilder sb = new StringBuilder();
            int mins=0;
            int sec=0;
            int hours=0;
            int temp;
            int tempSec;
           if(time[i]/3600>=0) {
               hours = time[i] / 3600;
               temp = time[i] % 3600;
               if (temp / 60 >= 0) {
                   mins = temp / 60;
               }
               sec = temp % 60;
           }if(time[i]/60>=0){
              mins= time[i]/60;
              sec = time[i]%60;
           }else{
               sec = time[i]%60;
           }
           if(hours>0){
               sb.append(sth[2]);
               sb.append(hours);
               sb.append(",");
           }
           if(mins>0){
                sb.append(sth[1]);
                sb.append(mins);
                sb.append(",");
             }
             if(sec>0){
            sb.append(sth[0]);
            sb.append(sec);
            sb.append(",");
        }
            System.out.println(sb);






        }
    }
}
