public class Romane extends Carti {
    private String gen;

    public Romane(String nume, String editura, int pret, Autori autor, String gen) {
        super(nume, editura, pret, autor);
        this.gen = gen;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }
}
