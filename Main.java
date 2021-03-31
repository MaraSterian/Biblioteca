public class Main {
    public static void main(String[] args) {

        Autori autor1 = new Autori("George Calinescu", "romana");
        Autori autor2 = new Autori("Marin Preda", "romana");
        Autori autor3 = new Autori("Constantin Furtuna", "romana");
        Autori autor4 = new Autori("Chirica Gabriela", "romana");
        Carti carte1 = new Carti("Enigma Otiliei", "Corint", 50, autor1);
        Romane roman1 = new Romane("Morometii", "Litera", 45, autor2, "drama");
        Dictionare dictionar1 = new Dictionare("Dictionar roman-francez", "Steaua Nordului", 30, autor4, "franceza");
        Enciclopedii enciclopedie1 = new Enciclopedii("Atlasul Lumii", "All", 25, autor3, "geografic");
        autor1.tiparire_autori();
        carte1.tiparire_carte();
    }
}
