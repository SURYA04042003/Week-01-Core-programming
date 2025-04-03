import java.util.Scanner;
class SpringSeason{
	public static void main(String[] args){
		int month,date;
		boolean isString = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month number :");
		month = input.nextInt();
		System.out.println("Enter the date :");
		date = input.nextInt();
		switch(month) {
			case 3:
				if(date >= 20 && date <= 31)
					isString = Yes;
					break;
			case 4:
				if(date >=20 && date <= 31)
					isString =  Yes;
					break;
			case 5:
				if(date >= 20 && date <=31) 
                    isSpring = true;
                break;
            case 6:
                if (date >= 1 && date <= 20) 
                    isSpring = true;
                break;
            default:
                isSpring = false;
				 }
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}