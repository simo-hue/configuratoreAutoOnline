
package Classi;
import Classi.Persona;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto di tipo Persona
        Persona p = new Persona("nome", "cognome", "codiceFiscale", "email", 123456789, "italia");
        // Stampa delle informazioni della persona
        System.out.println(p.toString());
        
    }
}
