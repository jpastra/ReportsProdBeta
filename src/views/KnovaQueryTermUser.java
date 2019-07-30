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
public class KnovaQueryTermUser extends javax.swing.JFrame {
JTable table;
ResultSet rs;
        /**
     * Creates new form KnovaQueryTermUser
     */
    public KnovaQueryTermUser() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        allUsers();
    }
    
    public void allUsers() throws SQLException
    {
        
        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_TermRevokeDeleted_Users_Report");
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_terminated.setModel(modelo);
            
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
    
    public void Jlabel_ttuser()
    {
        int tt_users = this.jt_terminated.getRowCount();
        this.jl_tt_user.setText("Total Users: "+tt_users);
    }
    
    public void TermUserW() throws SQLException
    {
        String var_winid = jtext_winid.getText();
        
        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_TermRevokeDeleted_Users_Report where UserName='"+var_winid+"'");
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_terminated.setModel(modelo);
            
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
    
    public void TermUserF() throws SQLException
    {
        
        String var_first = jtext_firstname.getText();

        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_TermRevokeDeleted_Users_Report where FirstName like '"+var_first+"'");
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_terminated.setModel(modelo);
            
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
       
    public void TermUserL() throws SQLException
    {
        
        String var_Last = jtext_lastname.getText();

        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_TermRevokeDeleted_Users_Report where LastName like '"+var_Last+"'");
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_terminated.setModel(modelo);
            
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
    public void TermUserWF() throws SQLException
    {
        String var_winid = jtext_winid.getText();
        String var_first = jtext_firstname.getText();
 
        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_TermRevokeDeleted_Users_Report where UserName ='"+var_winid+"' and FirstName='"+var_first+"'" );
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_terminated.setModel(modelo);
            
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
    
    public void TermUserWL() throws SQLException
    {
        String var_winid = jtext_winid.getText();
        String var_Last = jtext_lastname.getText();

        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_TermRevokeDeleted_Users_Report where UserName ='"+var_winid+"' and LastName='"+var_Last+"'" );
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_terminated.setModel(modelo);
            
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


    public void TermUserWFL() throws SQLException
    {
        String var_winid = jtext_winid.getText();
        String var_first = jtext_firstname.getText();
        String var_Last = jtext_lastname.getText();

        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_TermRevokeDeleted_Users_Report where UserName ='"+var_winid+"' and FirstName='"+var_first+"' and LastName='"+var_Last+"'" );
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_terminated.setModel(modelo);
            
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

    public void TermUserFL() throws SQLException
    {
        String var_first = jtext_firstname.getText();
        String var_Last = jtext_lastname.getText();

        rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_TermRevokeDeleted_Users_Report where FirstName='"+var_first+"' and LastName='"+var_Last+"'" );
        ResultSetMetaData rsmt =rs.getMetaData();
        int numCol = rsmt.getColumnCount();
        
        //crear un objeto de la tabla modelo
            DefaultTableModel modelo = new DefaultTableModel();
            this.jt_terminated.setModel(modelo);
            
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jl_winid = new javax.swing.JLabel();
        jl_name = new javax.swing.JLabel();
        jl_lastname = new javax.swing.JLabel();
        jtext_winid = new javax.swing.JTextField();
        jtext_firstname = new javax.swing.JTextField();
        jtext_lastname = new javax.swing.JTextField();
        btnConsult = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_terminated = new javax.swing.JTable();
        jl_tt_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Knova Search Terminated Users");

        jl_winid.setText("Enter User WINID:");

        jl_name.setText("Enter User First Name:");

        jl_lastname.setText("Enter User Last Name:");

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

        jt_terminated.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jt_terminated);

        jl_tt_user.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_tt_user.setText("jl_tt_user");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_tt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jl_winid)
                                                    .addComponent(jl_name)
                                                    .addComponent(jl_lastname))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtext_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtext_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtext_winid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(29, 29, 29)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_winid)
                    .addComponent(jtext_winid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_name)
                    .addComponent(jtext_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_tt_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_lastname)
                    .addComponent(jtext_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsult)
                    .addComponent(btnExport)
                    .addComponent(btnMainMenu)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Return to Main Menu");
        dispose();
        new PrincipalMenu().setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        // TODO add your handling code here:
        if(jtext_winid.getText().isEmpty() && jtext_firstname.getText().isEmpty() && jtext_lastname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter WINID or FirstName or LastName", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(jtext_winid.getText().length() > 0 && jtext_firstname.getText().isEmpty() && jtext_lastname.getText().isEmpty())
        {
            try {
                //JOptionPane.showMessageDialog(null, "prueba");
                TermUserW();
                int tt_user=this.jt_terminated.getRowCount();
                Jlabel_ttuser();
                if(tt_user == 0)
                {
                    JOptionPane.showMessageDialog(null, "No user found");
                }
                else{
                    TermUserW();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceQueryTermUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_winid.getText().isEmpty() && jtext_firstname.getText().length() > 0 && jtext_lastname.getText().isEmpty())
        {
            try {
                TermUserF();
                int tt_user=this.jt_terminated.getRowCount();
                Jlabel_ttuser();
                if(tt_user == 0)
                {
                    JOptionPane.showMessageDialog(null, "No user found");
                }
                else{
                    TermUserF();
                    Jlabel_ttuser();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(KforceQueryTermUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_winid.getText().isEmpty() && jtext_firstname.getText().isEmpty() && jtext_lastname.getText().length() > 0)
        {
            try {
                TermUserL();
                int tt_user=this.jt_terminated.getRowCount();
                Jlabel_ttuser();
                if(tt_user == 0)
                {
                    JOptionPane.showMessageDialog(null, "No user found");
                }
                else{
                    TermUserL();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceQueryTermUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_winid.getText().length() > 0 && jtext_firstname.getText().length() > 0 && jtext_lastname.getText().length() > 0)
        {
            try {
                TermUserWFL();
                int tt_user=this.jt_terminated.getRowCount();
                Jlabel_ttuser();
                if(tt_user == 0)
                {
                    JOptionPane.showMessageDialog(null, "No user found");
                }
                else{
                    TermUserWFL();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceQueryTermUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_winid.getText().length() > 0 && jtext_firstname.getText().length() > 0 && jtext_lastname.getText().isEmpty())
        {
            try {
                TermUserWF();
                int tt_user=this.jt_terminated.getRowCount();
                Jlabel_ttuser();
                if(tt_user == 0)
                {
                    JOptionPane.showMessageDialog(null, "No user found");
                }
                else{
                    TermUserWF();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceQueryTermUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_winid.getText().length() > 0 && jtext_firstname.getText().isEmpty() && jtext_lastname.getText().length() > 0)
        {
            try {
                TermUserWL();
                int tt_user=this.jt_terminated.getRowCount();
                Jlabel_ttuser();
                if(tt_user == 0)
                {
                    JOptionPane.showMessageDialog(null, "No user found");
                }
                else{
                    TermUserWL();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceQueryTermUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(jtext_winid.getText().isEmpty() && jtext_firstname.getText().length() > 0 && jtext_lastname.getText().length() > 0)
        {
            try {
                TermUserFL();
                int tt_user=this.jt_terminated.getRowCount();
                Jlabel_ttuser();
                if(tt_user == 0)
                {
                    JOptionPane.showMessageDialog(null, "No user found");
                }
                else{
                    TermUserFL();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceQueryTermUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        if(this.jt_terminated.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(null, "No Users to Export", "Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //this is a JFilter to choose where stored the file
        int totalR= jt_terminated.getRowCount();
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
            tb.add(jt_terminated);
            nom.add("Term Users Report Knova");
            String file = chooser.getSelectedFile().toString().concat(".xls");
            //here is executed the method
            try
            {
                Exporter e = new Exporter(new File(file),tb,nom);
                if(e.export())
                {
                    JOptionPane.showMessageDialog(null, "Total Records exported to Excel: " +totalR, "Term User Report", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(KnovaQueryTermUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KnovaQueryTermUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KnovaQueryTermUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnovaQueryTermUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KnovaQueryTermUser().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KnovaQueryTermUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_lastname;
    private javax.swing.JLabel jl_name;
    private javax.swing.JLabel jl_tt_user;
    private javax.swing.JLabel jl_winid;
    private javax.swing.JTable jt_terminated;
    private javax.swing.JTextField jtext_firstname;
    private javax.swing.JTextField jtext_lastname;
    private javax.swing.JTextField jtext_winid;
    // End of variables declaration//GEN-END:variables
}
