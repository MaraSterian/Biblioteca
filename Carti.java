public class Carti implements Tiparire {

    protected String nume;
    protected String editura;
    protected int pret;
    Autori autor;

    public Carti() {}

    public Carti(String nume, String editura, int pret, Autori autor) {
        this.nume = nume;
        this.editura = editura;
        this.pret = pret;
        this.autor = autor;
        autor.carti.add(this);
    }
    public void tiparire_carte() {
        System.out.println();
        setNume(nume);
        System.out.println("Cartea: " + getNume());
        setEditura(editura);
        System.out.println("editura: " + getEditura());
        setPret(pret);
        System.out.println("pret: " + getPret() + " RON");
        setAutor(autor);
        getAutor();
        toString();
    }

    /*@Override
    public String toString() {
        return "Carti{" +
                "nume: " + nume +
                ", editura: " + editura +
                ", pret: " + pret +
                ", autor: " + autor +
                '}';
    }*/

    @Override
    public void tiparire_autori() {}

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public Autori getAutor() {
        return autor;
    }

    public void setAutor(Autori autor) {
        this.autor = autor;
    }

}
