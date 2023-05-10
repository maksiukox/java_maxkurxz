import java.util.Scanner;
public class zadanie11 {



        public static void main(String[] args) {
            double podatekStanowy = 0.04;
            double podatekLokalny = 0.02;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Wprowadź wartość kupowanego produktu (w złotych): ");
            double wartoscProduktu = scanner.nextDouble();

            double podatekStanowyWartosc = wartoscProduktu * podatekStanowy;
            double podatekLokalnyWartosc = wartoscProduktu * podatekLokalny;
            double sumaPodatkow = podatekStanowyWartosc + podatekLokalnyWartosc;
            double cenaSprzedazy = wartoscProduktu + sumaPodatkow;

            System.out.println("Wartość produktu: " + wartoscProduktu + " zł");
            System.out.println("Podatek stanowy (" + (podatekStanowy * 100) + "%): " + podatekStanowyWartosc + " zł");
            System.out.println("Podatek lokalny (" + (podatekLokalny * 100) + "%): " + podatekLokalnyWartosc + " zł");
            System.out.println("Łączna cena sprzedaży: " + cenaSprzedazy + " zł");

    }

}
