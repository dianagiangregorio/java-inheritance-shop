public class Smartphone extends Prodotto{
    String imei;
    int memoria;

    public Smartphone(int codice, String nome, String marca, float prezzo, float iva, String imei, int memoria){
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

}
