package net.juanxxiii.j23gameengine.model;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitalius Miksta
 */
public class Pollo extends Enemigo implements Runnable{

    public Pollo(int _x, int _y, String imagen, int _vida, int _velocidad) throws IOException {
        super(_x, _y, imagen, _vida, _velocidad);
    }

    @Override
    public void run() {
        while(true){
            coord_x++;
            coord_y++;
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pollo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}