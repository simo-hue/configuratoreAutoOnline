package Classi;

public class Dimensione {
    private int lunghezza;
    private int larghezza;
    private int altezza;

    private int litriBagagliaio;

    public Dimensione(int lunghezza, int larghezza, int altezza, int litriBagagliaio) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.litriBagagliaio = litriBagagliaio;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLitriBagagliaio() {
        return litriBagagliaio;
    }
}
