/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.model;

import java.io.IOException;

/**
 *
 * @author dam
 */
public class Bicho extends Enemigo {
    
    public Bicho(int _x, int _y, String _icono, int _vida, int _velocidad) throws IOException {
        super(_x, _y, _icono, _vida, _velocidad);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
