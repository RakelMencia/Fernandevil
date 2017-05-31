/*
 * Enemigo de Raquel
 */
package net.juanxxiii.j23gameengine.model;

import java.awt.image.BufferedImage;

/**
 *
 * @author Raquel
 */
public class Freeza extends Enemigo{
    
    public Freeza(int _x, int _y, BufferedImage _icono, int _vida, int _velocidad) {
        super(_x, _y, _icono, _vida, _velocidad);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
