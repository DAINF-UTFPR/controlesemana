/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <luizribeiro@gmail.com> wrote this file. As long as you retain this notice
 * you can do whatever you want with this stuff. If we meet some day, and you
 * think this stuff is worth it, you can buy me a beer in return. Luiz Ribeiro
 * ----------------------------------------------------------------------------
 */
package controlesemana;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class Controle {

    private static final String ARQUIVO_DEFAULT = "controle.csv";
    private Collection<EntradaSaida> lista;
    private Set<Integer> dentro;
    private String arquivo;
    private static final String header[] = new String[]{"codigo", "data", "entrada"};

    public Controle(String arquivo) {
        this.arquivo = arquivo;
        lista = new ArrayList<EntradaSaida>();
        dentro = new HashSet<Integer>();
    }

    public Controle() {
        this(ARQUIVO_DEFAULT);
    }

    public void load() {
        FileReader fr;
        try {
            fr = new FileReader(arquivo);

            BufferedReader br = new BufferedReader(fr);

            lista.clear();

            String line;
            while ((line = br.readLine()) != null) {
                String cols[] = line.split(",");
                String codigo = cols[0];
                long data = Long.parseLong(cols[1]);
                boolean entrada = Boolean.parseBoolean(cols[2]);
                EntradaSaida entradaSaida = new EntradaSaida(codigo, data, entrada);

                lista.add(entradaSaida);

                if (entrada) {
                    dentro.add(new Integer(codigo));
                } else {
                    dentro.remove(new Integer(codigo));
                }
            }

            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo " + arquivo + " não encontrado.");
        } catch (IOException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void save() {
        ICsvBeanWriter outFile;
        try {
            outFile = new CsvBeanWriter(new FileWriter(arquivo), CsvPreference.STANDARD_PREFERENCE);

            for (EntradaSaida entradaSaida : lista) {
                outFile.write(entradaSaida, header);
            }

            outFile.close();
        } catch (IOException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addEntradaSaida(EntradaSaida entradaSaida) {
        lista.add(entradaSaida);
    }

    public Set<Integer> getCodigosDentroDaSala() {
        return dentro;
    }
}
