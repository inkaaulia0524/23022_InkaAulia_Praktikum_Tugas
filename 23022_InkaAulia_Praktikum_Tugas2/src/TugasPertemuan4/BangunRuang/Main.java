package TugasPertemuan4.BangunRuang;

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok(5, 3, 2); 
        Kubus kubus = new Kubus(4);     

        System.out.println("Balok:");
        System.out.println("Volume: " + balok.volume());
        System.out.println("Luas Permukaan: " + balok.luasPermukaan());

        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.volume());
        System.out.println("Luas Permukaan: " + kubus.luasPermukaan());
    }
}
