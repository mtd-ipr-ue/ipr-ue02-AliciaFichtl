import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        
        Out.println("Please enter the year");
        int year = In.readInt();

        
        Out.println("Please enter the month");
        int month = In.readInt();
        

        switch (month) {
        case 1, 3, 5, 7, 8, 10, 12:
        Out.print("Month has 31 days");
        break;
        case 4, 6, 9, 11:
        Out.print("Month has 30 days");
        break;
        case 2:
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    Out.print("Month has 29 days");
                }
                Out.print("Month has 28 days");
            }
            else {
                Out.print("Month has 29 days");
            }
        }
        else {
            Out.print("Month has 28 days");
        }
        break;
        default:
        Out.println("Fehler");
    }
}
}