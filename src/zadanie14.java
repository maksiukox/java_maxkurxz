import java.util.Scanner;
public class zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź ocene z pierwszego testu: ");
        float ocenaA = scanner.nextFloat();
        System.out.print("Wprowadź ocene z drugiego testu: ");
        float ocenaB = scanner.nextFloat();
        System.out.print("Wprowadź ocene z trzeciego testu: ");
        float ocenaC = scanner.nextFloat();
        double srednia=(ocenaA+ocenaB+ocenaC)/3;
        System.out.print("Ocena z pierwszego testu to:  " + ocenaA + "\n");
        System.out.print("Ocena z drugiego testu to: " + ocenaB + "\n");
        System.out.print("Ocena z trzeciego testu to: " + ocenaC + "\n");
        System.out.print("Srednia ocen z testu to: " + srednia+ "\n");
    }
}
