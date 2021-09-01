public class Pien {

    private double wysokosc;
    private double promien;

    public Pien(double wysokosc, double promien) {
        this.wysokosc = wysokosc;
        this.promien = promien;
    }

    public void zwiekszSwojRozmiar(double wspolczynnik){
        wysokosc*=wspolczynnik;
        promien*=wspolczynnik;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public double getPromien() {
        return promien;
    }
}
