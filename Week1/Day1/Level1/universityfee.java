class universityfee{
	public static void main(String [] args){
		int fee = 125000,discountPercent= 10,discount,totalfee;
		discount = (fee * discountPercent)/100;
		totalfee = fee - discount;
		System.out.println("The discount amount is INR  " + discount +"and final discount fee is  INR " + totalfee);
		}
}	