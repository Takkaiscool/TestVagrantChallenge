package logics;

public class Subscription {

    public double monthlySubscription(double weekDaysAmt, double saturdayAmt, double sundayAmt){

        double weekDaySubscription = DaysCalculation.numberOfWeekDaysInAMonth()*weekDaysAmt;
        double saturdaySubscription = DaysCalculation.numberOfSaturdaysInAMonth()*saturdayAmt;
        double sundaySubscription = DaysCalculation.numberOfSundaysInAMonth()*sundayAmt;
        return  weekDaySubscription+saturdaySubscription+sundaySubscription;
    }
}
