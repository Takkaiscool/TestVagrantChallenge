package logics;

import java.util.Calendar;

public class DaysCalculation {
   static Calendar startCal;
    static Calendar endCal;

    public static int numberOfWeekDaysInAMonth(){
        startCal = Calendar.getInstance();
        endCal = Calendar.getInstance();
        endCal.add(Calendar.DATE,30);
        int count=0;
        while (startCal.getTimeInMillis()<=endCal.getTimeInMillis()){
            if(startCal.get(Calendar.DAY_OF_WEEK)!=Calendar.SATURDAY&&startCal.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY){
                count++;
            }
            startCal.add(Calendar.DATE,1);
        }
        return count;
    }

    public static int numberOfSaturdaysInAMonth(){
        startCal = Calendar.getInstance();
        endCal = Calendar.getInstance();
        endCal.add(Calendar.DATE,30);
        int count=0;
        while (startCal.getTimeInMillis()<=endCal.getTimeInMillis()){
            if(startCal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                count++;
            }
            startCal.add(Calendar.DATE,1);
        }
        return count;
    }

    public static int numberOfSundaysInAMonth(){
        startCal = Calendar.getInstance();
        endCal = Calendar.getInstance();
        endCal.add(Calendar.DATE,30);
        int count=0;
        while (startCal.getTimeInMillis()<=endCal.getTimeInMillis()){
            if(startCal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
                count++;
            }
            startCal.add(Calendar.DATE,1);
        }
        return count;
    }
}
