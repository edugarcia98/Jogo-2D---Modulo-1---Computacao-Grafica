/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author 160011
 */
public class Aviao extends Base{
    
    private long score;

    public Aviao(String url) 
    {
       super(url);
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }
    
    public void movimento(boolean left, boolean right, boolean top, boolean down, int width, int height)
    {
            if(left)
            {
                if(this.getX() >= 7)
                    this.setIncX(-1);
                else
                    this.setIncX(0);
            }
            else if(right)
            {
                if(this.getX() <= width - (this.getTamanho()) - 7)
                    this.setIncX(1);
                else
                    this.setIncX(0);
            }
            else if(top)
            {
                if(this.getY() >= (height/2) + 50)
                    this.setIncY(-1);
                else
                    this.setIncY(0);
            }
            else if(down)
            {
                if(this.getY() <= height - this.getTamanho() - 5)
                    this.setIncY(1);
                else
                    this.setIncY(0);
            }
            else
            {
                this.setIncX(0);
                this.setIncY(0);
            }
    }
}
