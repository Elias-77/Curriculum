
package movimiento;

import java.awt.Image;//para reconocer el uso de imagenes
import java.awt.event.KeyEvent;//para reconocer el uso del teclado
import javax.swing.ImageIcon;//para almacenar imagenes

public class Carro {
    //ATRIBUTOS
    private String carro;
    private int dx;//distancia en x
    private int dy;//"" y
    private int x;//posicion en x
    private int y;//"" y
    private Image imagen;//para guardar el mapa de bits(imagen)
    
    //METODOS
    //CONSTRUCTOR
    public Carro(){
        x = 300;//posicion incial x
        y = 200;//posicion incial y
        carro ="descarga.png";
        ImageIcon ImageIcon = new ImageIcon(this.getClass().getResource(carro)); //esta es una ubicacion que se guarda en la siguiente linea
        imagen = ImageIcon.getImage();//se guarda aqui
    }
    
    //METODO PARA DETECTAR EL TECLADO
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT){
            dx= -1;
        }
        if(key == KeyEvent.VK_RIGHT){
             dx = 1;
        }
        if(key == KeyEvent.VK_UP){
            dy = -1;
        }
        if(key == KeyEvent.VK_DOWN){
            dy = 1;
        }
    }
    //METODO PARA CUANDO SE SUELTE LA TECLA
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT){
            dx= 0;
        }
        if(key == KeyEvent.VK_RIGHT){
             dx = 0;
        }
        if(key == KeyEvent.VK_UP){
            dy = 0;
        }
        if(key == KeyEvent.VK_DOWN){
            dy = 0;
        }
    }
    //METODO PARA MOVER EL OBJETO
    public void mover(){
        x+= dx;
        y+= dy;
    }
    
    //retorno de valores
    public int posicionX(){
        return x;
    }
    public int posiciony(){
        return y;
    }
    public Image returnImagen(){
        return imagen;
    }

}

