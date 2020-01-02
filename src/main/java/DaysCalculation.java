import java.util.Calendar;

public class DaysCalculation {
    Calendar startCal;
    Calendar endCal;
    public  DaysCalculation(){
        startCal = Calendar.getInstance();
        endCal = Calendar.getInstance();
        endCal.add(Calendar.DATE,30);
    }
    public int numberOfWeekDaysInAMonth(){
        startCal = Calendar.getInstance();
        int count=0;
        while (startCal.getTimeInMillis()<=endCal.getTimeInMillis()){
            if(startCal.get(Calendar.DAY_OF_WEEK)!=Calendar.SATURDAY&&startCal.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY){
                count++;
            }
            startCal.add(Calendar.DATE,1);
        }
        return count;
    }

    public int numberOfWeekEndDaysInAMonth(){
        startCal = Calendar.getInstance();
        int count=0;
        while (startCal.getTimeInMillis()<=endCal.getTimeInMillis()){
            if(startCal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY||startCal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
                count++;
            }
            startCal.add(Calendar.DATE,1);
        }
        return count;
    }
}
