public class zadanie19 {
    public static void main(String[] args) {
        double konsumenci=12467;
        System.out.println("przyblizona liczba osob ktore kupuja energetyka tygodniowo: " + Math.round(konsumenci*0.14)*100/100);
        System.out.println("Osoby preferujace smak cytrusowy " + Math.round(konsumenci*0.64)*100/100);
    }
}
