package level1;

public class nullexception {
    public static void generatenullpointer(){
        String text = null;
        int length = text.length();
        System.out.println("The line have null exception ");
    }
    public static void handleNullPointer(){
        String text = null;
        try{
            int length = text.length();
            System.out.println("This line will not be executed within the try block.");
        }catch (NullPointerException e){
            System.out.println("NullPointerException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
        System.out.println("Program continues after handling the exception.");
    }
    public static void main(String[]args){
        //generatenullpointer();
        handleNullPointer();
        System.out.println("Program finished executing");
    }
}
