import java.util.Scanner;
public class zadanie20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź liczbe ciasteczek:");
        double cukier=1.5/48;
        double maslo=(double)1/48;
        double maka=2.75/48;
        int ciastka = scanner.nextInt();
        System.out.println("Potrzebujesz: " + ciastka*cukier  + " kg cukru");
        System.out.println("Potrzebujesz: " + ciastka*maslo  + " kg maki");
        System.out.println("Potrzebujesz: " + ciastka*maka  + " kg maki");


    }
}
