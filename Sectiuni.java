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

    public static void main(String[] args) {
        Sectiuni sectiune1 = new Sectiuni("Educatie");
        Sectiuni sectiune2 = new Sectiuni("Literatura");
        Set setSectiuni = new HashSet<String>();

        setSectiuni.add(sectiune1);
        setSectiuni.add(sectiune2);

        System.out.println(setSectiuni);
    }
}
