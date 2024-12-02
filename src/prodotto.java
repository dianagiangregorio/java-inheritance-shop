public class Prodotto {
    private int codice;
    public String nome;
    public String marca;
    public float prezzo;
    public float iva;

    // costruttore
    public Prodotto(int codice, String nome, String marca, float prezzo, float iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getter and setter
    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public float getIva() {
        return this.iva;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    // metodo per il prezzo base
    public float prezzoBase() {
        return this.prezzo;
    }

    // metodo per prezzo ivato
    public float prezzoIvato() {
        return this.prezzo + (this.prezzo * this.iva);
    }
}
