/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.model;

import java.awt.image.BufferedImage;

/**
 *
 * @author dam
 */
public class Devil extends Enemigo{

    public Devil(int _x, int _y, BufferedImage _icono, int _vida, int _velocidad) {
        super(_x, _y, _icono, _vida, _velocidad);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
