import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {

        Out.println("Please enter first number");
        int firstNumber = In.readInt();

        Out.println("Please enter second number");
        int secondNumber = In.readInt();

        Out.println("Please enter third number");
        int thirdNumber = In.readInt();

        int max = thirdNumber;

        if (firstNumber > max) {
        max = firstNumber;
        }

        if (secondNumber > max){
        max = secondNumber;
        }

        Out.println("Maximum: ");
        Out.println(max);
    }
}
