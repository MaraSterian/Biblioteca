import java.util.ArrayList;
import java.util.List;
public class Autori implements Tiparire {

    private String nume;
    private String nationalitate;
    protected List<Carti> carti = new ArrayList<>();

    public Autori(String nume, String nationalitate) {
        this.nume = nume;
        this.nationalitate = nationalitate;
    }

    @Override
    public void tiparire_carte() {}

    public void tiparire_autori() {
        System.out.println();
        setNume(nume);
        System.out.println("Autorul: " + getNume());
        setNationalitate(nationalitate);
        System.out.println("nationalitate: " + getNationalitate());
        toString();
    }

    @Override
    public String toString() {
        return " Autor " +
                "nume: " + nume + " - " +
                "nationalitate: " + nationalitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNationalitate() {
        return nationalitate;
    }

    public void setNationalitate(String nationalitate) {
        this.nationalitate = nationalitate;
    }

    public List<Carti> getCarti() {
        return carti;
    }

}
