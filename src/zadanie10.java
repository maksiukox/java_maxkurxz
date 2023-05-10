import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {

String firstName,middleName,lastName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        firstName = scan.nextLine();
        System.out.println("Jak masz na drugie imię?");
        middleName = scan.nextLine();
        System.out.println("Jak masz na nazwisko?");
        lastName = scan.nextLine();
        char first_initial = firstName.charAt(0);
        char middle_initial = middleName.charAt(0);
        char last_initial = lastName.charAt(0);
        System.out.println("twoje inicjaly to: " + " " + first_initial +  " " + middle_initial + " " +last_initial );


    }
}