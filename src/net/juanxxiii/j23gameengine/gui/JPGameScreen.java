/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.gui;

import gameobjects.Spaceship;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.model.Bicho;
import net.juanxxiii.j23gameengine.model.Freeza;
import net.juanxxiii.j23gameengine.util.SoundPlayer;

/**
 *
 * @author Profesor
 */
public class JPGameScreen extends javax.swing.JPanel implements Runnable {

    BufferedImage bg;//Imagen de fondo
    Spaceship nave;
    Freeza freeza;//Malo de Raquel
    Bicho bicho; //Malo de Angel

    /**
     * Creates new form JPGameScreen
     */
    public JPGameScreen() {
        initComponents();
        //Cargamos los recursos
        loadResources();
        //Hacemos que el panel sea 'focusable' para aceptar eventos
        this.setFocusable(true);
        //Creamos los listener
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //El keyboard no dispara este evento
                switch (e.getKeyCode()) {
                    case 38:
                        //Key up
                        break;
                    case 40:
                        //Key down
                        break;
                    case 39:
                        //Key right
                        break;
                    case 37:
                        //Key left
                        break;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 38:
                        //Key up
                        nave.moveUp();
                        break;
                    case 40:
                        //Key down
                        nave.moveDown();
                        break;
                    case 39:
                        //Key right
                        nave.moveRight();
                        break;
                    case 37:
                        //Key left
                        nave.moveLeft();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 38:
                        //Key up
                        nave.stop();
                        break;
                    case 40:
                        //Key down
                        nave.stop();
                        break;
                    case 39:
                        //Key right
                        nave.stop();
                        break;
                    case 37:
                        //Key left
                        nave.stop();
                        break;
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.WHITE);
        //Pinta la pantalla de blanco
        g2d.fillRect(0, 0, this.getBounds().width, this.getBounds().height);
        //Pinta el fondo
        g2d.drawImage(bg, 0, 0, null);
        //Pinta los elementos
        g2d.drawImage(nave.getNave(), nave.getxNave(), nave.getyNave(), null);
        //Pinta el malo freeza
        freeza.dibujate(g2d);
        //g2d.drawImage(freeza.getFreeza(), nave.getxFreeza(), nave.getyFreeza(), null);
        bicho.dibujate(g2d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        //Asigna el foco si es necesario
        if (requestFocusInWindow() == false) {
            setFocusable(true);
        }
        //GAME LOOP - REPINTA A 60FPS
        while (true) {
            repaint();
            try {
                sleep(16);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * Carga los recursos del videojuego
     */
    private void loadResources() {
        try {
            freeza = new Freeza(10, 10, "Freeza.png", 100, 10);
            bicho = new Bicho(80,10,"roto2.gif", 80,20);
        } catch (IOException ex) {
            Logger.getLogger(JPGameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            bg = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/bg.jpg"));
            nave = new Spaceship();
            new Thread(nave).start();
        } catch (IOException ex) {
            Logger.getLogger(JPGameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
///

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
