public class ProfitLoss {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        int profit = sp-cp; 
        double pp = profit / cp *100 ;
        System.out.println("The Cost price is INR "+cp+" and Selling Price is INR " +sp+ "\n"+"The Profit is INR "+ profit + " and Profit Percentage is"+ pp);
    }
}
