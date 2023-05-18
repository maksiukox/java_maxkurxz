public class zadanie18 {
    public static void main(String[] args) {
        double akcje=21.77*600;
        double prowizja=akcje*0.02;
        double suma=akcje+prowizja;
        System.out.println("Cena akcji bez prowizji: " + akcje + " zl");
        System.out.println("Cena prowizji: " + prowizja + " zl");
        System.out.println("Cena laczna: " + suma + " zl");
    }
}
