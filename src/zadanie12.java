import java.util.Scanner;
public class zadanie12 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Wprowadź liczbę przejechanych kilometrów: ");
            double przejechaneKilometry = scanner.nextDouble();

            System.out.print("Wprowadź liczbę zużytych litrów paliwa: ");
            double zuzyteLitry = scanner.nextDouble();

            double kilometryNaLitr = przejechaneKilometry / zuzyteLitry;

            System.out.println("Liczba kilometrów przejechanych na litrze paliwa: " + kilometryNaLitr);

    }

}
