package homeWork1.DayOfWeek;

import homeWork1.DayOfWeek.DayOfWeek;

public class DayOfWeekMain {

    public static void main(String[] args) {

        for (DayOfWeek a : DayOfWeek.values()) {
            if(a.workingHoursLeft == 0){
                System.out.println(a + " - это выходной день!");
            } else {
                System.out.println(a + " - это день, когда до конца рабочей недели остается еще "
                        + a.workingHoursLeft + " часов");
                a.workingHoursLeft -= a.hoursToWork;
            }
        }
    }
}




