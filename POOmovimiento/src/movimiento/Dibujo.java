
package movimiento;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JPanel;//PANEL DONDE SE INTRODUCIRA TODO
import javax.swing.Timer;

public class Dibujo extends JPanel implements  ActionListener{
    Carro carro = new Carro();
    Timer timer = new Timer(5,this);
    
    //CONSTRUCTOR 
    public Dibujo(){
        setBackground(Color.CYAN);
        setFocusable(true);
        addKeyListener(new tecla());
        timer.start();
    }
    
    public void paint(Graphics grafica){
       super.paint(grafica);
       Graphics2D g1 = (Graphics2D)grafica;
       g1.drawImage(carro.returnImagen(), carro.posicionX(), carro.posiciony(),null);
    }  
    
    public void actionPerformed(ActionEvent e){
        carro.mover();
        repaint();
    }

    //Clase para llamar a los metodos que registran el uso del teclado
    private class tecla extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
        carro.keyPressed(e);
      }
        public void keyReleased(KeyEvent e){
            carro.keyReleased(e);
        }
    }

    
}
