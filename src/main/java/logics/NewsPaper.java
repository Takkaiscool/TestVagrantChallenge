package logics;

public class NewsPaper extends Books {
    String paperName;

    public NewsPaper(String paperName,double weekDayPrice,double saturdayPrice,double sundayPrice){
        this.paperName = paperName;
        setWeekDayAmt(weekDayPrice);
        setSaturdayAmt(saturdayPrice);
        setSundayAmt(sundayPrice);
    }

    public void displayMonthlySubscriptionAmt(){
        Subscription sub=new Subscription();
        System.out.println("Monthly Subscription Amount for "+paperName+" is "+sub.monthlySubscription(getWeekDayAmt(),getSaturdayAmt(),getSundayAmt()));
    }
}
