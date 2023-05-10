import java.util.Scanner;
public class zadanie8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dlugosc  pierwszego pokoju");
        float dlugosc = scan.nextFloat();




        System.out.println("Podaj szerokosc  pierwszego pokoju");
        float szerokosc = scan.nextFloat();
        System.out.println("wymiary pokoju pierwszego to: " + dlugosc*szerokosc+ "m");



        System.out.println("Podaj dlugosc  drugiego pokoju");
        float dlugosc_2 = scan.nextFloat();




        System.out.println("Podaj szerokosc  drugiego pokoju");
        float szerokosc_2 = scan.nextFloat();
        System.out.println("wymiary drugiego pokoju to: " + dlugosc_2*szerokosc_2 + "m");
    }
}
