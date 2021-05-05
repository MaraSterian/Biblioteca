import java.io.*;
import java.util.Arrays;
import java.util.List;

public class fisiereCsv {
    public static void main(String[] args) throws IOException {

        //----AUTORI----//
        FileWriter csvAutori = new FileWriter("textAutori.csv");

        List<List<String>> col1 = Arrays.asList(
                Arrays.asList("George Calinescu", "romana"),
                Arrays.asList("Marin Preda", "romana"),
                Arrays.asList("Constantin Furtuna", "romana"),
                Arrays.asList("Chirica Gabriela", "romana")
        );

        csvAutori.append("nume");
        csvAutori.append(",");
        csvAutori.append("nationalitate");
        csvAutori.append('\n');

        for (List<String> rowData : col1) {
            csvAutori.append(String.join(",", rowData));
            csvAutori.append("\n");
        }

        csvAutori.flush();
        csvAutori.close();

        System.out.println("gata!");

        //---- SECTIUNI ----//
        FileWriter csvSectiuni = new FileWriter("textSectiuni.csv");

        List<List<String>> col2 = Arrays.asList(
                Arrays.asList("Educatie"),
                Arrays.asList("Literatura")
        );

        csvSectiuni.append("nume");
        csvSectiuni.append('\n');

        for (List<String> rowData : col2) {
            csvSectiuni.append(String.join(",", rowData));
            csvSectiuni.append("\n");
        }

        csvSectiuni.flush();
        csvSectiuni.close();

        System.out.println("gata!");

        //---- CARTI ----//
        FileWriter csvCarti = new FileWriter("textCarti.csv");

        List<List<String>> col3 = Arrays.asList(
                Arrays.asList("Enigma Otiliei", "Corint", "50", "George Calinescu"),
                Arrays.asList("Coraline", "Arthur", "42", "Neil Gaiman"),
                Arrays.asList("Rosu si negru", "Corint", "60", "Stendhal"),
                Arrays.asList("Votca-Cola", "Curtea Veche", "20", "Irina Denejkina")
        );

        csvCarti.append("nume");
        csvCarti.append(",");
        csvCarti.append("editura");
        csvCarti.append(",");
        csvCarti.append("pret");
        csvCarti.append(",");
        csvCarti.append("autor");
        csvCarti.append('\n');

        for (List<String> rowData : col3) {
            csvCarti.append(String.join(",", rowData));
            csvCarti.append("\n");
        }

        csvCarti.flush();
        csvCarti.close();

        System.out.println("gata!");

        //---- CITITORI ----//
        FileWriter csvCititori = new FileWriter("textCititori.csv");

        List<List<String>> col4 = Arrays.asList(
                Arrays.asList("Marin Costel", "98765"),
                Arrays.asList("Deliu Anca", "98787"),
                Arrays.asList("Codlea Vasile", "99852"),
                Arrays.asList("Dumitrascu Irina", "98653")
        );

        csvCititori.append("nume");
        csvCititori.append(",");
        csvCititori.append("id_permis");
        csvCititori.append('\n');

        for (List<String> rowData : col4) {
            csvCititori.append(String.join(",", rowData));
            csvCititori.append("\n");
        }

        csvCititori.flush();
        csvCititori.close();

        System.out.println("gata!");
    }
}
