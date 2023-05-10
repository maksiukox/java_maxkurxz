public class zadanie7 {

        public static void main(String[] args) {
            double calkowitaSprzedaz = 4.6e6; // całkowita sprzedaż w złotych
            double procentMazowiecki = 0.62; // procent sprzedaży generowany przez region mazowiecki

            double sprzedazMazowiecki = calkowitaSprzedaz * procentMazowiecki;

            System.out.println("Szacowana sprzedaż generowana przez region mazowiecki: " + sprzedazMazowiecki + " zł");

    }
}
