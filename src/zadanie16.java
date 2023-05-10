import java.util.Scanner;
public class zadanie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź nazwe ulubionego miasta:");
        String nazwaMiasta = scanner.nextLine();
        System.out.println("dlugosc znakow to: " + nazwaMiasta.replace(" ", "").length() + " " + " nazwa miasta zapisana duzymi literami: " + nazwaMiasta.toUpperCase()  + " nazwa miasta zapisana małymi literami: "+nazwaMiasta.toLowerCase());
    }

}
