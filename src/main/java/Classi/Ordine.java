package Classi;

public class Ordine {
    private int id;
    private String data;
    private String stato;
    private Configurazione configurazione;
    private Utente utente;

    public Ordine(int id, String data, String stato, Configurazione configurazione, Utente utente) {
        this.id = id;
        this.data = data;
        this.stato = stato;
        this.configurazione = configurazione;
        this.utente = utente;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getStato() {
        return stato;
    }

    public Configurazione getConfigurazione() {
        return configurazione;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public void setConfigurazione(Configurazione configurazione) {
        this.configurazione = configurazione;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public String toString() {
        return "Ordine: " + id + ", " + data + ", " + stato + ", " + configurazione.toString() + ", " + utente.toString();
    }

    public void setStatoInConsegna() {
        this.stato = "In consegna";
    }

    public void setStatoConsegnato() {
        this.stato = "Consegnato";
    }

    public void setStatoAnnullato() {
        this.stato = "Annullato";
    }

    public void setStatoInPreparazione() {
        this.stato = "In preparazione";
    }

    public void setStatoInAttesa() {
        this.stato = "In attesa";
    }

    public void setStatoPagato() {
        this.stato = "Pagato";
    }

    public void setStatoInElaborazione() {
        this.stato = "In elaborazione";
    }

    public void setStatoInSospeso() {
        this.stato = "In sospeso";
    }

    public void setStatoInLavorazione() {
        this.stato = "In lavorazione";
    }   
}
