/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.model;

import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class Devil extends Enemigo implements Runnable {

    public Devil(int _x, int _y, String imagen, int _vida, int _velocidad) throws IOException {
        super(_x, _y, imagen, _vida, _velocidad);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*public Devil(int _x, int _y, BufferedImage _icono, int _vida, int _velocidad) {
       super(_x, _y, _icono, _vida, _velocidad);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void run() {
        while(true){
            coord_x++;
            coord_y++;
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Devil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
