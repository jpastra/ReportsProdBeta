/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import conexion.AdminConexion;
import events.Exporter;
import java.io.File;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 30047818
 */
public class KforceStandardReport extends javax.swing.JFrame {
JTable table;
ResultSet rs;
    /**
     * Creates new form KforceStandardReport
     */
    public KforceStandardReport() {
        initComponents();
        this.cmbSbu.removeAllItems();
   
    }

    public void SbuClients() throws SQLException
    {
        rs = AdminConexion.Consult("Select distinct SBU from knova.RPT_Kforce_DocumentsInWorkflow ORDER BY SBU");
        while(rs.next())
            {
                this.cmbSbu.addItem(rs.getString("SBU"));
            }
        rs.close();
    }
    
    public void LoadSbuDocs() throws SQLException
    {
        rs = AdminConexion.Consult("Select * from knova.RPT_Kforce_DocumentsInWorkflow WHERE SBU='"+this.cmbSbu.getSelectedItem()+"' order by Documentid");
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_Docs.setModel(modelo);
            
            //add the column names
            for(int x=1; x<=numCol; x++){
                modelo.addColumn(rsmt.getColumnLabel(x));
            }
            
            //add records
            while(rs.next())
            {
                Object [] fila = new Object[numCol];
                        
                 for(int y=0; y<numCol; y++)
                 {
                    fila [y]=rs.getObject(y+1);
                 }
            
                 modelo.addRow(fila);
            }
            rs.close();
    }

    public void Jlabel_tt()
    {
        int tt_docs = this.jt_Docs.getRowCount();
        this.jl_tt_rec.setText("Total Docs: "+tt_docs);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_title_report = new javax.swing.JLabel();
        cmbSbu = new javax.swing.JComboBox();
        jl_tt_rec = new javax.swing.JLabel();
        btn_MainMenu = new javax.swing.JButton();
        btn_close_exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Docs = new javax.swing.JTable();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_title_report.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_title_report.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_title_report.setText("Standard Report - Kforce");

        cmbSbu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSbuActionPerformed(evt);
            }
        });

        jl_tt_rec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_tt_rec.setText("jt_tt_user");

        btn_MainMenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_MainMenu.setText("Main Menu");
        btn_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MainMenuActionPerformed(evt);
            }
        });

        btn_close_exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_close_exit.setText("Exit");
        btn_close_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_close_exitActionPerformed(evt);
            }
        });

        jt_Docs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_Docs);

        btnExport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExport.setText("Export Excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_title_report)
                            .addComponent(cmbSbu, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_close_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jl_tt_rec)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_title_report)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_tt_rec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MainMenu)
                    .addComponent(btn_close_exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExport)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSbuActionPerformed
        try {
            // TODO add your handling code here:
            SbuClients();
            LoadSbuDocs();
            Jlabel_tt();
            //dtform();
        } catch (SQLException ex) {
            Logger.getLogger(KforceStandardReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSbuActionPerformed

    private void btn_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainMenuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Return to Main Menu");
        dispose();
        new PrincipalMenu().setVisible(true);
    }//GEN-LAST:event_btn_MainMenuActionPerformed

    private void btn_close_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_close_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_close_exitActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        //in case the JTable is empty
        if(this.jt_Docs.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(null, "No Documents to Export", "Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //this is a JFilter to choose where stored the file
        int totalR= jt_Docs.getRowCount();
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", ".xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Saved File");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        if(chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            List<JTable> tb = new ArrayList<>();
            List<String>nom = new ArrayList<>();
            tb.add(jt_Docs);
            nom.add("Standard Report Kforce");
            String file = chooser.getSelectedFile().toString().concat(".xls");
            //here is executed the method
            try
            {
                Exporter e = new Exporter(new File(file),tb,nom);
                if(e.export())
                {
                    JOptionPane.showMessageDialog(null, "Total Records exported to Excel: " +totalR, "Standard Report", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"There was an error" + e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExportActionPerformed

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
            java.util.logging.Logger.getLogger(KforceStandardReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KforceStandardReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KforceStandardReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KforceStandardReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KforceStandardReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btn_MainMenu;
    private javax.swing.JButton btn_close_exit;
    private javax.swing.JComboBox cmbSbu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_title_report;
    private javax.swing.JLabel jl_tt_rec;
    private javax.swing.JTable jt_Docs;
    // End of variables declaration//GEN-END:variables
}