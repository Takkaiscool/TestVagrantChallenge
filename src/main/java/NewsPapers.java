public class NewsPapers implements Category {
    double weekDayAmt;
    double weekEndAmt;
    @Override
    public void setWeekDayAmt(double amt) {
        weekDayAmt = amt;
    }

    @Override
    public void setWeekEndAmt(double amt) {
        weekEndAmt = amt;
    }

    @Override
    public double getWeekDayAmt() {
        return weekDayAmt;
    }

    @Override
    public double getWeekEndAmt() {
        return weekEndAmt;
    }
}
