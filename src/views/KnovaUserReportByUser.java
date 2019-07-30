/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;
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
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 30047818
 */
public class KnovaUserReportByUser extends javax.swing.JFrame {
JTable table;
ResultSet rs;
    /**
     * Creates new form KnovaUserReportByUser
     */
    public KnovaUserReportByUser() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        allUsers();
    }

    public void allUsers() throws SQLException{
    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();

   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_user_data.setModel(modelo);
            
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
         Jlabel_ttuser();

    }
    
    public void UserDataWinid() throws SQLException
   {
    String var_winid=this.jtext_winid.getText();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where username='"+var_winid+"'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();

   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_user_data.setModel(modelo);
            
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
    
    public void UserDataFirstName() throws SQLException
   {
    String var_firstname=this.jtext_firstname.getText();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where firstname='"+var_firstname+"'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();

   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_user_data.setModel(modelo);
            
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
    
    public void UserDataLastName() throws SQLException
   {
    String var_lastname=this.jtext_lastname.getText();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where lastname like '"+var_lastname+"'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();
    
   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_user_data.setModel(modelo);
            
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
    
    public void UserDataWFL() throws SQLException
   {
    String var_winid=this.jtext_winid.getText();
    String var_first=this.jtext_firstname.getText();
    String var_last=this.jtext_lastname.getText();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where username='"+var_winid+"' and firstname='"+var_first+"' and lastname='"+var_last+"'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();
    
   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_user_data.setModel(modelo);
            
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
    
    public void UserDataWF() throws SQLException
   {
    String var_winid=this.jtext_winid.getText();
    String var_first=this.jtext_firstname.getText();
    String var_last=this.jtext_lastname.getText();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where username='"+var_winid+"' and firstname='"+var_first+"'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();
    
   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_user_data.setModel(modelo);
            
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
    
    public void UserDataWL() throws SQLException
   {
    String var_winid=this.jtext_winid.getText();
    String var_first=this.jtext_firstname.getText();
    String var_last=this.jtext_lastname.getText();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where username='"+var_winid+"' and lastname='"+var_last+"'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();
    
   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_user_data.setModel(modelo);
            
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
    
    public void UserDataFL() throws SQLException
   {
    String var_winid=this.jtext_winid.getText();
    String var_first=this.jtext_firstname.getText();
    String var_last=this.jtext_lastname.getText();

    rs = KnovaConexion.Consult("Select * from dbo.RPT_KNOVA_Users_Report where firstname='"+var_winid+"' and lastname='"+var_last+"'");
    ResultSetMetaData rsmtCW = rs.getMetaData();
    int numCol = rsmtCW.getColumnCount();
    
   //crear un objeto de la tabla modelo
    DefaultTableModel modelo = new DefaultTableModel();
    this.jt_user_data.setModel(modelo);
            
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
        int tt_users = this.jt_user_data.getRowCount();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jl_title = new javax.swing.JLabel();
        jl_winid = new javax.swing.JLabel();
        jl_name = new javax.swing.JLabel();
        jl_lastname = new javax.swing.JLabel();
        btnConsult = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jtext_winid = new javax.swing.JTextField();
        jtext_firstname = new javax.swing.JTextField();
        jtext_lastname = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_user_data = new javax.swing.JTable();
        jl_tt_user = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_title.setText("Knova Search by User");

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

        jt_user_data.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jt_user_data);

        jl_tt_user.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_tt_user.setText("jl_tt_user");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_winid)
                            .addComponent(jl_name))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtext_lastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jtext_winid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtext_firstname, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(104, 104, 104)
                        .addComponent(jl_tt_user)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(btnConsult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jl_lastname, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(40, 40, 40)
                                        .addComponent(btnExport)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jl_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_winid)
                    .addComponent(jtext_winid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_name)
                    .addComponent(jtext_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_tt_user))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_lastname)
                    .addComponent(jtext_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsult)
                    .addComponent(btnExport)
                    .addComponent(btnMainMenu)
                    .addComponent(btnExit))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Return to Main Manu");
        dispose();
        new PrincipalMenu().setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        // TODO add your handling code here:
        if(jtext_winid.getText().isEmpty() && jtext_firstname.getText().isEmpty() && jtext_lastname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter WINID or First Name or Last Name", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(jtext_winid.getText().length() > 0 && jtext_firstname.getText().isEmpty() && jtext_lastname.getText().isEmpty())
        {
            try {
                UserDataWinid();
                int tt_user2 = this.jt_user_data.getRowCount();
                Jlabel_ttuser();
                if (tt_user2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "User not found");
                }else{
                    UserDataWinid();
                    Jlabel_ttuser();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserReportByUser.class.getName()).log(Level.SEVERE, null, ex);
            }
                   
        }else if(jtext_winid.getText().isEmpty() && jtext_firstname.getText().length() > 0 && jtext_lastname.getText().isEmpty())
        {
            try {
                UserDataFirstName();
                int tt_user2 = this.jt_user_data.getRowCount();
                Jlabel_ttuser();
                if (tt_user2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "User not found");
                }else{
                    UserDataFirstName();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserReportByUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(jtext_winid.getText().isEmpty() && jtext_firstname.getText().isEmpty() && jtext_lastname.getText().length() > 0)
        {
            try {
                UserDataLastName();
                int tt_user2 = this.jt_user_data.getRowCount();
                Jlabel_ttuser();
                if (tt_user2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "User not found");
                }else{
                    UserDataLastName();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserReportByUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(jtext_winid.getText().length() > 0 && jtext_firstname.getText().length() > 0 && jtext_lastname.getText().length() > 0)
        {
            try {
                UserDataWFL();
                int tt_user2 = this.jt_user_data.getRowCount();
                Jlabel_ttuser();
                if (tt_user2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "User not found");
                }else{
                    UserDataWFL();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserReportByUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_winid.getText().length() > 0 && jtext_firstname.getText().length() > 0 && jtext_lastname.getText().isEmpty())
        {
            try {
                UserDataWF();
                int tt_user2 = this.jt_user_data.getRowCount();
                Jlabel_ttuser();
                if (tt_user2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "User not found");
                }else{
                    UserDataWF();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserReportByUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_winid.getText().length() > 0 && jtext_firstname.getText().isEmpty() && jtext_lastname.getText().length() > 0)
        {
            try {
                UserDataWL();
                int tt_user2 = this.jt_user_data.getRowCount();
                Jlabel_ttuser();
                if (tt_user2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "User not found");
                }else{
                    UserDataWL();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserReportByUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jtext_winid.getText().isEmpty() && jtext_firstname.getText().length() > 0 && jtext_lastname.getText().length() > 0)
        {
            try {
                UserDataFL();
                int tt_user2 = this.jt_user_data.getRowCount();
                Jlabel_ttuser();
                if (tt_user2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "User not found");
                }else{
                    UserDataFL();
                    Jlabel_ttuser();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KforceUserReportByUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        if(this.jt_user_data.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(null, "No Users to Export", "Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //this is a JFilter to choose where stored the file
        int totalR= jt_user_data.getRowCount();
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
            tb.add(jt_user_data);
            nom.add("User Report Knova");
            String file = chooser.getSelectedFile().toString().concat(".xls");
            //here is executed the method
            try
            {
                Exporter e = new Exporter(new File(file),tb,nom);
                if(e.export())
                {
                    JOptionPane.showMessageDialog(null, "Total Records exported to Excel: " +totalR, "User Report", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(KnovaUserReportByUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KnovaUserReportByUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KnovaUserReportByUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnovaUserReportByUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KnovaUserReportByUser().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KnovaUserReportByUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jl_lastname;
    private javax.swing.JLabel jl_name;
    private javax.swing.JLabel jl_title;
    private javax.swing.JLabel jl_tt_user;
    private javax.swing.JLabel jl_winid;
    private javax.swing.JTable jt_user_data;
    private javax.swing.JTextField jtext_firstname;
    private javax.swing.JTextField jtext_lastname;
    private javax.swing.JTextField jtext_winid;
    // End of variables declaration//GEN-END:variables
}
