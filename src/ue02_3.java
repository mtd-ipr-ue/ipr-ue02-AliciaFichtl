import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Give me a x-coordinate: ");
        double x = In.readDouble();

        Out.println("Give me a y-coordinate: ");
        double y = In.readDouble();

        if (x > 0 && y > 0 && x < 4 && y < 4) {
            if (Math.sqrt(x * x + y * y) <=4) {
                Out.println("The coordinates are not in the green area");
            }
            else {
                Out.println("The coordinates are in the green area");
            }
        }
        else {
            Out.println("The coordinates are not in the green area :( ");
        }
    }
}
