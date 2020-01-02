import logics.NewsPaper;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("Kindly enter the news paper required for subscription by comma separated values");
        Scanner sc = new Scanner(System.in);
        NewsPaper newsPaper;
        String userInput = sc.nextLine();
        String []list_of_papers=userInput.split(",");
        for(String paper : list_of_papers){
            switch (paper.toUpperCase()){
                case "TOI": newsPaper = new NewsPaper(paper,3,5,6);
                            newsPaper.displayMonthlySubscriptionAmt();
                    break;
                case "HINDU":newsPaper = new NewsPaper(paper,2.5,4,4);
                    newsPaper.displayMonthlySubscriptionAmt();
                    break;
                case "ET":newsPaper = new NewsPaper(paper,2,2,10);
                    newsPaper.displayMonthlySubscriptionAmt();
                    break;
                case "BM":newsPaper = new NewsPaper(paper,1.5,1.5,1.5);
                    newsPaper.displayMonthlySubscriptionAmt();
                    break;
                case "HT":newsPaper = new NewsPaper(paper,2,4,4);
                    newsPaper.displayMonthlySubscriptionAmt();
                    break;
                default:
                    System.out.println("Entered paper "+paper+" doesnt in the list");
            }
        }
    }
}
