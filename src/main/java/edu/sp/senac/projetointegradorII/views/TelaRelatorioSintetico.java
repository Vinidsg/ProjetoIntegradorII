/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.sp.senac.projetointegradorII.views;

import edu.sp.senac.projetointegradorII.DAO.TelaRelatorioSinteticoDAO;
import edu.sp.senac.projetointegradorII.model.Venda;
import edu.sp.senac.projetointegradorII.validadores.Validador;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Matheus Lima
 */
public class TelaRelatorioSintetico extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorioSintetico() {
        initComponents();
        ImageIcon img = new ImageIcon("src/main/resources/icons/musica.png");
        this.setIconImage(img.getImage());   
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JToggleButton();
        lblDe = new javax.swing.JLabel();
        lblAte = new javax.swing.JLabel();
        jdcDe = new com.toedter.calendar.JDateChooser();
        jdcAte = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatorioSintetico = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMaisDetalhes = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Sintético");

        jPanel1.setBackground(new java.awt.Color(251, 250, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnConsultar.setBackground(new java.awt.Color(234, 215, 206));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnConsultar.setText("<html> \t<font face=\"Montserrat\"> Consultar </font> </html>");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidadorRangeData(evt);
            }
        });
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblDe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendario.png"))); // NOI18N
        lblDe.setText("De:");

        lblAte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendario.png"))); // NOI18N
        lblAte.setText("Até:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcDe, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcAte, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btnConsultar)
                .addGap(293, 293, 293))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAte, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDe))
                    .addComponent(jdcDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbRelatorioSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Venda", "Cliente", "Data da Compra", "Valor da Compra"
            }
        ));
        jScrollPane1.setViewportView(tbRelatorioSintetico);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(251, 250, 248));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money-bag.png"))); // NOI18N
        jLabel1.setText("Total:");

        btnMaisDetalhes.setBackground(new java.awt.Color(234, 215, 206));
        btnMaisDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMaisDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisa.png"))); // NOI18N
        btnMaisDetalhes.setText("Mais Detalhes");
        btnMaisDetalhes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaisDetalhesMouseClicked(evt);
            }
        });
        btnMaisDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisDetalhesActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(234, 215, 206));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/casa.png"))); // NOI18N
        btnInicio.setText("Início");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio)
                .addGap(18, 18, 18)
                .addComponent(btnMaisDetalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnMaisDetalhes)
                            .addComponent(btnInicio))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTotal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
    *@author Vinicius Garcia
    * 
    *Método criado a fim de calcular a diferença entre as datas digitadas, 
    * e bloquear a emissão do relatório caso o período selecionado seja maior que 30 dias. 
    * 
    *    
    */
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        Validador validador = new Validador();
        validador.ValidarVazioJDC(jdcDe);
        validador.ValidarVazioJDC(jdcAte);
        validador.mensagem();
        
        Date d1 = jdcAte.getDate();
        Date d2 = jdcDe.getDate();
        
        long difference_In_Time = d1.getTime() - d2.getTime();
        
        long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
        
        if ((difference_In_Days + 1) <= 30) {
            JOptionPane.showMessageDialog(null, "Relatório gerado!");
            carregaTabela(jdcDe.getDate(), jdcAte.getDate());
        } else {
            JOptionPane.showMessageDialog(null, "Digite um período inferior a 30 dias!\n" + "Quantidade de dias solicitado: " + (difference_In_Days + 1));
            LimparTexto();
        }
        Totais();
    }//GEN-LAST:event_btnConsultarActionPerformed
   
    private void LimparTexto() {  
        jdcDe.setDate(null);
        jdcAte.setDate(null);
    } 
    
    private void carregaTabela(Date de, Date ate) {                                      
        // TODO add your handling code here:
       
       DefaultTableModel modelo = (DefaultTableModel) tbRelatorioSintetico.getModel();
       modelo.setRowCount(0);
       
       TableRowSorter sorter = new TableRowSorter(modelo);
       tbRelatorioSintetico.setRowSorter(sorter);
       
       tbRelatorioSintetico.getColumnModel().getColumn(0).setPreferredWidth(20);
       tbRelatorioSintetico.getColumnModel().getColumn(1).setPreferredWidth(80);
       tbRelatorioSintetico.getColumnModel().getColumn(2).setPreferredWidth(20);
       
       ArrayList<Venda> lista = TelaRelatorioSinteticoDAO.listar(de, ate);
       
       for (Venda item : lista) {            
            modelo.addRow(new String[]{String.valueOf(item.getNVenda()),
                                       String.valueOf(item.getNomeCliente()),
                                       String.valueOf(item.getDataVenda()),
                                       String.valueOf(item.getValor()),      
                                    });
        }       
    }
    
    private void btnMaisDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisDetalhesActionPerformed
        // TODO add your handling code here:

        int index = tbRelatorioSintetico.getSelectedRow();
        
        TableModel model = tbRelatorioSintetico.getModel();
        
        String nome = model.getValueAt(index, 1).toString();
        String data = model.getValueAt(index, 2).toString();
        
        TelaRelatorioAnalitico relatorio = new TelaRelatorioAnalitico();
        relatorio.setVisible(true);
        
        relatorio.txtAnaliticoNome.setText(nome);
        relatorio.txtAnaliticoData.setText(data);

    }//GEN-LAST:event_btnMaisDetalhesActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnValidadorRangeData(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidadorRangeData
        
            }//GEN-LAST:event_btnValidadorRangeData

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
        Totais();
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnMaisDetalhesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaisDetalhesMouseClicked
        // TODO add your handling code here: 
    }//GEN-LAST:event_btnMaisDetalhesMouseClicked

    private void Totais() {
        
        int Somaquant = 0;
        
        for (int i = 0; i < tbRelatorioSintetico.getRowCount(); i++) {
            Somaquant += Validador.objectToDouble(tbRelatorioSintetico.getValueAt(i, 3));
        }
        
        txtTotal.setText("" + Somaquant);
    }
    
    public void tabel() {

        initComponents();
        setBackground(new Color(0,0,0,0));

        tbRelatorioSintetico.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbRelatorioSintetico.getTableHeader().setOpaque(false);
        tbRelatorioSintetico.getTableHeader().setBackground(new Color(32,136,203));
        tbRelatorioSintetico.getTableHeader().setForeground(new Color(255,255,255));
        tbRelatorioSintetico.setRowHeight(25);
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioSintetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioSintetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioSintetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioSintetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioSintetico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConsultar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMaisDetalhes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdcAte;
    public com.toedter.calendar.JDateChooser jdcDe;
    private javax.swing.JLabel lblAte;
    private javax.swing.JLabel lblDe;
    private javax.swing.JTable tbRelatorioSintetico;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}