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
import net.juanxxiii.j23gameengine.GameEngine;

/**
 *
 * @author dam
 */
public class Bicho extends Enemigo implements Runnable {

    public Bicho(int _x, int _y, String _icono, int _vida, int _velocidad) throws IOException {
        super(_x, _y, _icono, _vida, _velocidad);
    }

    @Override
    public void recibirImpacto() {
    }

    @Override
    public void run() {
        int estado = 0;
        while (true) {

            if (estado == 0) {
                coord_x++;
                if (coord_x > GameEngine.screenWidth - 100) {
                    estado = 1;
                }
                else if (estado == 1) {
                    coord_y++;
                    if (coord_y > GameEngine.screenHeight - 220) {
                    estado = 1;
                }
                }
            }
            try {
                sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bicho.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
