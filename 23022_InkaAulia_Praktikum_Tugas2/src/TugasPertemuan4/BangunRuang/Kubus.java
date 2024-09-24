package TugasPertemuan4.BangunRuang;

public class Kubus extends Balok {

    public Kubus(double sisi) {
        super(sisi, sisi, sisi);  
    }

    @Override
    public double volume() {
        return panjang * panjang * panjang;  
    }

    @Override
    public double luasPermukaan() {
        return 6 * (panjang * panjang);  
    }
}
