public class Cititori implements Comparable {
    private String nume;
    protected int id_permis;

    public Cititori(String nume, int id_permis) {
        this.nume = nume;
        this.id_permis = id_permis;
    }

    public Cititori() {}

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getId_permis() {
        return id_permis;
    }

    public void setId_permis(int id_permis) {
        this.id_permis = id_permis;
    }

    @Override
    public String toString() {
        return "Cititor " +
                "nume: " + nume +
                " id_permis: " + id_permis ;
    }

    //public static void main(String[] args) {}

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
