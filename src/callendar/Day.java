package callendar;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private final int day;
    private final int month;
    private final int year;
    private String toDo;


    public Day(int number, int month, int year) {
        this.day = number;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }
    public boolean hasNote(){
        return toDo!=null && !"".equals(toDo);
    }
}
