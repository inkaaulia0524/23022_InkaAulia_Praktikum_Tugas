package TugasPertemuan4.BangunRuang;

public class Balok {
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double volume() {
        return panjang * lebar * tinggi;
    }

    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

