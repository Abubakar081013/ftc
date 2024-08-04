// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class GetSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Month Number (or 0 to exit)");
        int month = 0;
        while(scan.hasNext()){
            month = scan.nextInt();
            if(month == 0){
                break;
            }
            System.out.println(getSeason(month));
            System.out.println("Enter Month Number(or 0 to exit)");
            
        }
        
    
    }
    
    public static String getSeason(int month){
        String output = "";
         if(month == 12 || month == 1 || month == 2){
            output = "This month is in the winter season";
        }
        else if(month == 3 || month == 4 || month == 5){
            output = "This month is in spring season";
        }
         else if(month == 6 || month == 7 || month == 8){
            output = "This month is in summer season";
        }
         else if(month == 9 || month == 10 || month == 11){
            output = "This month is in fall season";
        }
        else{
            output = "That is not a valid month";
        }
        return output;
    }
}
