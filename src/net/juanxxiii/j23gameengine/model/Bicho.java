/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.model;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class Bicho extends Enemigo implements Runnable{
    
    public Bicho(int _x, int _y, String _icono, int _vida, int _velocidad) throws IOException {
        super(_x, _y, _icono, _vida, _velocidad);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        while(true){
            coord_x++;
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bicho.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
