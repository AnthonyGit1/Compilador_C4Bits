package compilador;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class frmCompilador extends javax.swing.JFrame {

    String nemonicos[] = {"NOT","NAND","ADD","LDA","OUTA","OUTB","INA","RD","RA","LDRA","RB","LDRB","JPI","JPC","JPZ"};
    String ValorNemoDec[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    String ValorBin[] = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
    String operandos[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    String nemHexa = null;
    String opHexa = null;
    String nemBin = null;
    String opBin = null;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public frmCompilador() {
        initComponents();
        DefaultComboBoxModel comboN = new DefaultComboBoxModel(nemonicos);
        DefaultComboBoxModel comboO = new DefaultComboBoxModel(operandos);
        cmbNemo.setModel(comboN);
        cmbOpera.setModel(comboO);
        modelo.addColumn("Nemonico");
        modelo.addColumn("Operando");
        modelo.addColumn("Hexadecimal");
        modelo.addColumn("Binario");
        this.tblCompilador.setModel(modelo);
        calcularHexa();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompilador = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbNemo = new javax.swing.JComboBox<>();
        cmbOpera = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCrearArchivo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblHexa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBinario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreArchivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador - Java");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("COMPILADOR");

        tblCompilador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nemónico", "Operando", "Hexadecimal", "Binario"
            }
        ));
        jScrollPane1.setViewportView(tblCompilador);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Nemónico:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Operando:");

        cmbNemo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbNemo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNemoActionPerformed(evt);
            }
        });

        cmbOpera.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbOpera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOpera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperaActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCrearArchivo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnCrearArchivo.setText("Crear archivo");
        btnCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArchivoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Hexade:");

        lblHexa.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblHexa.setText("0");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Binario:");

        lblBinario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblBinario.setText("0");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Nombre del Archivo:");

        txtNombreArchivo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbNemo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbOpera, 0, 99, Short.MAX_VALUE)
                                    .addComponent(lblBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHexa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtNombreArchivo))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbNemo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbOpera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblHexa))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblBinario))
                        .addGap(31, 31, 31)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearArchivo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String [] info = new String[4];
        info[0] = (cmbNemo.getSelectedItem().toString());
        info[1] = (cmbOpera.getSelectedItem().toString());
        info[2] = (nemHexa+opHexa);
        info[3] = (nemBin+opBin);
        modelo.addRow(info);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbNemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNemoActionPerformed
        calcularHexa();
    }//GEN-LAST:event_cmbNemoActionPerformed

    private void cmbOperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperaActionPerformed
        calcularHexa();
    }//GEN-LAST:event_cmbOperaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblCompilador.getSelectedRow();
        if(fila !=-1){
            modelo.removeRow(fila);
        }else {
            JOptionPane.showMessageDialog(null, "Error. No has seleccione un registro");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArchivoActionPerformed
        if(txtNombreArchivo.getText().length() == 0 && tblCompilador.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Falta agregar el nombre del archivo y no hay datos en la tabla.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtNombreArchivo.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Falta agregar el nombre del archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }else if(tblCompilador.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }else {
            obtenerDatos_CrearBinario();
        }
    }//GEN-LAST:event_btnCrearArchivoActionPerformed
    
    public void obtenerDatos_CrearBinario() {
        int fila = tblCompilador.getRowCount();
        int i, cargarDecimal;
        try {
            OutputStream archivo = new FileOutputStream(txtNombreArchivo.getText()+".bin");
            DataOutputStream escritura = new DataOutputStream(archivo);
              
            for (i=0; i<fila; i++){
                int numero, ultimoDigito, c=0, decimal=0;
                String valor = (String) tblCompilador.getValueAt(i, 3);
                numero = Integer.parseInt(valor);
                while(numero>0) {
                    ultimoDigito = numero % 10;
                    decimal+=ultimoDigito*Math.pow(2, c);
                    c++;
                    numero/=10;
                }
                escritura.writeByte(decimal);
            }
            JOptionPane.showMessageDialog(null, "Se creo el archivo exitosamente.");
            escritura.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Error. "+ error);
        }
    }
    
    public void calcularHexa() {
        nemHexa = ValorNemoDec[cmbNemo.getSelectedIndex()];
        opHexa = operandos[cmbOpera.getSelectedIndex()];
        nemBin = ValorBin[cmbNemo.getSelectedIndex()];
        opBin = ValorBin[cmbOpera.getSelectedIndex()];
        switch(nemHexa){
            case "0":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "1":
                cmbOpera.setEnabled(true);
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "2":
                cmbOpera.setEnabled(true);
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "3":
                cmbOpera.setEnabled(true);
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "4":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "5":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "6":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "7":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "8":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "9":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "A":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;     
            case "B":
                cmbOpera.setEnabled(false);
                opHexa = "0";
                opBin = "0000";
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "C":
                cmbOpera.setEnabled(true);
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "D":
                cmbOpera.setEnabled(true);
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
            case "E":
                cmbOpera.setEnabled(true);
                lblHexa.setText(nemHexa+opHexa);
                lblBinario.setText(nemBin+opBin);
                break;
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(frmCompilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCompilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCompilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCompilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCompilador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCrearArchivo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbNemo;
    private javax.swing.JComboBox<String> cmbOpera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBinario;
    private javax.swing.JLabel lblHexa;
    private javax.swing.JTable tblCompilador;
    private javax.swing.JTextField txtNombreArchivo;
    // End of variables declaration//GEN-END:variables
}
