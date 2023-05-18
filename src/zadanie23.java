import java.util.Scanner;

public class zadanie23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Wprowadź długość rzędu (w metrach): ");
        double rzed = input.nextDouble();

        System.out.print("Wprowadź ilość miejsca zajmowanego przez okratowanie (w metrach): ");
        double miejsce = input.nextDouble();

        System.out.print("Wprowadź odległość między sadzonkami (w metrach): ");
        double plantSpacing = input.nextDouble();

        double vineCount = (rzed - 2 * miejsce) / plantSpacing;


        System.out.println("Liczba sadzonek w rzędzie: " + vineCount);
    }
}
