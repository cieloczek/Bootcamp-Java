package callendar;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CallendarMonth {

   private final char[] dayList = {'M', 'T', 'W', 'T', 'F','S','S'};
   private static CallendarMonth[] year = new CallendarMonth[12];
   private static String[] monthsNames = {"January", "February", "March", "April", "May", "June", "July",
           "August", "September", "October", "November", "December"};


public static CallendarMonth callendarMonth(){
    LocalDate now = LocalDate.now();
    String monthName = now.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault());
    int year = now.getYear();
    int month = now.getMonthValue();
    int numOfDays = now.getMonth().length(false);
    int startingWeekDay = LocalDate.of(year,month,1).getDayOfWeek().getValue();
    return CallendarMonth.of(monthName,year,month,numOfDays,startingWeekDay);
}


    public static CallendarMonth of(String monthName,int year, int month, int mothLength, int startingDay){
        CallendarMonth callendarMonth = new CallendarMonth(monthName);
        callendarMonth.startingDay = startingDay;
        createCallendarDays(year, month, mothLength, callendarMonth);
        return callendarMonth;
    }

    private static void createCallendarDays(int year, int month, int mothLength, CallendarMonth callendarMonth) {
        Day[] day = new Day[mothLength];
        for (int i = 0; i <mothLength ; i++) {
            day[i] = new Day(i+1,month,year);
        }
        callendarMonth.days = day;
    }

    public CallendarMonth(String monthName) {
        this.monthName = monthName;
    }

    private String monthName;
   private int startingDay;
   private int mothLength;
   private Day[] days = new Day[mothLength];

    public CallendarMonth(String monthName, Day[] days, int startingDay, int mothLength) {
        this.monthName = monthName;
        this.days=days;
        this.startingDay = startingDay;
        this.mothLength=mothLength;

    }

    public int getMothLength() {
        return mothLength;
    }

    public void setMothLength(int mothLength) {
        this.mothLength = mothLength;
    }

    public Day[] getMonth() {
        return days;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getSrartingDay() {
        return startingDay;
    }
public void setNoteForTheDay(int num, String toDo){
        days[num-1].setToDo(toDo);
}
public  String getNoteForTheDay(int num){
       return days[num-1].getToDo();
    }

public static CallendarMonth[] createYear(int currYear, int startingDay){
        CallendarMonth[] tempYear = new CallendarMonth[12];
        int monthLength=31;
        int firstDay;
    for (int i = 0; i <year.length ; i++){
            if (i % 2 == 0) {
                monthLength = 30;
                CallendarMonth month = CallendarMonth.of(monthsNames[i], currYear, i, monthLength, startingDay);
                startingDay = calculateFirstDay(startingDay, monthLength);
                tempYear[i]= month;
            } else if (i == 1) {
                monthLength = 28;
                CallendarMonth month = CallendarMonth.of(monthsNames[i], currYear, i, monthLength, startingDay);
                startingDay = calculateFirstDay(startingDay, monthLength);
                tempYear[i]= month;
            } else {
                monthLength = 31;
                CallendarMonth month = CallendarMonth.of(monthsNames[i], currYear, i, monthLength, startingDay);
                startingDay = calculateFirstDay(startingDay, monthLength);
                tempYear[i]= month;
            }

    }
    return tempYear;

}
private static int calculateFirstDay(int firstDay, int montLength){
        int x =0;
       x= montLength%7;
       x+=firstDay;
       if(x>=7){
           x%=7;
       }
       return x;
}
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getMonthName().toUpperCase());
        builder.append("\n");
        appentHorLine(builder);
        for (int i = 0; i <dayList.length ; i++)
        {
            builder.append(dayList[i]).append("   ");
        }
        builder.append("\n");
        appentHorLine(builder);

        for (int i = 0; i <startingDay-1; i++)
        {
            builder.append("    ");
        }

        for (int i = 0; i <days.length ; i++)
        {
            if((i+ startingDay-1)%7==0)
            {
                builder.append("\n");
            }
            builder.append(createCallendarDayElement(days[i] ));

        }
        builder.append("\n");
        appentHorLine(builder);

        return builder.toString();

    }

    private void appentHorLine(StringBuilder builder) {
        for (int i = 0; i <7*4; i++)
        {
            builder.append("-");
        }
        builder.append("\n");
    }


    private String createCallendarDayElement(Day day){
        String callendarDayRepresentation = "" + day.getDay();
        callendarDayRepresentation += day.hasNote() ? "*" : " ";
        callendarDayRepresentation += day.getDay() >= 10 ? " " : "  ";
        return callendarDayRepresentation;
    }

}
