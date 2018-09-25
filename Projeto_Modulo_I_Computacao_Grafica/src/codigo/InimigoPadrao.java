/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Graphics;

/**
 *
 * @author 160011
 */
public class InimigoPadrao extends Inimigo
{

    public InimigoPadrao(String url) {
        super(url);
    }

    @Override
    public void desenhar(Graphics g) {
        if(img != null)
        {
            g.drawImage(img.getImage(), (int) x, (int) y, null);
        }
    }
}
