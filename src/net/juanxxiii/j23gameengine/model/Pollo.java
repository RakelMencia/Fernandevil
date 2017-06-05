package net.juanxxiii.j23gameengine.model;

import java.awt.Graphics2D;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitalius Miksta
 */
public class Pollo extends Enemigo implements Runnable,EnemigoI{

    public Pollo(int _x, int _y, String imagen, int _vida, int _velocidad) throws IOException {
        super(_x, _y, imagen, _vida, _velocidad);
    }

    @Override
    public void run() {
        while(true){
            try {
                coord_x++;
                coord_y++;
            
                if (coord_y%2==0){
                    coord_y=coord_y--;
                    sleep(100);
                }


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

    @Override
    public void dibujate(Graphics2D g2d) {
        g2d.drawImage(imagen, coord_x, coord_y, null);
    }
    
    
}