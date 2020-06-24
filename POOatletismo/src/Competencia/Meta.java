package Competencia;

import java.util.Scanner;

public class Meta {
    //clase para buscar el corredor con menor tiempo
    public static int indiceGANADOR(Carrera Competidores[]){
        float tiempo;//variable local
        int j = 0;
        
        //se toma el primer tiempo del corredor 1 papa comparar
        tiempo = Competidores[0].getTiempo();
        for(int i=1;i<Competidores.length;i++){//se busca el tiempo menor del corredor
            if(Competidores[i].getTiempo()< tiempo){//si el tiempo del corredor i es menor al tiempo de competidor[0] 
              j = i;  
            }
        }
        return j;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        float tiempo;
        String nombre;
        int numeroCompetidores, indiceWINNER;
        
        System.out.print("INTRODUZCA LA CANTIDAD DE COMPETIDORES: ");
        numeroCompetidores = entrada.nextInt();
        
        Carrera Competidores[] = new Carrera[numeroCompetidores];//esto es un arreglo de objetos
        //(nombre de la clase "Carrera") + (nombre de vector "Competidores")
        
        for(int i=0;i<Competidores.length;i++){
            entrada.nextLine();
            System.out.println("Escriba el nombre del corredor "+(i+1)+":");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el numero del corredor "+(i+1)+":");
            numero = entrada.nextInt();
            System.out.println("Ingrese el tiempo del corredor "+(i+1)+":");
            tiempo = entrada.nextFloat();
            
            Competidores[i] = new Carrera(nombre,numero,tiempo);
        }
        
        indiceWINNER = indiceGANADOR(Competidores);
        System.out.println("\n EL GANADOR ES: ");
        System.out.println(Competidores[indiceWINNER].mostrarDatos());
        
    }
}
