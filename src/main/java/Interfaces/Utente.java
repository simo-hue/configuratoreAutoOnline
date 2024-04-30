package Interfaces;

import Classi.Configurazione;

public interface Utente {
    String username = "";
    String password = "";
    int permessi = 0;
    int idOrdine = 0;
    Configurazione bozzaOrdine = null;

    void login(String username, String password);
}
