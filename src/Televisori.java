public class Televisori extends Prodotto {
    int dimensioni;
    boolean smart;

    public Televisori (int codice, String nome, String marca, float prezzo, float iva, int dimensioni, boolean smart){
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }
}