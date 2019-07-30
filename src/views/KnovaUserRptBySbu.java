/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import conexion.KnovaConexion;
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
public class KnovaUserRptBySbu extends javax.swing.JFrame {
JTable table;
ResultSet rs;
    /**
     * Creates new form KnovaUserRptBySbu
     */
    public KnovaUserRptBySbu() {
        initComponents();
        setLocationRelativeTo(null);
    try {
        allUsers();
    } catch (SQLException ex) {
        Logger.getLogger(KnovaUserRptBySbu.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public void allUsers() throws SQLException
    {
        //String var_sbu = this.jtext_sbu.getText().toString();
        
        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report");
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_sbu_data.setModel(modelo);
            
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
            Jlabel_ttuser();
    }
    
    public void SbuUsers() throws SQLException
    {
        String var_sbu = this.jtext_sbu.getText().toString();
        
        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report WHERE SBU like'%"+var_sbu+"%'");
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_sbu_data.setModel(modelo);
            
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
    
    public void UserRole() throws SQLException
   {
    String var_role=this.jtext_role.getText().toString();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where role like'%"+var_role+"%'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();

   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_sbu_data.setModel(modelo);
            
     //add the column names
     for(int x=1; x<=numCol; x++){
         modelo.addColumn(rsmtCW.getColumnLabel(x));
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
    
    public void UserSbuRole() throws SQLException
   {
    String var_sbu=this.jtext_sbu.getText().toString();
    String var_role=this.jtext_role.getText().toString();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where SBU like '%"+var_sbu+"%' and Role like '%"+var_role+"%'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();

   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_sbu_data.setModel(modelo);
            
     //add the column names
     for(int x=1; x<=numCol; x++){
         modelo.addColumn(rsmtCW.getColumnLabel(x));
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
    
    public void Jlabel_ttuser()
    {
        int tt_users = this.jt_sbu_data.getRowCount();
        this.jl_tt_user.setText("Total Users: "+tt_users);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_title = new javax.swing.JLabel();
        jl_sbu = new javax.swing.JLabel();
        jtext_sbu = new javax.swing.JTextField();
        btnConsult = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_sbu_data = new javax.swing.JTable();
        jl_role = new javax.swing.JLabel();
        jtext_role = new javax.swing.JTextField();
        jl_tt_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_title.setText("Knova Search by SBU &/or Role");

        jl_sbu.setText("Enter SBU:");

        btnConsult.setText("Search");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        btnExport.setText("Export Excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jt_sbu_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
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
        jScrollPane1.setViewportView(jt_sbu_data);

        jl_role.setText("Enter Role:");

        jl_tt_user.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_tt_user.setText("jl_tt_user");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnExport)
                                .addGap(34, 34, 34)
                                .addComponent(btnMainMenu)
                                .addGap(39, 39, 39)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_role)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jl_sbu)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtext_role, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jtext_sbu))
                                .addGap(59, 59, 59)
                                .addComponent(jl_tt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jl_title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jl_tt_user)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_role)
                            .addComponent(jtext_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_sbu)
                            .addComponent(jtext_sbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExport)
                    .addComponent(btnMainMenu)
                    .addComponent(btnExit)
                    .addComponent(btnConsult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Return to Main Menu");
        dispose();
        new PrincipalMenu().setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        // TODO add your handling code here:
        if(jtext_sbu.getText().isEmpty() && jtext_role.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "SBU or Role fields can't be Empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else if(jtext_sbu.getText().length() >0 && jtext_role.getText().isEmpty())
        {
            try {
                SbuUsers();
                int tt_users = this.jt_sbu_data.getRowCount();
                Jlabel_ttuser();
                if(tt_users == 0)
                {
                    JOptionPane.showMessageDialog(null, "This is a not recognize SBU");
                }else
                {
                    SbuUsers();
                    Jlabel_ttuser();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserRptBySbu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_sbu.getText().isEmpty() && jtext_role.getText().length() > 0)
        {
            try {
                UserRole();
                int tt_users = this.jt_sbu_data.getRowCount();
                Jlabel_ttuser();
                if(tt_users == 0)
                {
                    JOptionPane.showMessageDialog(null, "None user found for that Role");
                }else
                {
                    UserRole();
                    Jlabel_ttuser();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserRptBySbu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(jtext_sbu.getText().length() > 0 && jtext_role.getText().length() > 0)
        {
            try {
                UserSbuRole();
                int tt_users = this.jt_sbu_data.getRowCount();
                Jlabel_ttuser();
                if(tt_users == 0)
                {
                    JOptionPane.showMessageDialog(null, "None User Found");
                }else
                {
                    UserSbuRole();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserRptBySbu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        if(this.jt_sbu_data.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(null, "No Users to Export", "Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //this is a JFilter to choose where stored the file
        int totalR= jt_sbu_data.getRowCount();
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
            tb.add(jt_sbu_data);
            nom.add("SBU User Report Knova");
            String file = chooser.getSelectedFile().toString().concat(".xls");
            //here is executed the method
            try
            {
                Exporter e = new Exporter(new File(file),tb,nom);
                if(e.export())
                {
                    JOptionPane.showMessageDialog(null, "Total Records exported to Excel: " +totalR, "SBU User Report", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(KnovaUserRptBySbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KnovaUserRptBySbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KnovaUserRptBySbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnovaUserRptBySbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KnovaUserRptBySbu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_role;
    private javax.swing.JLabel jl_sbu;
    private javax.swing.JLabel jl_title;
    private javax.swing.JLabel jl_tt_user;
    private javax.swing.JTable jt_sbu_data;
    private javax.swing.JTextField jtext_role;
    private javax.swing.JTextField jtext_sbu;
    // End of variables declaration//GEN-END:variables
}
