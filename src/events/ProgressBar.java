/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author 30047818
 */
public class ProgressBar extends Thread{
    JProgressBar jprogress_1;
    private static int delay = 50;
    
    public ProgressBar(JProgressBar jprogress_1)
    {
        this.jprogress_1 = jprogress_1;
    }
    
    
    @Override
    public void run()
    {
        jprogress_1.setVisible(true);
        int minium = jprogress_1.getMinimum();
        int maximu = jprogress_1.getMaximum();
        
        Runnable ejecutor = new Runnable() {

            @Override
            public void run() {
                int valueCurr = jprogress_1.getValue();
                jprogress_1.setValue(valueCurr + 1);
            }
        };
        
        for(int i = minium; i<maximu; i++)
        {
             try {
                    EventQueue.invokeAndWait(ejecutor);
                    Thread.sleep(delay);
                } catch (InterruptedException ex) {  } 
                  catch (InvocationTargetException ex) {  }
        }
        jprogress_1.setVisible(false);
    }
}
