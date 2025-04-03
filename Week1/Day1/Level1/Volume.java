class Volume{
	public static void main(String [] args){
		double volume,cubicmiles;
		int radius = 6378;
		volume = (4.0/3.0) *3.14* 6378*6378*6378;
		cubicmiles = volume * 0.239335;
		System.out.println("The volume of earth in cubic kilometer is " + volume+ "and cubic miles is " + cubicmiles);
		}
}
		
		