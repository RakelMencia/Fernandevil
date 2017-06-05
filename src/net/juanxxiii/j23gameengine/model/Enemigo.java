/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.model;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author Raquel
 */
public abstract class Enemigo {
    protected int coord_x;//Posicion inicial del  enemigo, coordenada x
    protected int coord_y;//Posicion inicial del enemigo, coordenada y
    protected BufferedImage imagen;//Imagen del enemigo
    protected int vida;//Numero de vida
    protected int velocidad;//Velocidad a la que se mueve
    protected static final int DOLOR = 1;
    
    //Constructor
    public Enemigo(int _x, int _y, String imagen, int _vida, int _velocidad) throws IOException{
        this.coord_x = _x;
        this.coord_y = _y;
        this.vida = _vida;
        this.velocidad = _velocidad;
        this.imagen = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/" + imagen));
    }
    //Getter y Setter

    public int getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(int coord_x) {
        this.coord_x = coord_x;
    }

    public int getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(int coord_y) {
        this.coord_y = coord_y;
    }

    public BufferedImage getIcono() {
        return imagen;
    }

    public void setIcono(BufferedImage icono) {
        this.imagen = icono;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public abstract void recibirImpacto();
    
}
    

