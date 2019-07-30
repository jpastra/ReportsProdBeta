/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author 30047818
 */
public class ProgressB extends SwingWorker<Integer, String>
{
   private JProgressBar jpbar;
   

   //constructor
   public ProgressB(JProgressBar jpbar)
   {
      this.jpbar = jpbar;
   }


   protected Integer doInBackground() throws Exception
   {
    try{
         for(int i=0; i<=100; i++)
         {
           Thread.sleep(1000);
         }

    }
    catch(Exception e)
    {
       JOptionPane.showMessageDialog(null, "Error: " +e);
    }

    getJpbar().setVisible(false);
    return 0;
   }
    
   protected void done()
   {
       
   }
   
    public JProgressBar getJpbar()
    {
       return jpbar;
    }
}


   