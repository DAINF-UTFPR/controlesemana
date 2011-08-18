/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <luizribeiro@gmail.com> wrote this file. As long as you retain this notice
 * you can do whatever you want with this stuff. If we meet some day, and you
 * think this stuff is worth it, you can buy me a beer in return. Luiz Ribeiro
 * ----------------------------------------------------------------------------
 */
package controlesemana;

public class EntradaSaida {

    String codigo;
    long data;
    boolean entrada;

    public EntradaSaida(String codigo, long data, boolean entrada) {
        this.codigo = codigo;
        this.data = data;
        this.entrada = entrada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public boolean getEntrada() {
        // misteriosamente, o supercsv precisa desse método
        return isEntrada();
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }
}
