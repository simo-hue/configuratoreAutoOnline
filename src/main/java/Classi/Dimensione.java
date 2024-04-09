package Classi;

public class Dimensione {
    private double lunghezza;
    private double larghezza;
    private double altezza;

    private int litriBagagliaio;

    public Dimensione(double lunghezza, double larghezza, double altezza, int litriBagagliaio) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.litriBagagliaio = litriBagagliaio;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public int getLitriBagagliaio() {
        return litriBagagliaio;
    }
}
