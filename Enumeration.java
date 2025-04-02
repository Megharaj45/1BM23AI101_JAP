import java.util.Scanner;
public class Enumeration {
    public enum DayOfWeek{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public boolean isWorkday(){
        return (this!=SATURDAY&& this!=SUNDAY);
    }

}
    public static void main(String[]args){
     System.out.println("IS MONDAY a wokday?"+ DayOfWeek.MONDAY.isWorkday());
     System.out.println("IS SATURDAY a workday?" +DayOfWeek.SATURDAY.isWorkday());
    }
}
//
//IS MONDAY a wokday?true
//IS SATURDAY a workday?false
