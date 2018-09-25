/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author 160011
 */
public abstract class Base 
{
    protected double x = 0;
    protected double y = 0;
    protected double incX = 1;
    protected double incY = 1;
    protected int tamanho;
    protected int pontosVida;
    protected Rectangle rect;
    protected ImageIcon img;

    public Base() {
    }
    
    public Base(String url) 
    {
        img = new ImageIcon(this.getClass().getResource("/").getPath() + url);
        tamanho = img.getIconWidth();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getIncX() {
        return incX;
    }

    public void setIncX(double incX) {
        this.incX = incX;
    }

    public double getIncY() {
        return incY;
    }

    public void setIncY(double incY) {
        this.incY = incY;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }
    
    public void desenhar(Graphics g)
    {
        if(img != null)
        {
            g.drawImage(img.getImage(), (int) x, (int) y, null);
        }
    }
    
    public void mover()
    {
        x = x + incX;
        y = y + incY;
        //this.rect.x = x;
        //this.rect.y = y;
    }
}
