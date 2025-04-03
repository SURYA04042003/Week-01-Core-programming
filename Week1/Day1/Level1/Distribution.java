class Distribution{
	public static void main(String[] args){
		int remaining,pens,students,subtract,holdingpens;
		pens= 14;
		students=3;
		remaining = 14%3;
		subtract =pens - remaining;
		holdingpens = subtract/3;
		System.out.println("The Pen per Student is " + holdingpens +"and the remainingpen not distributed is" + remaining);
		}
}	