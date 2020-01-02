package logics;

public class Books implements Category {

    double weekDayAmt;
    double saturdayAmt;
    double sundayAmt;
    @Override
    public void setWeekDayAmt(double amt) {
        weekDayAmt = amt;
    }

    @Override
    public void setSaturdayAmt(double amt) {
        saturdayAmt = amt;
    }

    @Override
    public void setSundayAmt(double amt) {
        sundayAmt = amt;
    }


    @Override
    public double getWeekDayAmt() {
        return weekDayAmt;
    }

    @Override
    public double getSaturdayAmt() {
        return  saturdayAmt;
    }

    @Override
    public double getSundayAmt() {
        return  sundayAmt;
    }

}
