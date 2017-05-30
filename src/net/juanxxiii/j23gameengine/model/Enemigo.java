/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.model;

/**
 *
 * @author Raquel
 */
public class Enemigo {
    private int coord_x;//Posicion inicial del  enemigo, coordenada x
    private int coord_y;//Posicion inicial del enemigo, coordenada y
    private String icono;//Imagen del enemigo
    private int vida;//Numero de vida
    private int velocidad;//Velocidad a la que se mueve
    private static final int DOLOR = 1;
    
    //Constructor
    public Enemigo(int _x, int _y, String _icono, int _vida, int _velocidad){
        this.coord_x = _x;
        this.coord_y = _y;
        this.icono = _icono;
        this.vida = _vida;
        this.velocidad = _velocidad;
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

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
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
    
    
}
