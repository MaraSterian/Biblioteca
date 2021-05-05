import java.util.*;

public class Sectiuni {
    private String nume;

    public Sectiuni(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    List<Carti> listaCarti = new ArrayList<>();

    @Override
    public String toString() {
        return "Sectiune " +
                "nume: " + nume ;
    }
    //public static void main(String[] args) {}
}
