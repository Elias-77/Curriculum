/*Construir un porgrama para una competencia de atletistmo, el programa debe gestionar
una serie de atletas caracterizados por su numero de atleta,nombre y tiempo de carrera,
al final el programa debe mostrar los datos del atleta ganador de la carrera.
*/
package Competencia;

public class Carrera {
    //ATRIBUTOS
    private int numero;
    private float tiempo;
    private String nombre;
    
    //METODOS
    
    //constructor
    public Carrera(String nombre,int numero,float tiempo){
        this.nombre = nombre;
        this.numero = numero;
        this.tiempo = tiempo;
    }

    
    //metodo para retornar el valor ganador
    public float getTiempo(){
        return tiempo;
    }
    
    //metodo para mostrar datos
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nNumero: "+numero+"\nTiempo"+tiempo+"\n";
    }
}
