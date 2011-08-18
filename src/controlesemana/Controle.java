/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <luizribeiro@gmail.com> wrote this file. As long as you retain this notice
 * you can do whatever you want with this stuff. If we meet some day, and you
 * think this stuff is worth it, you can buy me a beer in return. Luiz Ribeiro
 * ----------------------------------------------------------------------------
 */
package controlesemana;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class Controle {

    private static final String ARQUIVO_DEFAULT = "controle.csv";
    private Collection<EntradaSaida> lista;
    private String arquivo;

    public Controle(String arquivo) {
        lista = new ArrayList<EntradaSaida>();
    }

    public void load() {
        try {
            ICsvBeanReader inFile = new CsvBeanReader(new FileReader(arquivo), CsvPreference.EXCEL_PREFERENCE);
            String header[] = inFile.getCSVHeader(true);

            lista.clear();

            EntradaSaida entradaSaida;

            while ((entradaSaida = inFile.read(EntradaSaida.class, header)) != null) {
                lista.add(entradaSaida);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo " + arquivo + " não encontrado.");
        } catch (IOException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void save() {
        try {
            ICsvBeanWriter outFile = new CsvBeanWriter(new FileWriter(arquivo), CsvPreference.EXCEL_PREFERENCE);
            String header[] = new String[]{"codigo", "data", "entrada"};

            outFile.writeHeader(header);

            for (EntradaSaida entradaSaida : lista) {
                outFile.write(entradaSaida, header);
            }
        } catch (IOException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addEntradaSaida(EntradaSaida entradaSaida) {
        lista.add(entradaSaida);
    }
}
