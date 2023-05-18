public class zadanie22 {
    public static void main(String[] args) {
        // Dane dotyczące zakupu akcji
        int purchasedShares = 1000;
        double purchasePricePerShare = 32.87;
        double purchaseCommissionRate = 0.02;

        // Obliczenie kwoty zapłaconej za akcje
        double purchaseAmount = purchasedShares * purchasePricePerShare;

        // Obliczenie prowizji zapłaconej przy zakupie
        double purchaseCommission = purchaseAmount * purchaseCommissionRate;

        // Dane dotyczące sprzedaży akcji
        int soldShares = 1000;
        double sellingPricePerShare = 33.92;
        double sellingCommissionRate = 0.02;

        // Obliczenie kwoty otrzymanej ze sprzedaży akcji
        double sellingAmount = soldShares * sellingPricePerShare;

        // Obliczenie prowizji zapłaconej przy sprzedaży
        double sellingCommission = sellingAmount * sellingCommissionRate;

        // Obliczenie zysku lub straty
        double profit = sellingAmount - (purchaseAmount + purchaseCommission + sellingCommission);

        // Wyświetlenie wyników
        System.out.println("Kwota zapłacona za akcje: " + purchaseAmount + " zł");
        System.out.println("Wartość prowizji przy zakupie: " + purchaseCommission + " zł");
        System.out.println("Kwota otrzymana ze sprzedaży akcji: " + sellingAmount + " zł");
        System.out.println("Wartość prowizji przy sprzedaży: " + sellingCommission + " zł");
        System.out.println("Zysk ze sprzedaży akcji: " + profit + " zł");
    }
}
