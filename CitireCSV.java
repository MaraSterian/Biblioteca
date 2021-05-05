import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CitireCSV {
    public static void main(String[] args)
    {
        String linie = "";
        String separator = ",";
        //---- AUTORI ----//
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("textAutori.csv"));
            while ((linie = br.readLine()) != null)
            {
                String[] autor = linie.split(separator);
                System.out.println("Autor nume = " + autor[0] + ", nationalitate = " + autor[1]);

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //---- SECTIUNI ----//
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("textSectiuni.csv"));
            while ((linie = br.readLine()) != null)
            {
                String[] sectiune = linie.split(separator);
                System.out.println("Sectiune nume = " + sectiune[0]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //---- CARTI ----//
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("textCarti.csv"));
            while ((linie = br.readLine()) != null)
            {
                String[] carte = linie.split(separator);
                System.out.println("Carte nume = " + carte[0] + ", editura = " + carte[1] + ", pret = " + carte[2] + " RON, autor = " + carte[3]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //---- CITITORI ----//
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("textCititori.csv"));
            while ((linie = br.readLine()) != null)
            {
                String[] cititor =linie.split(separator);
                System.out.println("Cititor nume = " + cititor[0] + ", id_permis = " + cititor[1]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
