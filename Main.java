import java.util.*;

public class Main {
    public static void main(String[] args) {

        //---- AUTORI ----//

        Autori autor1 = new Autori("George Calinescu", "romana");
        Autori autor2 = new Autori("Marin Preda", "romana");
        Autori autor3 = new Autori("Constantin Furtuna", "romana");
        Autori autor4 = new Autori("Chirica Gabriela", "romana");

        Map<Integer, Autori> mapAutori = new HashMap<>();
        mapAutori.put(1, autor1);
        mapAutori.put(2, autor2);
        mapAutori.put(3, autor3);
        mapAutori.put(4, autor4);
        System.out.println();
        System.out.println("Autori " + mapAutori);

        //---- SECTIUNI ----//

        Sectiuni sectiune1 = new Sectiuni("Educatie");
        Sectiuni sectiune2 = new Sectiuni("Literatura");

        Set setSectiuni = new HashSet<String>();
        setSectiuni.add(sectiune1);
        setSectiuni.add(sectiune2);
        System.out.println();
        System.out.println("Sectiuni " + setSectiuni);

        //---- CITITORI ----//

        Cititori cititor1 = new Cititori("Marin Costel", 98765);
        Cititori cititor2 = new Cititori("Deliu Anca", 98787);
        Cititori cititor3 = new Cititori("Codlea Vasile", 99852);

        List<Cititori> listaCititori = new ArrayList<>();
        listaCititori.addAll(Arrays.asList(cititor1, cititor2, cititor3));
        Collections.sort(listaCititori);
        System.out.println();
        System.out.println("Cititori " + listaCititori);

        //---- TIPARIRI ----//

        Carti carte1 = new Carti("Enigma Otiliei", "Corint", 50, autor1);
        Romane roman1 = new Romane("Morometii", "Litera", 45, autor2, "drama");
        Dictionare dictionar1 = new Dictionare("Dictionar roman-francez", "Steaua Nordului", 30, autor4, "franceza");
        Enciclopedii enciclopedie1 = new Enciclopedii("Atlasul Lumii", "All", 25, autor3, "geografic");

        autor1.tiparire_autori();
        carte1.tiparire_carte();
        dictionar1.tiparire_carte();
        roman1.tiparire_carte();
        enciclopedie1.tiparire_carte();

        //Singleton.getInstance();
    }
}
