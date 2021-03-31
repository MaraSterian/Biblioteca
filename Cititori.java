import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cititori implements Comparable {
    private String nume;
    private int id_permis;

    public Cititori(String nume, int id_permis) {
        this.nume = nume;
        this.id_permis = id_permis;
    }

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
        return "Cititor{" +
                "nume: " + nume +
                ", id_permis: " + id_permis +
                '}';
    }

    public static void main(String[] args) {
        Cititori cititor1 = new Cititori("Marin Costel", 98765);
        Cititori cititor2 = new Cititori("Deliu Anca", 98787);
        Cititori cititor3 = new Cititori("Codlea Vasile", 99852);

        List<Cititori> listaCititori = new ArrayList<>();
        listaCititori.addAll(Arrays.asList(cititor1, cititor2, cititor3));
        Collections.sort(listaCititori);
        System.out.println("Cititori: " + listaCititori);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
