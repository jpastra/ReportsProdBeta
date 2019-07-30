/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import events.ProgressBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;



/**
 *
 * @author 30047818
 */
public class PrincipalMenu extends javax.swing.JFrame{
   
    private ProgressInfiniteKfStrp taskInfinite1;
    private ProgressInfiniteKnStrp taskInfinite2;
    private ProgInfinKnTermUser taskInfinite3;
    private ProgInfinKnSbuRole taskInfinite4;
    private ProgInfinKnbyUser taskInfinite5;
    private ProgInfinKfTermUser taskInfinite6;
    private ProgInfinKfSbuRole taskInfinite7;
    private ProgInfinKfbyUser taskInfinite8;
    
    /**
     * Creates new form PrincipalMenu
     */
    public PrincipalMenu() {
        initComponents();
        setLocationRelativeTo(null);
        jProgressBar.setVisible(false);
        
    }

    class ProgressInfiniteKfStrp extends SwingWorker<Void,Void>
    {
        @Override
        protected Void doInBackground() throws Exception {
            jProgressBar.setVisible(true);
            jProgressBar.setIndeterminate(true);
            KforceStandardReport kfstrp = new KforceStandardReport();
            kfstrp.setVisible(true);
            hideFrame();
            return null;
        }
        
        @Override
        public void done()
        {
            jProgressBar.setVisible(false);
        }
        
    }
    
    class ProgressInfiniteKnStrp extends SwingWorker<Void,Void>
    {
        @Override
        protected Void doInBackground() throws Exception {
            jProgressBar.setVisible(true);
            jProgressBar.setIndeterminate(true);
            KnovaStandardReport knstrp = new KnovaStandardReport();
            knstrp.setVisible(true);
            hideFrame();
            return null;
        }
        
        @Override
        public void done()
        {
            jProgressBar.setVisible(false);
        }
        
    }
    
    class ProgInfinKnTermUser extends SwingWorker<Void,Void>
    {
        @Override
        protected Void doInBackground() throws Exception {
            jProgressBar.setVisible(true);
            jProgressBar.setIndeterminate(true);
            new KnovaQueryTermUser().setVisible(true);
            hideFrame();
            return null;
        }
        
        @Override
        public void done()
        {
            jProgressBar.setVisible(false);
        }
        
    }

    class ProgInfinKnSbuRole extends SwingWorker<Void,Void>
    {
        @Override
        protected Void doInBackground() throws Exception {
            jProgressBar.setVisible(true);
            jProgressBar.setIndeterminate(true);
            new KnovaUserRptBySbu().setVisible(true);
            hideFrame();
            return null;
        }
        
        @Override
        public void done()
        {
            jProgressBar.setVisible(false);
        }
        
    }
    
    class ProgInfinKnbyUser extends SwingWorker<Void,Void>
    {
        @Override
        protected Void doInBackground() throws Exception {
            jProgressBar.setVisible(true);
            jProgressBar.setIndeterminate(true);
            new KnovaUserReportByUser().setVisible(true);
            hideFrame();
            return null;
        }
        
        @Override
        public void done()
        {
            jProgressBar.setVisible(false);
        }
        
    }

    class ProgInfinKfTermUser extends SwingWorker<Void,Void>
    {
        @Override
        protected Void doInBackground() throws Exception {
            jProgressBar.setVisible(true);
            jProgressBar.setIndeterminate(true);
            new KforceQueryTermUser().setVisible(true);
            hideFrame();
            return null;
        }
        
        @Override
        public void done()
        {
            jProgressBar.setVisible(false);
        }
        
    }
    
    class ProgInfinKfSbuRole extends SwingWorker<Void,Void>
    {
        @Override
        protected Void doInBackground() throws Exception {
            jProgressBar.setVisible(true);
            jProgressBar.setIndeterminate(true);
            new KforceUserRptBySbu().setVisible(true);
            hideFrame();
            return null;
        }
        
        @Override
        public void done()
        {
            jProgressBar.setVisible(false);
        }
        
    }
    
    class ProgInfinKfbyUser extends SwingWorker<Void,Void>
    {
        @Override
        protected Void doInBackground() throws Exception {
            jProgressBar.setVisible(true);
            jProgressBar.setIndeterminate(true);
            new KforceUserReportByUser().setVisible(true);
            hideFrame();
            return null;
        }
        
        @Override
        public void done()
        {
            jProgressBar.setVisible(false);
        }
        
    }
    
    public void hideFrame()
    {
        this.setVisible(false);
    }
    
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_kforce = new javax.swing.JMenu();
        jm_strp_kf = new javax.swing.JMenuItem();
        jm_reports = new javax.swing.JMenu();
        jmConsultUser = new javax.swing.JMenuItem();
        jmConsultSbu = new javax.swing.JMenuItem();
        jmConsultTerm = new javax.swing.JMenuItem();
        jm_knova = new javax.swing.JMenu();
        jm_strp_kn = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmConsultUserK = new javax.swing.JMenuItem();
        jmConsultSbuK = new javax.swing.JMenuItem();
        jmConsultTermK = new javax.swing.JMenuItem();
        jm_exit = new javax.swing.JMenu();
        jm_exit_out = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reports");

        jProgressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/xerox-logo-lrg.png"))); // NOI18N

        jm_kforce.setText("Kforce");

