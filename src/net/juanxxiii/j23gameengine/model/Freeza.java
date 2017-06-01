/*
 * Enemigo de Raquel
 */
package net.juanxxiii.j23gameengine.model;

import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.juanxxiii.j23gameengine.GameEngine;

/**
 *
 * @author Raquel
 */
public class Freeza extends Enemigo implements Runnable{

    public Freeza(int _x, int _y, String imagen, int _vida, int _velocidad) throws IOException {
        super(_x, _y, imagen, _vida, _velocidad);
    }
    
    
   

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        int estado = 1;//Variable para almacenar el estado del muñeco
        while(true){
            if (estado==1){
                coord_x = coord_x + 1;
                try {
                    sleep(20);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Freeza.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (coord_x >= 680) {
                    coord_y++;
                    try {
                        sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Freeza.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else if (estado==0){
                coord_x = coord_x - 1;
            }
            
        }
    }
    
    
    
}
