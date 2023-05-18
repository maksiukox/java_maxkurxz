import java.util.Scanner;
public class zadanie21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Wprowadzenie danych wejściowych
        System.out.print("Wprowadź kwotę początkową: ");
        double principal = input.nextDouble();

        System.out.print("Wprowadź roczną stopę oprocentowania (w formacie dziesiętnym): ");
        double interestRate = input.nextDouble();

        System.out.print("Wprowadź liczbę kapitalizacji odsetek w ciągu roku: ");
        int compoundFrequency = input.nextInt();

        System.out.print("Wprowadź liczbę lat: ");
        int years = input.nextInt();

        input.close();

        // Obliczenie stanu konta
        double amount = principal * Math.pow(1 + (interestRate / compoundFrequency), compoundFrequency * years);

        // Wyświetlenie wyniku
        System.out.println("Kwota na koncie po " + years + " latach: " + amount);
    }
}