        jm_strp_kf.setText("Standard Report");
        jm_strp_kf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_strp_kfActionPerformed(evt);
            }
        });
        jm_kforce.add(jm_strp_kf);

        jm_reports.setText("User Reports");

        jmConsultUser.setText("Search by User");
        jmConsultUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultUserActionPerformed(evt);
            }
        });
        jm_reports.add(jmConsultUser);

        jmConsultSbu.setText("Search by SBU &/or Role");
        jmConsultSbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultSbuActionPerformed(evt);
            }
        });
        jm_reports.add(jmConsultSbu);

        jmConsultTerm.setText("Search Terminated Users");
        jmConsultTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultTermActionPerformed(evt);
            }
        });
        jm_reports.add(jmConsultTerm);

        jm_kforce.add(jm_reports);

        jMenuBar1.add(jm_kforce);

        jm_knova.setText("Knova");

        jm_strp_kn.setText("Standard Report");
        jm_strp_kn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_strp_knActionPerformed(evt);
            }
        });
        jm_knova.add(jm_strp_kn);

        jMenu1.setText("User Reports");

        jmConsultUserK.setText("Search by User");
        jmConsultUserK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultUserKActionPerformed(evt);
            }
        });
        jMenu1.add(jmConsultUserK);

        jmConsultSbuK.setText("Search by SBU &/or Role");
        jmConsultSbuK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultSbuKActionPerformed(evt);
            }
        });
        jMenu1.add(jmConsultSbuK);

        jmConsultTermK.setText("Search Terminated Users");
        jmConsultTermK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultTermKActionPerformed(evt);
            }
        });
        jMenu1.add(jmConsultTermK);

        jm_knova.add(jMenu1);

        jMenuBar1.add(jm_knova);

        jm_exit.setText("Exit");

        jm_exit_out.setText("Exit");
        jm_exit_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_exit_outActionPerformed(evt);
            }
        });
        jm_exit.add(jm_exit_out);

        jMenuBar1.add(jm_exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_exit_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_exit_outActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jm_exit_outActionPerformed

    
    private void jmConsultUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultUserActionPerformed

        JOptionPane.showMessageDialog(null, "Search by User selected... please wait");
        taskInfinite8 = new ProgInfinKfbyUser();
        taskInfinite8.execute(); 
        /*try {
            new KforceUserReportByUser().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);*/
    }//GEN-LAST:event_jmConsultUserActionPerformed

    private void jmConsultSbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultSbuActionPerformed
        JOptionPane.showMessageDialog(null, "Search by SBU & Role selected... please wait");
        taskInfinite7 = new ProgInfinKfSbuRole();
        taskInfinite7.execute();       
        
        /*try {
            // TODO add your handling code here:
            new KforceUserRptBySbu().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);*/
    }//GEN-LAST:event_jmConsultSbuActionPerformed

    private void jmConsultTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultTermActionPerformed
        JOptionPane.showMessageDialog(null, "Search Terminated Users selected... please wait");
        taskInfinite6 = new ProgInfinKfTermUser();
        taskInfinite6.execute();       
        /*try {
            // TODO add your handling code here:
            new KforceQueryTermUser().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);*/
    }//GEN-LAST:event_jmConsultTermActionPerformed

    private void jmConsultUserKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultUserKActionPerformed
        JOptionPane.showMessageDialog(null, "Search by User selected... please wait");
        taskInfinite5 = new ProgInfinKnbyUser();
        taskInfinite5.execute();       
        /*try {
            // TODO add your handling code here:
            new KnovaUserReportByUser().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);*/
    }//GEN-LAST:event_jmConsultUserKActionPerformed

    private void jmConsultSbuKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultSbuKActionPerformed
        JOptionPane.showMessageDialog(null, "Search by SBU & Role selected... please wait");
        taskInfinite4 = new ProgInfinKnSbuRole();
        taskInfinite4.execute();
        /*new KnovaUserRptBySbu().setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_jmConsultSbuKActionPerformed

    private void jmConsultTermKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultTermKActionPerformed
        JOptionPane.showMessageDialog(null, "Search Terminated Users selected... please wait");
        taskInfinite3 = new ProgInfinKnTermUser();
        taskInfinite3.execute();
        /*try {
            // TODO add your handling code here:
            new KnovaQueryTermUser().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);*/
    }//GEN-LAST:event_jmConsultTermKActionPerformed

    private void jm_strp_knActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_strp_knActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Knova Standard Report selected... please wait");
        taskInfinite2 = new ProgressInfiniteKnStrp();
        taskInfinite2.execute();
        //new KnovaStandardReport().setVisible(true);
        //this.setVisible(false);

    }//GEN-LAST:event_jm_strp_knActionPerformed

    private void jm_strp_kfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_strp_kfActionPerformed

        JOptionPane.showMessageDialog(null, "Kforce Standard Report selected... please wait");
        taskInfinite1 = new ProgressInfiniteKfStrp();
        taskInfinite1.execute();
        
         //new KforceStandardReport().setVisible(true);
        //this.setVisible(false);
     
    }//GEN-LAST:event_jm_strp_kfActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JMenuItem jmConsultSbu;
    private javax.swing.JMenuItem jmConsultSbuK;
    private javax.swing.JMenuItem jmConsultTerm;
    private javax.swing.JMenuItem jmConsultTermK;
    private javax.swing.JMenuItem jmConsultUser;
    private javax.swing.JMenuItem jmConsultUserK;
    private javax.swing.JMenu jm_exit;
    private javax.swing.JMenuItem jm_exit_out;
    private javax.swing.JMenu jm_kforce;
    private javax.swing.JMenu jm_knova;
    private javax.swing.JMenu jm_reports;
    private javax.swing.JMenuItem jm_strp_kf;
    private javax.swing.JMenuItem jm_strp_kn;
    // End of variables declaration//GEN-END:variables
    }
