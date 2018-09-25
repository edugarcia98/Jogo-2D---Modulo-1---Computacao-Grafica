/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 160011
 */
public class TiroEspecial extends Tiro
{
    @Override
    public void desenhar(Graphics g)
    {
        g.setColor(Color.ORANGE);
        g.fillOval((int) x, (int) y, tamanho, tamanho);
    }
}
