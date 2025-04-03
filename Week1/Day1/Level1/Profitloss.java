class Profitloss{
	public static void main(String[] args){
		int profit,loss,cp,sp;
		double profitpercentage;
		cp=129;
		sp=191;
		profit = sp-cp;
		profitpercentage = profit/cp * 100;
		System.out.println("The Cost Price is INR" + cp + "and Selling Price is INR " +sp +"\nThe Profit is INR "+profit+"and the Profit Percentage is "+ profitpercentage);
	}
}