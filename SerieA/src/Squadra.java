public class Squadra {
    private String nome;
    private int partitegiocate;
    private int vinte;
    private int pareggiate;
    private int perse;
    private int punteggiototale;
    
    public Squadra(String nome, int partitegiocate, int vinte, int pareggiate, int perse, int punteggiototale) {
        this.nome= nome;
        this.partitegiocate= partitegiocate;
        this.vinte= vinte;
        this.pareggiate=pareggiate;
        this.perse=perse;
        this.punteggiototale=punteggiototale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPartitegiocate() {
        return partitegiocate;
    }

    public void setPartitegiocate(int partitegiocate) {
        this.partitegiocate = partitegiocate;
    }

    public int getVinte() {
        return vinte;
    }

    public void setVinte(int vinte) {
        this.vinte = vinte;
    }

    public int getPareggiate() {
        return pareggiate;
    }

    public void setPareggiate(int pareggiate) {
        this.pareggiate = pareggiate;
    }

    public int getPerse() {
        return perse;
    }

    public void setPerse(int perse) {
        this.perse = perse;
    }

    public int getPunteggiototale() {
        return punteggiototale;
    }

    public void setPunteggiototale(int punteggiototale) {
        this.punteggiototale = punteggiototale;
    }

    @Override
    public String toString() {
        return "Squadra{" + "nome=" + nome + ", partitegiocate=" + partitegiocate + ", vinte=" + vinte + ", pareggiate=" + pareggiate + ", perse=" + perse + ", punteggiototale=" + punteggiototale + '}';
    }
       
}
