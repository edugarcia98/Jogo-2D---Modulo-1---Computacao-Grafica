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
public abstract class Inimigo extends Base
{ 
    public Inimigo(String url)
    {
        super(url);
    }
    
    @Override
    public abstract void desenhar(Graphics g);
}
