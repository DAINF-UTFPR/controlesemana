/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <luizribeiro@gmail.com> wrote this file. As long as you retain this notice
 * you can do whatever you want with this stuff. If we meet some day, and you
 * think this stuff is worth it, you can buy me a beer in return. Luiz Ribeiro
 * ----------------------------------------------------------------------------
 */
package controlesemana;

import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GUIWindow extends javax.swing.JFrame {

    protected boolean stateEntrada;
    protected Controle controle;

    /** Creates new form GUIWindow */
    public GUIWindow() {
        initComponents();
        stateEntrada = true;
        controle = new Controle();
        controle.load();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelControleEntrada = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        panelControle = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField(128);
        buttonEntradaSaida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelInformacoes = new javax.swing.JPanel();
        scrollPaneDentro = new javax.swing.JScrollPane();
        tableDentro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.black);

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));
        panelHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlesemana/resources/logo.png"))); // NOI18N

        labelControleEntrada.setFont(new java.awt.Font("Arial", 1, 24));
        labelControleEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelControleEntrada.setText("Controle de Entrada");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo)
                .addGap(18, 18, 18)
                .addComponent(labelControleEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelControleEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.setFocusable(false);

        labelCodigo.setText("Código");

        textFieldCodigo.setColumns(128);
        textFieldCodigo.setMinimumSize(new java.awt.Dimension(128, 19));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        textFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldCodigoKeyPressed(evt);
            }
        });

        buttonEntradaSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlesemana/resources/entrada.png"))); // NOI18N
        buttonEntradaSaida.setFocusable(false);
        buttonEntradaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntradaSaidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTRADA");

        javax.swing.GroupLayout panelControleLayout = new javax.swing.GroupLayout(panelControle);
        panelControle.setLayout(panelControleLayout);
        panelControleLayout.setHorizontalGroup(
            panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCodigo)
                    .addComponent(buttonEntradaSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addComponent(textFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelControleLayout.setVerticalGroup(
            panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigo))
                .addGap(18, 18, 18)
                .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(buttonEntradaSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Controle", panelControle);

        panelInformacoes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelInformacoesComponentShown(evt);
            }
        });

        scrollPaneDentro.setFocusable(false);

        tableDentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cód. Matrícula", "Entrou em"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneDentro.setViewportView(tableDentro);

        javax.swing.GroupLayout panelInformacoesLayout = new javax.swing.GroupLayout(panelInformacoes);
        panelInformacoes.setLayout(panelInformacoesLayout);
        panelInformacoesLayout.setHorizontalGroup(
            panelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneDentro, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInformacoesLayout.setVerticalGroup(
            panelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneDentro, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("Informações", panelInformacoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
    if (textFieldCodigo.getText().matches("^[0-9]+$")) {
        String codigo = textFieldCodigo.getText();
        EntradaSaida entradaSaida = new EntradaSaida(codigo, System.currentTimeMillis(), stateEntrada);
        boolean dentro = controle.getCodigosDentroDaSala().contains(new Integer(codigo));

        if (stateEntrada ^ dentro) {
            System.out.println(codigo + " está " + (stateEntrada ? "entrando" : "saindo"));
            controle.addEntradaSaida(entradaSaida);
            controle.save();
        } else {
            System.err.println("ERRO! " + codigo + " já estava " + (stateEntrada ? "dentro" : "fora") + " da sala!");
        }
    }
    textFieldCodigo.setText("");
}//GEN-LAST:event_textFieldCodigoActionPerformed

private void buttonEntradaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntradaSaidaActionPerformed
    if (stateEntrada) {
        buttonEntradaSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlesemana/resources/saida.png")));
        jLabel1.setText("SAÍDA");
        stateEntrada = false;
    } else {
        buttonEntradaSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlesemana/resources/entrada.png")));
        jLabel1.setText("ENTRADA");
        stateEntrada = true;
    }
}//GEN-LAST:event_buttonEntradaSaidaActionPerformed

private void textFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCodigoKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        buttonEntradaSaidaActionPerformed(null);
    }
}//GEN-LAST:event_textFieldCodigoKeyPressed

private void panelInformacoesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelInformacoesComponentShown
    Set<Integer> dentro = controle.getCodigosDentroDaSala();
    Map<Integer, Long> datasEntrada = controle.getDatasDeEntrada();
    DefaultTableModel model = (DefaultTableModel) tableDentro.getModel();

    model.setRowCount(0);

    int i = 1;
    for (Integer codigo : dentro) {
        String data = new java.text.SimpleDateFormat("HH:mm:ss (dd/MM/yyyy)").format(new java.util.Date(datasEntrada.get(codigo)));
        model.addRow(new Object[]{i, codigo.toString(), data});
        i++;
    }
}//GEN-LAST:event_panelInformacoesComponentShown
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntradaSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelControleEntrada;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel panelControle;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelInformacoes;
    private javax.swing.JScrollPane scrollPaneDentro;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tableDentro;
    private javax.swing.JTextField textFieldCodigo;
    // End of variables declaration//GEN-END:variables
}
