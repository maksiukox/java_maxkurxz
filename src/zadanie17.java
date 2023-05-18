import java.util.Scanner;
public class zadanie17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź cene posilku:");
        float posilek = scanner.nextFloat();
        System.out.println("Cena posilku: " + posilek + " zl");
      double podatek = posilek*0.065;
        System.out.println("Podatek: " + podatek + " zl");
        double napiwek=(posilek+podatek)*0.20;
        System.out.println("napiwek: " + napiwek + " zl");
        double suma=podatek+napiwek+posilek;
        System.out.println("Laczna kwota do zaplaty: " + suma + " zl");

    }
}
