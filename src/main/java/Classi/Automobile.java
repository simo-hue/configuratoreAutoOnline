package Classi;

public class Automobile {
    private String marca;
    private String modello;
    private String colore;
    private String alimentazione;
    private String cambio;
    private String prezzo;
    private String immagine;

    private Dimensione dimensione;

    public Automobile(String marca, String modello, String colore, String alimentazione, String cambio, String prezzo, String immagine) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.alimentazione = alimentazione;
        this.cambio = cambio;
        this.prezzo = prezzo;
        this.immagine = immagine;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getColore() {
        return colore;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public String getCambio() {
        return cambio;
    }

    public Dimensione getDimensione() {
        return dimensione;
    }

    public int getAltezza() {
        return dimensione.getAltezza();
    }

    public int getLarghezza() {
        return dimensione.getLarghezza();
    }

    public int getLitriBagagliaio() {
        return dimensione.getLitriBagagliaio();
    }

    public int getLunghezza() {
        return dimensione.getLunghezza();
    }

    public String getPrezzo() {
        return prezzo;
    }

    public String getImmagine() {
        return immagine;
    }
}
