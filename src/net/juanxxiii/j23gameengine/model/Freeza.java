/*
 * Enemigo de Raquel
 */
package net.juanxxiii.j23gameengine.model;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author Raquel
 */
public class Freeza extends Enemigo{

    public Freeza(int _x, int _y, String imagen, int _vida, int _velocidad) throws IOException {
        super(_x, _y, imagen, _vida, _velocidad);
    }
    
   

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
